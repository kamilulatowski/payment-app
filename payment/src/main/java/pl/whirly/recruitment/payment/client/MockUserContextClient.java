package pl.whirly.recruitment.payment.client;

import org.springframework.context.annotation.Profile;
import pl.whirly.recruitment.payment.model.User;

@Profile("disable-user-context-client")
public class MockUserContextClient implements UserContextClient {
   @Override
   public User getUserById(String userId) {
      return null;
   }
}
