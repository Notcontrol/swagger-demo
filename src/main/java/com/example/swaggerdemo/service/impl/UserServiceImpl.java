package com.example.swaggerdemo.service.impl;

import com.example.swaggerdemo.dao.IUserDao;
import com.example.swaggerdemo.entity.User;

import com.example.swaggerdemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户Service
 *
 * @author jianglu
 * created 2018 - 07 - 30 - TIME
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    IUserDao iUserDao;


    @Override
    public User getUser(Integer userId) {
        return iUserDao.getUser(userId);
    }
}
