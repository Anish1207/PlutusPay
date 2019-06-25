package com.perpule.plutuspay.doTransaction;

import java.util.List;

public class DetailResponse {
    private List<Payments> payments;
    private AdditionalInfo additionalInfo;

    public DetailResponse() {
    }

    public DetailResponse(List<Payments> payments, AdditionalInfo additionalInfo) {
        this.payments = payments;
        this.additionalInfo = additionalInfo;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}

