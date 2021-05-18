package pl.whirly.recruitment.payment.repository;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.payment.model.Payment;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockPaymentRepository implements PaymentRepository {

   private final List<Payment> list = new ArrayList<>();

   public List<Payment> getAllPayments() {
      return list;
   }

   public Payment getPaymentById(String id) {

      return list.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
   }

   public void save(Payment payment) {
      list.add(payment);
   }
}
