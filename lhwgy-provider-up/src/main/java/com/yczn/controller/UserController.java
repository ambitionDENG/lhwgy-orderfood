package com.yczn.controller;

import com.yczn.pojo.dc.DcDishStyleEntity;
import com.yczn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findeOne")
    public DcDishStyleEntity findById() {
        DcDishStyleEntity findOne = this.userRepository.findOne(1L);
        return findOne;
    }
}
