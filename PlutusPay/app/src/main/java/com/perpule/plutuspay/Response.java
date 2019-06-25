package com.perpule.plutuspay;

public class Response {
    private String ResponseCode;
    private String ResponseMsg;


    public  Response() {
        ResponseCode = null;
        ResponseMsg = null;
    }
    public Response(String responseCode, String responseMsg) {
        ResponseCode = responseCode;
        ResponseMsg = responseMsg;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }
    public String getResponseMsg() {
        return ResponseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        ResponseMsg = responseMsg;
    }
}
