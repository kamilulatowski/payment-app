package pl.whirly.recruitment.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.whirly.recruitment.payment.client.ChargeClient;
import pl.whirly.recruitment.payment.client.UserContextClient;
import pl.whirly.recruitment.payment.model.Payment;
import pl.whirly.recruitment.payment.model.User;

@Service
public class PaymentService {

   @Autowired
   private ChargeClient chargeClient;
   @Autowired
   private UserContextClient userContextClient;

   public void processPayment(Payment payment) {
      userContextClient.getUserById(payment.getUserId());
      chargeClient.chargeUserForPayment(payment);
   }

}
