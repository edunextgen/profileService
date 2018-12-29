package com.edunextgen.Controller;

import com.edunextgen.entity.User;
import com.edunextgen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/users/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){
        User user = userService.findById(id);
        return user;
    }

}
