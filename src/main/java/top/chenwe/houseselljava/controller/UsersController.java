package top.chenwe.houseselljava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.service.Impl.UsersServiceImpl;
import top.chenwe.houseselljava.utils.Result.Result;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UsersServiceImpl usersService;

    @PostMapping("/register")
    public Result register(@Valid Users user) {
        return usersService.register(user);
    }

    @PostMapping("/login")
    public Result login(@Valid Users user) {
        return usersService.login(user);
    }


}
