package com.perpule.plutuspay;

public class Header {

   private String ApplicationId;

   private String UserId;

   private String MethodId;

   private String VersionNo;

   public Header() {
   }

   public Header(String applicationId, String userId, String methodId, String versionNo) {
       ApplicationId = applicationId;
       UserId = userId;
       MethodId = methodId;
       VersionNo = versionNo;
   }

   public String getApplicationId() {
       return ApplicationId;
   }

   public void setApplicationId(String applicationId) {
       ApplicationId = applicationId;
   }

   public String getUserId() {
       return UserId;
   }

   public void setUserId(String userId) {
       UserId = userId;
   }

   public String getMethodId() {
       return MethodId;
   }

   public void setMethodId(String methodId) {
       MethodId = methodId;
   }

   public String getVersionNo() {
       return VersionNo;
   }

   public void setVersionNo(String versionNo) {
       VersionNo = versionNo;
   }


}
