package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
@Service
public class AdminService {
	@Autowired
    private AdminRepository userRepository;
 public Admin login(Admin user) {
        Admin existingUser = new Admin();
        		existingUser= userRepository.findByAdminId(user.getAdminId())
;
        if(existingUser.getAdminId().equals(user.getAdminId()) &&
                existingUser.getPassword().equals(user.getPassword()) &&
                existingUser.getRole().equals(user.getRole())) {
            existingUser.setPassword("");
            return existingUser;
        }

        return null;

    }
}
