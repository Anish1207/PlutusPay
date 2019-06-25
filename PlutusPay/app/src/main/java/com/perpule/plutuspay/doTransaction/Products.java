package com.perpule.plutuspay.doTransaction;

import java.util.List;

public class Products {

    private String ProductId;
    private String ProductName;
    private long Quantity;
    private long ListPrice;
    private long Amount;
    private long Discount;
    private long DiscountedAmount;
    private List<ProductInfo> productInfo;

    public Products(String productId, String productName, long quantity, long listPrice, long amount, long discount, long discountedAmount, List<ProductInfo> productInfo) {
        ProductId = productId;
        ProductName = productName;
        Quantity = quantity;
        ListPrice = listPrice;
        Amount = amount;
        Discount = discount;
        DiscountedAmount = discountedAmount;
        this.productInfo = productInfo;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public long getQuantity() {
        return Quantity;
    }

    public void setQuantity(long quantity) {
        Quantity = quantity;
    }

    public long getListPrice() {
        return ListPrice;
    }

    public void setListPrice(long listPrice) {
        ListPrice = listPrice;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public long getDiscount() {
        return Discount;
    }

    public void setDiscount(long discount) {
        Discount = discount;
    }

    public long getDiscountedAmount() {
        return DiscountedAmount;
    }

    public void setDiscountedAmount(long discountedAmount) {
        DiscountedAmount = discountedAmount;
    }

    public List<ProductInfo> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
    }
}
