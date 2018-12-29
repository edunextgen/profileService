package com.edunextgen.service;

import com.edunextgen.entity.User;

public interface IUserService {
    public User findById(Long userId);
}
