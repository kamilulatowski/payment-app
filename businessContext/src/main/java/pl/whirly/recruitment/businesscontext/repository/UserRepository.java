package pl.whirly.recruitment.businesscontext.repository;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.businesscontext.model.User;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserRepository {
   private List<User> users = new LinkedList<>();

   public UserRepository() {
      this.users.add(new User("adult", Instant.now().minus(19 * 31556952, ChronoUnit.SECONDS), "PL"));
      this.users.add(new User("kid", Instant.now().minus(4 * 31556952, ChronoUnit.SECONDS), "DE"));
   }

   public User getUserById(String id) {
      return this.users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
   }
}

