package pl.whirly.recruitment.payment.client;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.whirly.recruitment.payment.model.Payment;

@Service
@Profile("disable-charge-client")
public class MockChargeClient implements ChargeClient {
   @Override
   public Payment chargeUserForPayment(Payment payment) {
      return payment;
   }
}
