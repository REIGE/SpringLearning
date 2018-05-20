package com.reige.controller;

import com.reige.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@Api(value = "/user", tags = "User接口", description = "这里是描述")
public class UserController {

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id获取用户信息", httpMethod = "GET", response = User.class)
    public ResponseEntity<User> getUser(@PathVariable int id){
        User user = new User();
        user.setId(id);
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "/getUser2/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id获取用户信息", httpMethod = "GET", response = User.class)
    public ResponseEntity<User> getUser2(@PathVariable int id){
        User user = new User();
        user.setId(id);
        return ResponseEntity.ok(user);
    }
}