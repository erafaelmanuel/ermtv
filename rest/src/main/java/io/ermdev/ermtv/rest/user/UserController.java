package io.ermdev.ermtv.rest.user;

import io.ermdev.ermtv.data.entity.User;
import io.ermdev.ermtv.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping
    public User delete(@RequestBody User user) {
        userRepository.delete(user);
        return user;
    }
}
