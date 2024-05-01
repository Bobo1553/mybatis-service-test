CREATE TABLE `t_user`
(
    `Fuuid` varchar(128) NOT NULL COMMENT 'UUID',
    `Fname` varchar(128) DEFAULT NULL COMMENT '名字',
    PRIMARY KEY (`Fuuid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';