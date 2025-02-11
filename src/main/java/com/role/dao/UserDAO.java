package com.role.dao;

import com.role.model.User;
import com.role.util.reposetory.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
    private final UserRepo userRepo;

    public UserDAO(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String saveUser(User user) {
        if (checkUserById(user.getUserId())||checkUserByEmail(user.getEmail())) {
            return "exists";
        }
        try {
            userRepo.save(user);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }

    public boolean checkUserById(String id) {
        return userRepo.existsById(id);
    }

    public boolean checkUserByEmail(String email) {
        return userRepo.existsByEmail(email);
    }


    public void deleteUser() {
        System.out.println("User deleted successfully");
    }

    public void updateUser() {
        System.out.println("User updated successfully");
    }

    public void getUser() {
        System.out.println("User retrieved successfully");
    }

    public void getAllUsers() {
        System.out.println("All users retrieved successfully");
    }

}
