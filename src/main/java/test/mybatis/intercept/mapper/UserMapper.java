package test.mybatis.intercept.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import test.mybatis.intercept.dao.UserEntity;

@Mapper
public interface UserMapper {

    UserEntity getUser(@Param("name") String name);
}
