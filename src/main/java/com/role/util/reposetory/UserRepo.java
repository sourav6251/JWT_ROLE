package com.role.util.reposetory;

import com.role.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepo extends JpaRepository<User, String> {
    User findByUserName(String userName);
    User findByEmail(String userName);
    boolean existsByEmail(String email);
}
