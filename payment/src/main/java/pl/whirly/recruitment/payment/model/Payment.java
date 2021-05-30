package pl.whirly.recruitment.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {

   private String id;
   private String userId;
   private String productId;
   private double amountGross;
   private String currency;

   @Override
   public int hashCode() {
      Random random = new Random();
      return random.nextInt();
   }
}
