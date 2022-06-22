package lt.mt.core.spring;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TOTO
 * Author lutao
 * Date 2022/6/22 2:01 下午
 * Version 1.0
 **/
public class LtMapperFactoryBean implements FactoryBean {

    private Class mapperInterface;

    private SqlSession sqlSession;

    //@Autowired  beanDefinition 设置注入方式为type
    public void setSqlSession(SqlSessionFactory sqlSessionFactory){
        sqlSessionFactory.getConfiguration().addMapper(mapperInterface);

        this.sqlSession = sqlSessionFactory.openSession();
    }

    public LtMapperFactoryBean(Class mapperInterface) {

        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object getObject() throws Exception {
        return sqlSession.getMapper(mapperInterface);
       /* return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invok..........." + method.getName());
                return null;
            }
        });*/
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
