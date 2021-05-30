package pl.whirly.recruitment.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.whirly.recruitment.payment.model.User;

import java.util.NoSuchElementException;

@Service
public class UserContextClientImpl implements UserContextClient{

   private final RestTemplate restTemplate = new RestTemplate();

   @Value("${user.service.url}")
   private String userServiceUrl;

   @Override
   public User getUserById(String userId) {
      if (userId == null || userId.isBlank()) {
         System.out.println("Błędne id użytkownika");
         throw new NoSuchElementException();
      }
      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(userServiceUrl).pathSegment(userId);
      return restTemplate.getForObject(builder.toUriString(), User.class);
   }
}
