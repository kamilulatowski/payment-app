package pl.whirly.recruitment.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.whirly.recruitment.payment.model.UserDto;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserContextClientImpl implements UserContextClient{

   private final RestTemplate restTemplate = new RestTemplate();

   @Value("${user.service.url}")
   private String userServiceUrl;

   @Override
   public UserDto getUserById(String userId) {
      if (userId == null || userId.isBlank()) {
         throw new NoSuchElementException();
      }
      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(userServiceUrl).pathSegment(userId);
      return restTemplate.getForObject(builder.toUriString(), UserDto.class);
   }
}
