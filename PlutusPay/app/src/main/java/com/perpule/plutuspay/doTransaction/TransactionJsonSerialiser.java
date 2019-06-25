package com.perpule.plutuspay.doTransaction;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class TransactionJsonSerialiser implements JsonSerializer<Request> {

    @Override
    public JsonElement serialize(Request req, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add("Header", context.serialize(req.getHeader()));
        object.add("Detail", context.serialize(req.getDetail()));
        return object;
    }
}
