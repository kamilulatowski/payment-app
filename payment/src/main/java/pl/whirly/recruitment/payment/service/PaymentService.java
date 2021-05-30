package pl.whirly.recruitment.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

   @Value("${taxRate}")
   private String TAX_RATE;

   public void processPayment(Payment payment) {
      userContextClient.getUserById(payment.getUserId());
      double tax = Double.parseDouble(TAX_RATE) / 100;
      double amountGrossNetto = payment.getAmountGross() * (1 - tax);
      payment.setAmountGross(amountGrossNetto);
      chargeClient.chargeUserForPayment(payment);
   }

}
