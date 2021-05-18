package pl.whirly.recruitment.charge.service;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.charge.model.ChargeOrder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Do not change
@Service
public class ChargeService {

   private final List<String> alreadyChargedIds = Collections.synchronizedList(new LinkedList<>());

   public ChargeResult processCharge(ChargeOrder chargeOrder) {
      if(alreadyChargedIds.contains(chargeOrder.getId())) {
         System.out.println("Charge already processed");
         return ChargeResult.ALREADY_CHARGED;
      }
      //charging...
      alreadyChargedIds.add(chargeOrder.getId());
      System.out.println("Charge processed");
      return ChargeResult.SUCCESS;
   }
}


enum ChargeResult {
   ALREADY_CHARGED, SUCCESS
}
