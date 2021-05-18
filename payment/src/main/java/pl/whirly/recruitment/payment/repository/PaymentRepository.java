package pl.whirly.recruitment.payment.repository;

import pl.whirly.recruitment.payment.model.Payment;

import java.util.List;

public interface PaymentRepository {

   List<Payment> getAllPayments();

   Payment getPaymentById(String id);

   void save(Payment payment);
}
