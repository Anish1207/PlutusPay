package com.perpule.plutuspay.printData;

import com.perpule.plutuspay.Header;

public class Request {

    private Header Header;

    private com.perpule.plutuspay.printData.DetailRequest Detail;

    public Request() {
    }

    public Request(Header header, com.perpule.plutuspay.printData.DetailRequest detailRequest) {
        this.Header = header;
        this.Detail = detailRequest;
    }

    public Header getHeader() {
        return Header;
    }

    public void setHeader(Header header) {
        this.Header = header;
    }

    public com.perpule.plutuspay.printData.DetailRequest getDetail() {
        return Detail;
    }

    public void setDetail(DetailRequest detailRequest) {
        this.Detail = detailRequest;
    }
}


