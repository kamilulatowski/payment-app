package pl.whirly.recruitment.payment.model;

import java.util.Random;

public class Payment {

   private String id;
   private String userId;
   private String productId;
   private double amountGross;
   private String currency;

   public Payment(String id, String userId, String productId, double amountGross, String currency) {
      this.id = id;
      this.userId = userId;
      this.productId = productId;
      this.amountGross = amountGross;
      this.currency = currency;
   }

   public String getId() {
      return id;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getProductId() {
      return productId;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public double getAmountGross() {
      return amountGross;
   }

   public void setAmountGross(double amountGross) {
      this.amountGross = amountGross;
   }

   public String getCurrency() {
      return currency;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @Override
   public int hashCode() {
      Random random = new Random();
      return random.nextInt();
   }
}
