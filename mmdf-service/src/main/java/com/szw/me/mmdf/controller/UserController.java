package com.szw.me.mmdf.controller;

import com.szw.me.framework.vo.ResultVO;
import com.szw.me.mmd.client.UserClient;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserClient userClient;

    @GetMapping("/test")
    @ApiOperation("用户注册")
    public ResultVO test() {
        return userClient.get("300001");
    }
}
