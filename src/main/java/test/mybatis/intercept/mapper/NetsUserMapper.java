package test.mybatis.intercept.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import test.mybatis.intercept.dao.NetsUserEntity;
import test.mybatis.intercept.dao.UserEntity;

import java.util.List;

@Mapper
public interface NetsUserMapper {

    void updateUser(@Param("name") String name);
    List<NetsUserEntity> getNetsUser();

}
