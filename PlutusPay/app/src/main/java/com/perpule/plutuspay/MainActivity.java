package com.perpule.plutuspay;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.perpule.plutuspay.doTransaction.DetailRequest;
import com.perpule.plutuspay.doTransaction.Products;
import com.perpule.plutuspay.doTransaction.Response;
import com.perpule.plutuspay.doTransaction.TransactionJsonSerialiser;
import com.perpule.plutuspay.doTransaction.Request;
import com.perpule.plutuspay.printData.Data;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String PLUTUS_SMART_ACTION = "com.pinelabs.masterapp.SERVER";
    private static final String PLUTUS_SMART_PACKAGE ="com.pinelabs.masterapp";
    private static final int MESSAGE_CODE = 1001;
    private static final String BILLING_REQUEST_TAG = "MASTERAPPREQUEST";
    private static final String BILLING_RESPONSE_TAG = "MASTERAPPRESPONSE";

    private Messenger mServerMessage;
    private boolean isBound=false;
    private Integer methodId;



    Button sale;
    Button print;
    EditText txtAmt;
    Response TransactionResponse;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startPinelabService();
        //txtprint=findViewById(R.id.txtprint);

        txtAmt=findViewById(R.id.txtAmt);
        txtAmt.setVisibility(View.VISIBLE);
        sale = findViewById(R.id.btn_sale);
        sale.setVisibility(View.VISIBLE);

        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isBound) {
                    txtAmt.setVisibility(View.GONE);
                    sale.setVisibility(View.GONE);
                    methodId=1001;
                    startMessenger(requestAPI(methodId));
                } else  {
                    Toast.makeText(MainActivity.this,"Service not bound",Toast.LENGTH_SHORT).show();
                    // Handle Error
                }
            }
        });
        
        print =findViewById(R.id.btn_printdata);
        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isBound) {
                    methodId=1002;
                    startMessenger(requestAPI(methodId));
                } else  {
                    Toast.makeText(MainActivity.this,"Service not bound",Toast.LENGTH_SHORT).show();
                    // Handle Error
                }//CODE FOR START MESSENGER TO PRINT DATA API
            }
        });


        findViewById(R.id.btn_settlement).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isBound) {
                    startMessenger(requestAPI(1003));
                } else  {
                    Toast.makeText(MainActivity.this,"Service not bound",Toast.LENGTH_SHORT).show();
                    // Handle Error
                }
                //CODE FOR START MESSENGER TO SETTLEMENT API
            }
        });
        findViewById(R.id.btn_getTerminalInfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isBound) {
                    startMessenger(requestAPI(1004));
                } else  {
                    Toast.makeText(MainActivity.this,"Service not bound",Toast.LENGTH_SHORT).show();
                    // Handle Error
                }
                //CODE FOR START MESSENGER TO GET TERMINAL INFO API
            }
        });

    }





    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            mServerMessage = new Messenger(service);
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mServerMessage = null;
            isBound = false;
        }
    };

    void startPinelabService() {

        Intent intent = new Intent();
        intent.setAction(PLUTUS_SMART_ACTION);
        intent.setPackage(PLUTUS_SMART_PACKAGE);
        bindService(intent, connection, BIND_AUTO_CREATE);
    }


    private void startMessenger(String value) {
        Message message = Message.obtain(null, MESSAGE_CODE);
        Bundle bundle = new Bundle();
        bundle.putString(BILLING_REQUEST_TAG, value);
        message.setData(bundle);
        try {
            message.replyTo = new Messenger(new IncomingHandler());
            Log.i("msg", message.toString());
            mServerMessage.send(message);
        } catch (RemoteException e){
            e.printStackTrace();
        }
    }

    private class IncomingHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            String value = bundle.getString(BILLING_RESPONSE_TAG);
            Log.i("response", value);
            if(methodId==1001){
                TransactionResponse = new Gson().fromJson(value,Response.class);
                if (TransactionResponse.getResponse().getResponseMsg().equalsIgnoreCase("APPROVED")){
                    Toast.makeText(MainActivity.this,"SUCCESSFUL",Toast.LENGTH_LONG).show();
                    print.setVisibility(View.VISIBLE);
                }

                else {
                    Toast.makeText(MainActivity.this,"FAILED",Toast.LENGTH_LONG).show();
                }

            }
        }

    }



    private String requestAPI(int methodID){

        Header header = new Header();
        header.setApplicationId("2658eac8-84db-4989-8236-2144a045ecfa");
        header.setUserId("com.perpule.plutuspay");
        header.setVersionNo("1.0");

        String ret;
        switch(methodID)
        {
            case 1000:
                Toast.makeText(MainActivity.this,"Choose an API",Toast.LENGTH_SHORT).show();
                break;
            case 1001:

                header.setMethodId("1001");

                DetailRequest detail= new DetailRequest();
                detail.setTransactionType(4001);
                detail.setBillingRefNo("TXN12345678");
                detail.setPaymentAmount((long)Float.parseFloat(txtAmt.getText().toString())*100);
                detail.setIsSwipe(false);


                Products product1 = new Products("PROD1001", "Milk", 2 ,5000,4000,0,4000,null);
                List<Products> products = new ArrayList<Products>();
                products.add(product1);
                detail.setProducts(products);


                Request request = new Request();
                request.setDetail(detail);
                request.setHeader(header);

                ret =new GsonBuilder().registerTypeAdapter(Request.class, new TransactionJsonSerialiser()).create().toJson(request);
                Log.i("req",ret);
                return ret;


            case 1002:

                header.setMethodId("1002");

                com.perpule.plutuspay.printData.Request req= new com.perpule.plutuspay.printData.Request();
                Data data1 = new Data("0",24,true,"","0","0");
                Data data2 = new Data("0",24,false,
                        "Invoice no. : " + TransactionResponse.getDetailResponse().getInvoiceNumber().toString()
                        + "\nApprovalCode : " + TransactionResponse.getDetailResponse().getApprovalCode()
                        + "\nBilling Ref No. : " + TransactionResponse.getDetailResponse().getBillingRefNo()
                        + "\nDate : " + TransactionResponse.getDetailResponse().getTransactionDate()
                        + "\nTime : " + TransactionResponse.getDetailResponse().getTransactionTime()
                        + "\nCustomerName : " + TransactionResponse.getDetailResponse().getCardholderName()
                        ,"0","0");
                //Data data2 = new Data("2",24,true,"","","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");

                Data data3 = new Data("0",24,true,"\n\n\n\n\n\n","0","0");


                List<Data> Data= new ArrayList<Data>();
                Data.add(data1);
                Data.add(data2);
                Data.add(data3);

                com.perpule.plutuspay.printData.DetailRequest detailprint =new com.perpule.plutuspay.printData.DetailRequest();
                detailprint.setOperationType(1012);
                detailprint.setData(Data);
                detailprint.setPrintRefno("123456789");
                detailprint.setSavePrintData(true);

                req.setHeader(header);
                req.setDetail(detailprint);

                ret =new Gson().toJson(req);
                Log.i("req",ret);
                return ret;
            case 1003:
                header.setMethodId("1003");
                Toast.makeText(MainActivity.this,"Sent Settlement request",Toast.LENGTH_SHORT).show();
                ret =new Gson().toJson(header);
                Log.i("req",ret);
                return ret;
            case 1004:
                header.setMethodId("1004");
                Toast.makeText(MainActivity.this,"Sent Terminal Info request",Toast.LENGTH_SHORT).show();
                ret =new Gson().toJson(header);
                Log.i("req",ret);
                return ret;
            default:
                Toast.makeText(MainActivity.this,"ERROR in api chosen",Toast.LENGTH_SHORT).show();
                break;
        }

        return null;
    }

    /*
    private void ResponseAPI(String responseData){
        switch(MsgCode){
            case 1000:
                Toast.makeText(MainActivity.this,"Choose an API",Toast.LENGTH_SHORT).show();
                break;
            case 1001:
                //converrt received json to above class type
                Gson json = new Gson();
                String a = responseData;
                String billrefno = json.fromJson(responseData, com.perpule.plutuspay.doTransaction.Response.class).getDetailResponse().getPayments().get(0).getBillingRefNo();
                TextView text= findViewById(R.id.output);
                text.setText(billrefno);
                break;
            case 1002:
                Toast.makeText(MainActivity.this,"Not configured API",Toast.LENGTH_SHORT).show();
                break;
            case 1003:
                Toast.makeText(MainActivity.this,"Nothing to respond",Toast.LENGTH_SHORT).show();
                break;
            case 1004:
                Toast.makeText(MainActivity.this,"Nothing to respond",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this,"Nothing to respond",Toast.LENGTH_SHORT).show();
                break;
        }
    }
*/

}
