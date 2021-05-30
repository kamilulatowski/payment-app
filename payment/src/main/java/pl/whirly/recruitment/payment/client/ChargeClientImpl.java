package pl.whirly.recruitment.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.whirly.recruitment.payment.model.Payment;
import pl.whirly.recruitment.payment.model.User;

@Service
@Profile("!disable-user-context-client")
public class ChargeClientImpl implements ChargeClient {

   private final RestTemplate restTemplate = new RestTemplate();

   @Value("${charge.service.url}")
   private String chargeServiceUrl;

   @Override
   public Payment chargeUserForPayment(Payment payment) {
      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(chargeServiceUrl);
//      restTemplate.postForObject(builder.toUriString(),  User.class);
      return payment;
   }
}
