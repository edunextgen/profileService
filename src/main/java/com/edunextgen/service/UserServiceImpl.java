package com.edunextgen.service;

import com.edunextgen.entity.User;
import com.edunextgen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepository userRepository;

    public User findById(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("Entity Not Found"));
    }
}
