package com.gaofeng.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaofeng.service.Repository.user.UserRepository;
import com.gaofeng.service.api.user.UserService;
import com.gaofeng.service.api.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;


@Service(group = "group", version = "1.0")
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public void add(UserEntity userEntity) throws Exception {

        this.userRepository.saveAndFlush(userEntity);
    }

}
