package pl.whirly.recruitment.businesscontext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.whirly.recruitment.businesscontext.model.User;
import pl.whirly.recruitment.businesscontext.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId) {
        return userRepository.getUserById(userId);
    }
}


