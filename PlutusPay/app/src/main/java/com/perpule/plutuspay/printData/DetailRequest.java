package com.perpule.plutuspay.printData;

import com.google.gson.annotations.SerializedName;


import java.util.List;

public class DetailRequest {

    //private String PrintRefno;
    //private Boolean SavePrintData;
    @SerializedName("OperationType")
    private Integer OperationType;

    private String PrintRefno;
    private Boolean SavePrintData;

    @SerializedName("Data")
    private List<Data> data;

    public void setOperationType(Integer operationType) {
        OperationType = operationType;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public void setPrintRefno(String printRefno) {
        PrintRefno = printRefno;
    }

    public void setSavePrintData(Boolean savePrintData) {
        SavePrintData = savePrintData;
    }
}