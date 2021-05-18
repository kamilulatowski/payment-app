package pl.whirly.recruitment.businesscontext.repository;

import pl.whirly.recruitment.businesscontext.model.User;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
   private List<User> users = new LinkedList<>();

   public UserRepository() {
      this.users.add(new User("adult", Instant.now().minus(19, ChronoUnit.YEARS), "PL"));
      this.users.add(new User("kid", Instant.now().minus(4, ChronoUnit.YEARS), "DE"));
   }

   User getUserById(String id) {
      return this.users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
   }
}

