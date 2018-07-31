package com.example.swaggerdemo.service;

import com.example.swaggerdemo.entity.User;

/**
 * @author jianglu
 */
public interface IUserService {
    /**
     * 根据用户id查询到用户
     * @param userId 用户id
     * @return 用户对象
     */
    User getUser(Integer userId);
}
