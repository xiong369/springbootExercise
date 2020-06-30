package com.gb.controller;

import com.gb.entity.User;
import com.gb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser")
    public void addUser(User user) {
        System.out.println(user.toString() + "已插入到数据库的user表中！");
        userService.save(user);
        System.out.println(user.getId());
    }

    @PostMapping(value = "/deleteUser")
    public void deleteById(Integer id) {
        System.out.println("id为：" + id + "  的数据已从数据库的user表中删除!");
        userService.deleteById(id);
    }

    @PostMapping(value = "/updateUser")
    public void update(User user) {
        System.out.println("数据库的user表中id为：" + user.getId() + "  的数据已被修改！");
        userService.update(user);
    }

    @GetMapping(value = "/queryUser")
    public User getUserById(Integer id) {
        System.out.println(id);
        return userService.getUser(id);
    }
}
