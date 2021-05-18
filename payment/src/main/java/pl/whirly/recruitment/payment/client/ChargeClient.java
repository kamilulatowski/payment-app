package pl.whirly.recruitment.payment.client;

import pl.whirly.recruitment.payment.model.Payment;

public interface ChargeClient {
   Payment chargeUserForPayment(Payment payment);
}
