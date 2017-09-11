package com.gaofeng.service.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaofeng.service.api.user.UserService;
import com.gaofeng.service.api.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(group = "group", version = "1.0")
    public UserService userService;

    @RequestMapping("/")
    public String index() {

        try {
            UserEntity userEntity = new UserEntity();
            userEntity.setUsername("user");
            userEntity.setPassword("123456");
            this.userService.add(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
