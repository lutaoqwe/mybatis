package lt.mt.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Description TOTO
 * Author lutao
 * Date 2022/6/22 10:14 上午
 * Version 1.0
 **/
public interface UserMapper {

    @Select("select 'user'")
    String selectById();
}
