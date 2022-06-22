package lt.mt;


import lt.mt.annotation.LtMapperScan;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@ComponentScan("lt.mt")
@LtMapperScan("lt.mt.mapper")
public class AppConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {

        return new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
    }
}
