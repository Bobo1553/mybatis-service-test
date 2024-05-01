package org.ethan.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ethan.demo.entity.User;

public interface UserService extends IService<User> {

    String getCache();
}
