package com.njx.gmall.user.mapper;

import com.njx.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<UmsMember> {
}
