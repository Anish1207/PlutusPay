package com.perpule.plutuspay.doTransaction;

import com.perpule.plutuspay.Header;

public class Request {

    private Header header;

    private DetailRequest detail;

    public Request() {
    }

    public Request(Header header, DetailRequest detailRequest) {
        this.header = header;
        this.detail = detailRequest;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public DetailRequest getDetail() {
        return detail;
    }

    public void setDetail(DetailRequest detailRequest) {
        this.detail = detailRequest;
    }
}


