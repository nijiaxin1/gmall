package com.njx.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.njx.gmall.bean.UmsMember;
import com.njx.gmall.bean.UmsMemberReceiveAddress;
import com.njx.gmall.service.UserService;
import com.njx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.njx.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUsers() {
        // return (List<UmsMember>) dao.findForList("UserMapper.selectAllUser", null);
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        return umsMemberReceiveAddressMapper.selectByExample(example);
    }
}
