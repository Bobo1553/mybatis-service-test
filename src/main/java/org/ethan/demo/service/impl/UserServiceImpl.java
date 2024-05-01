package org.ethan.demo.service.impl;

import javax.annotation.Resource;
import org.ethan.demo.cache.Cache;
import org.ethan.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private Cache cache;

    @Override
    public final String getCache() {
        return cache.getCache();
    }
}
