package com.perpule.plutuspay.settlement;

class SettlementSummary {

    private String BatchName;
    private String AcquirerCode;
    private String TID;
    private String MID;
    private long CreditCount;
    private long CreditAmount;
    private long DebitCount;
    private long DebitAmount;

    public SettlementSummary (String batchName, String acquirerCode, String tID, String mID, long creditCount, long creditAmount, long debitCount, long debitAmount){
        BatchName = batchName;
        AcquirerCode = acquirerCode;
        TID = tID;
        MID = mID;
        CreditCount = creditCount;
        CreditAmount = creditAmount;
        DebitCount = debitCount;
        DebitAmount = debitAmount;
    }

    public String getBatchName() {
        return BatchName;
    }

    public void setBatchName(String batchName) {
        BatchName = batchName;
    }

    public String getAcquirerCode() {
        return AcquirerCode;
    }

    public void setAcquirerCode(String acquirerCode) {
        AcquirerCode = acquirerCode;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public long getCreditCount() {
        return CreditCount;
    }

    public void setCreditCount(long creditCount) {
        CreditCount = creditCount;
    }

    public long getCreditAmount() {
        return CreditAmount;
    }

    public void setCreditAmount(long creditAmount) {
        CreditAmount = creditAmount;
    }

    public long getDebitCount() {
        return DebitCount;
    }

    public void setDebitCount(long debitCount) {
        DebitCount = debitCount;
    }

    public long getDebitAmount() {
        return DebitAmount;
    }

    public void setDebitAmount(long debitAmount) {
        DebitAmount = debitAmount;
    }

}
