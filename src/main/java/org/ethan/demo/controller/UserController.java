package org.ethan.demo.controller;

import javax.annotation.Resource;
import org.ethan.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public final class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/cache")
    public String getCache() {
        return userService.getCache();
    }
}
