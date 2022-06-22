package lt.mt.service;

import lt.mt.mapper.AccountMapper;
import lt.mt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TOTO
 * Author lutao
 * Date 2022/6/22 10:23 上午
 * Version 1.0
 **/
@Service
public class UserService {

    @Autowired private UserMapper userMapper;

    @Autowired private AccountMapper accountMapper;

    public void test(){
        System.out.println(userMapper);
        System.out.println(userMapper.selectById());
    }
}
