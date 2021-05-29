package pl.whirly.recruitment.businesscontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.whirly.recruitment.businesscontext.model.User;
import pl.whirly.recruitment.businesscontext.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userRepository.getUserById(userId);
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

    @PostMapping
    public boolean addProduct(@RequestBody User user) {
        return userRepository.addUser(user);
    }

    @PutMapping("/{userId}")
    public boolean updateUser(@PathVariable String userId, @RequestBody User user) {
        return userRepository.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public boolean deleteUser(@PathVariable String userId) {
        return userRepository.delete(userId);
    }
}


