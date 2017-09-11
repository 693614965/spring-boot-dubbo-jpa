package com.gaofeng.service.Repository.user;

import com.gaofeng.service.Repository.BaseDaoRepository;
import com.gaofeng.service.api.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseDaoRepository<UserEntity, String> {
}
