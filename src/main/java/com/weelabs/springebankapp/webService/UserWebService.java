package com.weelabs.springebankapp.webService;

import com.weelabs.springebankapp.entities.User;
import com.weelabs.springebankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@RequestMapping("/bank/user")
public class UserWebService {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/")
    User save(@RequestBody() User user) {
        return userService.save(user);
    }

    @GetMapping("/id/{id}")
    Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

}
