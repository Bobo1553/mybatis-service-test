package org.ethan.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import javax.annotation.Resource;
import org.ethan.demo.cache.Cache;
import org.ethan.demo.entity.User;
import org.ethan.demo.mapper.UserMapper;
import org.ethan.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private Cache cache;

    @Override
    public final String getCache() {
        return cache.getCache();
    }
}
