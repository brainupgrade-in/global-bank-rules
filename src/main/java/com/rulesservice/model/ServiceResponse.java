package com.rulesservice.model;
//The output format for serviceCharges
public class ServiceResponse {
   private String message;
   private long accountId;
   private Double balance;

   public String getMessage() {
      return this.message;
   }

   public long getAccountId() {
      return this.accountId;
   }

   public Double getBalance() {
      return this.balance;
   }

   public void setMessage(final String message) {
      this.message = message;
   }

   public void setAccountId(final long accountId) {
      this.accountId = accountId;
   }

   public void setBalance(final Double balance) {
      this.balance = balance;
   }

   public ServiceResponse() {
   }

   public ServiceResponse(final String message, final long accountId, final Double balance) {
      this.message = message;
      this.accountId = accountId;
      this.balance = balance;
   }
}
