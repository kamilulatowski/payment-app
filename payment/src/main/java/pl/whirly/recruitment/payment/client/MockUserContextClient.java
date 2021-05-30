package pl.whirly.recruitment.payment.client;

import org.springframework.context.annotation.Profile;
import pl.whirly.recruitment.payment.model.UserDto;

@Profile("disable-user-context-client")
public class MockUserContextClient implements UserContextClient {
   @Override
   public UserDto getUserById(String userId) {
      return null;
//      return new User(userId, "Joe", "Doe", 25);
   }
}
