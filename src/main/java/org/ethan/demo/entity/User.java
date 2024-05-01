package org.ethan.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {

    @TableId(value = "Fuuid", type = IdType.ASSIGN_ID)
    private String uuid;

    @TableField(value = "Fname")
    private String name;
}
