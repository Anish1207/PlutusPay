package com.perpule.plutuspay.settlement;

import java.util.List;

public class Response {

    private List<SettlementSummary> settlementSummary;
    private List<SettlementInfo> settlementInfo;
    private List<AdditionalInfo> additionalInfo;

    public Response(List<SettlementSummary> settlementSummary,List<SettlementInfo> settlementInfo, List<AdditionalInfo> additionalInfo){
        this.settlementSummary = settlementSummary;
        this.settlementInfo = settlementInfo;
        this.additionalInfo = additionalInfo;
    }


    public List<SettlementSummary> getSettlementSummary() {
        return settlementSummary;
    }
    public void setSettlementSummary(List<SettlementSummary> settlementSummary) {
        this.settlementSummary = settlementSummary;
    }


    public List<SettlementInfo> getSettlementInfo() {
        return settlementInfo;
    }
    public void setSettlementInfo(List<SettlementInfo> settlementInfo){
        this.settlementInfo = settlementInfo;
    }


    public List<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }
    public void setAdditionalInfo(List<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


}
