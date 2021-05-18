package pl.whirly.recruitment.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
   String id;
   String userId;
   String productId;
   double amountGross;

   @Override
   public int hashCode() {
      Random random = new Random();
      return random.nextInt();
   }
}
