package com.pyzq.website.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pyzq.website.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Repository或@Component均可
 */
@Component
public interface UserMapper extends BaseMapper<User> {
}
