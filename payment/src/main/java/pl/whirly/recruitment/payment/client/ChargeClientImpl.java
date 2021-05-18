package pl.whirly.recruitment.payment.client;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.whirly.recruitment.payment.model.Payment;

@Service
@Profile("!disable-user-context-client")
public class ChargeClientImpl implements ChargeClient {

   @Override
   public Payment chargeUserForPayment(Payment payment) {
      // TODO implement client logic
      return payment;
   }
}
