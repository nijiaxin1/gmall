package com.njx.gmall.service;


import com.njx.gmall.bean.UmsMember;
import com.njx.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUsers() throws Exception;

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
