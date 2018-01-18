package io.ermdev.ermtv.rest.user;

import io.ermdev.ermtv.data.entity.User;
import io.ermdev.ermtv.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("{userId}")
    public User getById(@PathVariable("userId") Long userId) {
        return userRepository.findById(userId);
    }
}
