package pl.whirly.recruitment.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.whirly.recruitment.payment.model.Payment;
import pl.whirly.recruitment.payment.repository.PaymentRepository;
import pl.whirly.recruitment.payment.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

   @Autowired
   private PaymentRepository paymentRepository;

   @Autowired
   private PaymentService paymentService;

   @GetMapping
   public List<Payment> getPayments() {
      return paymentRepository.getAllPayments();
   }

   @GetMapping("/{paymentId}")
   public Payment getPayment(@PathVariable String paymentId) {
      return paymentRepository.getPaymentById(paymentId);
   }

   @PostMapping
   public void processPayment(Payment payment) {
      paymentService.processPayment(payment);
   }


}
