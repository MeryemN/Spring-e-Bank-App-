package com.weelabs.springebankapp.service;

import com.weelabs.springebankapp.entities.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserService {
    // save, findById, findByEmail, findByEnabled, deleteById, update, findAll
    User save(User user);

    Optional<User> findById(Long id);

    ArrayList<User> findByEnabled(boolean enabled);

}
