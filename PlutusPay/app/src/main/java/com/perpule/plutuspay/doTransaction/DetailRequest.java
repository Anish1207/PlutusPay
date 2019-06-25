package com.perpule.plutuspay.doTransaction;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetailRequest {

    private long TransactionType;
    private String BillingRefNo;
    private Long PaymentAmount;

    @SerializedName("IsSwipe")
    private Boolean IsSwipe;


    /*
    private String BankCode;
    private String CardNumber;
    private String Expiry;
    private String InvoiceNo;
    private boolean IsSwipe;
    private String Field0;
    private String Field1;
    private String Field2;
    private String Field3;
    private int BatchNo;
    private int Roc;
    private long TransactionLogId;
    private long RewardAmount;
    private String CustomerMobileNumber;
    private String CustomerEmailId;
    private String MerchantMobileNumber;
    private String MerchantEmailId;
    private boolean ConsentCustomerMobile;
    private boolean ConsentCustomerEmailId;
    private boolean ConsentMerchantMobile;
    private boolean ConsentMerchantEmailId;
    private long WalletProgramId;
    private String CurrencyId;
    */

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    private List<Products> products;

    //private AdditionalInfo additionalInfo;

    public DetailRequest() {
    }


    public long getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(long transactionType) {
        TransactionType = transactionType;
    }

    public String getBillingRefNo() {
        return BillingRefNo;
    }

    public void setBillingRefNo(String billingRefNo) {
        BillingRefNo = billingRefNo;
    }

    public Long getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        PaymentAmount = paymentAmount;
    }

    public void setIsSwipe(Boolean isSwipe) {
        IsSwipe = isSwipe;
    }
}

//    public DetailRequest(long transactionType, String billingRefNo, String paymentAmount, String bankCode, String cardNumber, String expiry, String invoiceNo, boolean isSwipe, String field0, String field1, String field2, String field3, int batchNo, int roc, long transactionLogId, long rewardAmount, String customerMobileNumber, String customerEmailId, String merchantMobileNumber, String merchantEmailId, boolean consentCustomerMobile, boolean consentCustomerEmailId, boolean consentMerchantMobile, boolean consentMerchantEmailId, long walletProgramId, String currencyId, List<Products> products, AdditionalInfo additionalInfo) {
//        TransactionType = transactionType;
//        BillingRefNo = billingRefNo;
//        PaymentAmount = paymentAmount;
//        BankCode = bankCode;
//        CardNumber = cardNumber;
//        Expiry = expiry;
//        InvoiceNo = invoiceNo;
//        IsSwipe = isSwipe;
//        Field0 = field0;
//        Field1 = field1;
//        Field2 = field2;
//        Field3 = field3;
//        BatchNo = batchNo;'
//        Roc = roc;
//        TransactionLogId = transactionLogId;
//        RewardAmount = rewardAmount;
//        CustomerMobileNumber = customerMobileNumber;
//        CustomerEmailId = customerEmailId;
//        MerchantMobileNumber = merchantMobileNumber;
//        MerchantEmailId = merchantEmailId;
//        ConsentCustomerMobile = consentCustomerMobile;
//        ConsentCustomerEmailId = consentCustomerEmailId;
//        ConsentMerchantMobile = consentMerchantMobile;
//        ConsentMerchantEmailId = consentMerchantEmailId;
//        WalletProgramId = walletProgramId;
//        CurrencyId = currencyId;
//        this.products = products;
//        this.additionalInfo = additionalInfo;
//    }
//
//    public long getTransactionType() {
//        return TransactionType;
//    }
//
//    public void setTransactionType(long transactionType) {
//        TransactionType = transactionType;
//    }
//
//    public String getBillingRefNo() {
//        return BillingRefNo;
//    }
//
//    public void setBillingRefNo(String billingRefNo) {
//        BillingRefNo = billingRefNo;
//    }
//
//    public String getPaymentAmount() {
//        return PaymentAmount;
//    }
//
//    public void setPaymentAmount(String paymentAmount) {
//        PaymentAmount = paymentAmount;
//    }
//
//    public String getBankCode() {
//        return BankCode;
//    }
//
//    public void setBankCode(String bankCode) {
//        BankCode = bankCode;
//    }
//
//    public String getCardNumber() {
//        return CardNumber;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        CardNumber = cardNumber;
//    }
//
//    public String getExpiry() {
//        return Expiry;
//    }
//
//    public void setExpiry(String expiry) {
//        Expiry = expiry;
//    }
//
//    public String getInvoiceNo() {
//        return InvoiceNo;
//    }
//
//    public void setInvoiceNo(String invoiceNo) {
//        InvoiceNo = invoiceNo;
//    }
//
//    public boolean isSwipe() {
//        return IsSwipe;
//    }
//
//    public void setSwipe(boolean swipe) {
//        IsSwipe = swipe;
//    }
//
//    public String getField0() {
//        return Field0;
//    }
//
//    public void setField0(String field0) {
//        Field0 = field0;
//    }
//
//    public String getField1() {
//        return Field1;
//    }
//
//    public void setField1(String field1) {
//        Field1 = field1;
//    }
//
//    public String getField2() {
//        return Field2;
//    }
//
//    public void setField2(String field2) {
//        Field2 = field2;
//    }
//
//    public String getField3() {
//        return Field3;
//    }
//
//    public void setField3(String field3) {
//        Field3 = field3;
//    }
//
//    public int getBatchNo() {
//        return BatchNo;
//    }
//
//    public void setBatchNo(int batchNo) {
//        BatchNo = batchNo;
//    }
//
//    public int getRoc() {
//        return Roc;
//    }
//
//    public void setRoc(int roc) {
//        Roc = roc;
//    }
//
//    public long getTransactionLogId() {
//        return TransactionLogId;
//    }
//
//    public void setTransactionLogId(long transactionLogId) {
//        TransactionLogId = transactionLogId;
//    }
//
//    public long getRewardAmount() {
//        return RewardAmount;
//    }
//
//    public void setRewardAmount(long rewardAmount) {
//        RewardAmount = rewardAmount;
//    }
//
//    public String getCustomerMobileNumber() {
//        return CustomerMobileNumber;
//    }
//
//    public void setCustomerMobileNumber(String customerMobileNumber) {
//        CustomerMobileNumber = customerMobileNumber;
//    }
//
//    public String getCustomerEmailId() {
//        return CustomerEmailId;
//    }
//
//    public void setCustomerEmailId(String customerEmailId) {
//        CustomerEmailId = customerEmailId;
//    }
//
//    public String getMerchantMobileNumber() {
//        return MerchantMobileNumber;
//    }
//
//    public void setMerchantMobileNumber(String merchantMobileNumber) {
//        MerchantMobileNumber = merchantMobileNumber;
//    }
//
//    public String getMerchantEmailId() {
//        return MerchantEmailId;
//    }
//
//    public void setMerchantEmailId(String merchantEmailId) {
//        MerchantEmailId = merchantEmailId;
//    }
//
//    public boolean isConsentCustomerMobile() {
//        return ConsentCustomerMobile;
//    }
//
//    public void setConsentCustomerMobile(boolean consentCustomerMobile) {
//        ConsentCustomerMobile = consentCustomerMobile;
//    }
//
//    public boolean isConsentCustomerEmailId() {
//        return ConsentCustomerEmailId;
//    }
//
//    public void setConsentCustomerEmailId(boolean consentCustomerEmailId) {
//        ConsentCustomerEmailId = consentCustomerEmailId;
//    }
//
//    public boolean isConsentMerchantMobile() {
//        return ConsentMerchantMobile;
//    }
//
//    public void setConsentMerchantMobile(boolean consentMerchantMobile) {
//        ConsentMerchantMobile = consentMerchantMobile;
//    }
//
//    public boolean isConsentMerchantEmailId() {
//        return ConsentMerchantEmailId;
//    }
//
//    public void setConsentMerchantEmailId(boolean consentMerchantEmailId) {
//        ConsentMerchantEmailId = consentMerchantEmailId;
//    }
//
//    public long getWalletProgramId() {
//        return WalletProgramId;
//    }
//
//    public void setWalletProgramId(long walletProgramId) {
//        WalletProgramId = walletProgramId;
//    }
//
//    public String getCurrencyId() {
//        return CurrencyId;
//    }
//
//    public void setCurrencyId(String currencyId) {
//        CurrencyId = currencyId;
//    }
//
//    public List<Products> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Products> products) {
//        this.products = products;
//    }
//
//    public AdditionalInfo getAdditionalInfo() {
//        return additionalInfo;
//    }
//
//    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
//        this.additionalInfo = additionalInfo;
//    }
//}
