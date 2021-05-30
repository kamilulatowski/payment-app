package pl.whirly.recruitment.payment.model;

import java.math.BigDecimal;

public class ChargeOrder {

   private String id;
   private String userId;
   private BigDecimal amountNet;
   private String currency;

   public ChargeOrder(String userId, BigDecimal amountNet, String currency) {
      this.userId = userId;
      this.amountNet = amountNet;
      this.currency = currency;
   }

   public String getId() {
      return id;
   }

   public String getUserId() {
      return userId;
   }

   public BigDecimal getAmountNet() {
      return amountNet;
   }

   public String getCurrency() {
      return currency;
   }
}
