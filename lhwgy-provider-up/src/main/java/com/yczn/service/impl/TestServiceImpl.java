package com.yczn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yczn.mapper.UserMapper;
import com.yczn.pojo.dc.Users;
import com.yczn.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-22
 * @time: 19:35
 */
@Service
public class TestServiceImpl extends ServiceImpl<UserMapper,Users> implements TestService {
}
