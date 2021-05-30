package pl.whirly.recruitment.charge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChargeOrder {

   private String id;
   private String userId;
   private BigDecimal amountNet;
   private String currency;
}
