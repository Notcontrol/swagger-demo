package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.entity.User;
import com.example.swaggerdemo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * api demo
 *
 * @author icourt
 * created 2018 - 07 - 28 - TIME
 */
@Slf4j
@Api(value = "demo api")
@RestController
@RequestMapping("/api/vi/")
public class DemoController {


    @Resource
    IUserService iUserService;

    /**
     * 获取信息
     * @param userId 用户的id
     * @return 用户信息
     */
    @ApiOperation(value = "获取用户详细信息", notes = "根据用户的url中的id来获取他的详细信息")
    @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "Integer", paramType="path")
    @GetMapping("users/{userId}")
    public ResponseEntity<User> getUsersById(@PathVariable(value = "userId") Integer userId){
        User user = iUserService.getUser(userId);
        log.debug("log test");
        return ResponseEntity.ok(user);
    }

}
