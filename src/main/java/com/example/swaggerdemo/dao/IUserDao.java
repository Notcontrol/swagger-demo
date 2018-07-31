package com.example.swaggerdemo.dao;

import com.example.swaggerdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author jianglu
 */
@Mapper
public interface IUserDao {


    /**
     * 根据用户id查询用户
     * @param userId 用户id
     * @return 查询到的用户结果
     */
    User getUser(@Param("userId") Integer userId);
}
