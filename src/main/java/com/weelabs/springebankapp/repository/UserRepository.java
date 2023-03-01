package com.weelabs.springebankapp.repository;

import com.weelabs.springebankapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository()
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    ArrayList<User> findByEnabled(Boolean enabled);

}
