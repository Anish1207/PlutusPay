package com.perpule.plutuspay.printData;

import com.perpule.plutuspay.Header;
import com.perpule.plutuspay.doTransaction.DetailResponse;

public class Response {

    private Header header;
    private com.perpule.plutuspay.Response response;
    private DetailResponse detailResponse;


    public Response() {
    }

    public Response(Header header, com.perpule.plutuspay.Response response, DetailResponse detailResponse) {
        this.header = header;
        this.response = response;
        this.detailResponse = detailResponse;

    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public com.perpule.plutuspay.Response getResponse() {
        return response;
    }

    public void setResponse(com.perpule.plutuspay.Response response) {
        this.response = response;
    }

    public DetailResponse getDetailResponse() {
        return detailResponse;
    }

    public void setDetailResponse(DetailResponse detailResponse) {
        this.detailResponse = detailResponse;
    }


}
