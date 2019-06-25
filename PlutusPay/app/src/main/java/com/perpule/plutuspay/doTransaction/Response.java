package com.perpule.plutuspay.doTransaction;

import com.google.gson.annotations.SerializedName;
import com.perpule.plutuspay.Header;

public class Response {

    @SerializedName("Response")
    private com.perpule.plutuspay.Response response;

    @SerializedName("Detail")
    private Payments detailResponse;


    public Response() {
    }




    public com.perpule.plutuspay.Response getResponse() {
        return response;
    }

    public void setResponse(com.perpule.plutuspay.Response response) {
        this.response = response;
    }

    public Payments getDetailResponse() {
        return detailResponse;
    }

    public void setDetailResponse(Payments detailResponse) {
        this.detailResponse = detailResponse;
    }


}
