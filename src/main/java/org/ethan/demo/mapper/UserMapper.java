package org.ethan.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.ethan.demo.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    
}
