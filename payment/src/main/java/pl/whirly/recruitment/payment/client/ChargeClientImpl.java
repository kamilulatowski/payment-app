package pl.whirly.recruitment.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import pl.whirly.recruitment.payment.model.Payment;

@Service
@Profile("!disable-user-context-client")
public class ChargeClientImpl implements ChargeClient {

   private final RestTemplate restTemplate = new RestTemplate();

   @Value("${charge.service.url}")
   private String chargeServiceUrl;

   @Override
   public Payment chargeUserForPayment(Payment payment) {
      UriComponents uriComponents = UriComponentsBuilder.fromUriString(chargeServiceUrl)
              .queryParam("userId", payment.getUserId())
              .queryParam("amountNet", String.valueOf(payment.getAmountGross()))
              .queryParam("currency", payment.getCurrency()).build();
      restTemplate.getForObject(uriComponents.toUriString(), String.class);
      return payment;
   }
}
