package pl.whirly.recruitment.businesscontext.repository;

import org.springframework.stereotype.Service;
import pl.whirly.recruitment.businesscontext.model.User;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

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

    public List<User> getAllUsers() {
        return this.users;
    }

    public boolean addUser(User user) {
        return users.add(user);
    }

    public boolean updateUser(String id, User user) {
       User updatedUser = getUserById(id);
       if (updatedUser == null) {
           throw new NoSuchElementException();
       }
       users.remove(updatedUser);
       return users.add(user);
    }

    public boolean delete(String id) {
        return this.users.removeIf(element -> element.getId().equals(id));
    }
}

