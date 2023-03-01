package com.weelabs.springebankapp.service.imlp;

import com.weelabs.springebankapp.entities.User;
import com.weelabs.springebankapp.repository.UserRepository;
import com.weelabs.springebankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        if (user.getEmail().isEmpty()) {
            throw new Error("Email cannot be empty");
        }

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public ArrayList<User> findByEnabled(boolean enabled) {
        return null;
    }

    //  findByEmail, findByEnabled, deleteById, update, findAll
}
