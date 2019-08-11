package com.njx.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.njx.gmall.bean.UmsMember;
import com.njx.gmall.bean.UmsMemberReceiveAddress;
import com.njx.gmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "hello user";
    }

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser() throws Exception {
        return userService.getAllUsers();

    }

    @RequestMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        return userService.getReceiveAddressByMemberId(memberId);
    }

}
