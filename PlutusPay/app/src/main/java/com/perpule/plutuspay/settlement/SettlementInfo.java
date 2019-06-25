package com.perpule.plutuspay.settlement;

class SettlementInfo {

    private String Key;
    private String Value;

    public SettlementInfo (String key, String value) {
        Key = key;
        Value = value;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
