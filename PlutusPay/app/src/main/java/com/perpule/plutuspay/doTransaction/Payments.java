package com.perpule.plutuspay.doTransaction;

import java.util.List;

public class Payments {
    private String BillingRefNo;
    private String ApprovalCode;
    private String privateHostResponse;
    private String CardNumber;
    private String ExpiryDate;
    private String CardholderName;
    private String CardType;
    private Long InvoiceNumber;
    private Long BatchNumber;
    private String TerminalId;
    private Long LoyaltyPointsAwarded;
    private String Remark;
    private String AcquirerName;
    private String MerchantId;
    private String RetrievalReferenceNumber;
    private Integer CardEntryMode;
    private Integer PrintCardholderName;
    private String MerchantName;
    private String MerchantAddress;
    private String MerchantCity;
    private String PlutusVersion;
    private Integer AcquiringBankCode;
    private Long RewardRedeemedAmount;
    private Double RewardRedeemedPoints;
    private String RewardBalanceAmount;
    private Double RewardBalancePoints;
    private String Field0;
    private String CouponCode;
    private String AmountProcessed;
    private String Field3;
    private String Field4;
    private String TransactionDate;
    private String TransactionTime;
    private Integer PineLabsClientId;
    private Integer PineLabsBatchId;
    private Integer PineLabsRoc;
    private List<AdditionalInfo> additionalInfoList;

    public Payments(String billingRefNo, String approvalCode, String privateHostResponse, String cardNumber, String expiryDate, String cardholderName, String cardType, Long invoiceNumber, Long batchNumber, String terminalId, Long loyaltyPointsAwarded, String remark, String acquirerName, String merchantId, String retrievalReferenceNumber, Integer cardEntryMode, Integer printCardholderName, String merchantName, String merchantAddress, String merchantCity, String plutusVersion, Integer acquiringBankCode, Long rewardRedeemedAmount, Double rewardRedeemedPoints, String rewardBalanceAmount, Double rewardBalancePoints, String field0, String couponCode, String amountProcessed, String field3, String field4, String transactionDate, String transactionTime, Integer pineLabsClientId, Integer pineLabsBatchId, Integer pineLabsRoc, List<AdditionalInfo> additionalInfoList) {
        BillingRefNo = billingRefNo;
        ApprovalCode = approvalCode;
        this.privateHostResponse = privateHostResponse;
        CardNumber = cardNumber;
        ExpiryDate = expiryDate;
        CardholderName = cardholderName;
        CardType = cardType;
        InvoiceNumber = invoiceNumber;
        BatchNumber = batchNumber;
        TerminalId = terminalId;
        LoyaltyPointsAwarded = loyaltyPointsAwarded;
        Remark = remark;
        AcquirerName = acquirerName;
        MerchantId = merchantId;
        RetrievalReferenceNumber = retrievalReferenceNumber;
        CardEntryMode = cardEntryMode;
        PrintCardholderName = printCardholderName;
        MerchantName = merchantName;
        MerchantAddress = merchantAddress;
        MerchantCity = merchantCity;
        PlutusVersion = plutusVersion;
        AcquiringBankCode = acquiringBankCode;
        RewardRedeemedAmount = rewardRedeemedAmount;
        RewardRedeemedPoints = rewardRedeemedPoints;
        RewardBalanceAmount = rewardBalanceAmount;
        RewardBalancePoints = rewardBalancePoints;
        Field0 = field0;
        CouponCode = couponCode;
        AmountProcessed = amountProcessed;
        Field3 = field3;
        Field4 = field4;
        TransactionDate = transactionDate;
        TransactionTime = transactionTime;
        PineLabsClientId = pineLabsClientId;
        PineLabsBatchId = pineLabsBatchId;
        PineLabsRoc = pineLabsRoc;
        this.additionalInfoList = additionalInfoList;
    }

    public String getBillingRefNo() {
        return BillingRefNo;
    }

    public void setBillingRefNo(String billingRefNo) {
        BillingRefNo = billingRefNo;
    }

    public String getApprovalCode() {
        return ApprovalCode;
    }

    public void setApprovalCode(String approvalCode) {
        ApprovalCode = approvalCode;
    }

    public String getPrivateHostResponse() {
        return privateHostResponse;
    }

    public void setPrivateHostResponse(String privateHostResponse) {
        this.privateHostResponse = privateHostResponse;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getCardholderName() {
        return CardholderName;
    }

    public void setCardholderName(String cardholderName) {
        CardholderName = cardholderName;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public Long getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        InvoiceNumber = invoiceNumber;
    }

    public Long getBatchNumber() {
        return BatchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        BatchNumber = batchNumber;
    }

    public String getTerminalId() {
        return TerminalId;
    }

    public void setTerminalId(String terminalId) {
        TerminalId = terminalId;
    }

    public Long getLoyaltyPointsAwarded() {
        return LoyaltyPointsAwarded;
    }

    public void setLoyaltyPointsAwarded(Long loyaltyPointsAwarded) {
        LoyaltyPointsAwarded = loyaltyPointsAwarded;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getAcquirerName() {
        return AcquirerName;
    }

    public void setAcquirerName(String acquirerName) {
        AcquirerName = acquirerName;
    }

    public String getMerchantId() {
        return MerchantId;
    }

    public void setMerchantId(String merchantId) {
        MerchantId = merchantId;
    }

    public String getRetrievalReferenceNumber() {
        return RetrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        RetrievalReferenceNumber = retrievalReferenceNumber;
    }

    public Integer getCardEntryMode() {
        return CardEntryMode;
    }

    public void setCardEntryMode(Integer cardEntryMode) {
        CardEntryMode = cardEntryMode;
    }

    public Integer getPrintCardholderName() {
        return PrintCardholderName;
    }

    public void setPrintCardholderName(Integer printCardholderName) {
        PrintCardholderName = printCardholderName;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public String getMerchantAddress() {
        return MerchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        MerchantAddress = merchantAddress;
    }

    public String getMerchantCity() {
        return MerchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        MerchantCity = merchantCity;
    }

    public String getPlutusVersion() {
        return PlutusVersion;
    }

    public void setPlutusVersion(String plutusVersion) {
        PlutusVersion = plutusVersion;
    }

    public Integer getAcquiringBankCode() {
        return AcquiringBankCode;
    }

    public void setAcquiringBankCode(Integer acquiringBankCode) {
        AcquiringBankCode = acquiringBankCode;
    }

    public Long getRewardRedeemedAmount() {
        return RewardRedeemedAmount;
    }

    public void setRewardRedeemedAmount(Long rewardRedeemedAmount) {
        RewardRedeemedAmount = rewardRedeemedAmount;
    }

    public Double getRewardRedeemedPoints() {
        return RewardRedeemedPoints;
    }

    public void setRewardRedeemedPoints(Double rewardRedeemedPoints) {
        RewardRedeemedPoints = rewardRedeemedPoints;
    }

    public String getRewardBalanceAmount() {
        return RewardBalanceAmount;
    }

    public void setRewardBalanceAmount(String rewardBalanceAmount) {
        RewardBalanceAmount = rewardBalanceAmount;
    }

    public Double getRewardBalancePoints() {
        return RewardBalancePoints;
    }

    public void setRewardBalancePoints(Double rewardBalancePoints) {
        RewardBalancePoints = rewardBalancePoints;
    }

    public String getField0() {
        return Field0;
    }

    public void setField0(String field0) {
        Field0 = field0;
    }

    public String getCouponCode() {
        return CouponCode;
    }

    public void setCouponCode(String couponCode) {
        CouponCode = couponCode;
    }

    public String getAmountProcessed() {
        return AmountProcessed;
    }

    public void setAmountProcessed(String amountProcessed) {
        AmountProcessed = amountProcessed;
    }

    public String getField3() {
        return Field3;
    }

    public void setField3(String field3) {
        Field3 = field3;
    }

    public String getField4() {
        return Field4;
    }

    public void setField4(String field4) {
        Field4 = field4;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        TransactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return TransactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        TransactionTime = transactionTime;
    }

    public Integer getPineLabsClientId() {
        return PineLabsClientId;
    }

    public void setPineLabsClientId(Integer pineLabsClientId) {
        PineLabsClientId = pineLabsClientId;
    }

    public Integer getPineLabsBatchId() {
        return PineLabsBatchId;
    }

    public void setPineLabsBatchId(Integer pineLabsBatchId) {
        PineLabsBatchId = pineLabsBatchId;
    }

    public Integer getPineLabsRoc() {
        return PineLabsRoc;
    }

    public void setPineLabsRoc(Integer pineLabsRoc) {
        PineLabsRoc = pineLabsRoc;
    }

    public List<AdditionalInfo> getAdditionalInfoList() {
        return additionalInfoList;
    }

    public void setAdditionalInfoList(List<AdditionalInfo> additionalInfoList) {
        this.additionalInfoList = additionalInfoList;
    }
}