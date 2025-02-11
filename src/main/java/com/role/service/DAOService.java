package com.role.service;


import com.role.dao.ResourceDAO;
import com.role.dao.UserDAO;
import com.role.dto.UserDTO;
import com.role.model.User;
import org.springframework.stereotype.Service;

@Service
public class DAOService {
    private final UserDAO userDAO;
    private final ResourceDAO resourceDAO;

    public DAOService(UserDAO userDAO, ResourceDAO resourceDAO) {
        this.userDAO = userDAO;
        this.resourceDAO = resourceDAO;
    }


    public String saveUser(UserDTO userDTO) {
        User user=new User(userDTO.getUserId(),userDTO.getUserName(),userDTO.getPassword(),userDTO.getEmail(),userDTO.getRole());
        String result=userDAO.saveUser(user);
        if (result.equals("success")) {
            return "User saved successfully";
        }else if (result.equals("exists")) {
            return "User already exists";
        }
        return "User not saved";
    }
}
