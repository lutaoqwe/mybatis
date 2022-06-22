package lt.mt;

import lt.mt.annotation.LtMapperScan;
import lt.mt.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @Description TOTO
 * Author lutao
 * Date 2022/6/22 9:30 上午
 * Version 1.0
 **/


public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService");
       //UserMapper userMapper = (UserMapper) context.getBean("userMapper");


        userService.test();
    }


}
