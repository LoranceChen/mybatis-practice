package test.mybatis.intercept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import test.mybatis.intercept.dao.NetsUserEntity;
import test.mybatis.intercept.dao.UserEntity;
import test.mybatis.intercept.mapper.NetsUserMapper;
import test.mybatis.intercept.mapper.UserMapper;

import java.util.List;

@Controller
@SpringBootApplication
@RequestMapping("user/")
public class UserController {

    @Autowired
//    private UserMapper userMapper;
    private NetsUserMapper netsUserMapper;

    @RequestMapping("getUser")
    @ResponseBody
    public Object getUser(@RequestParam("name") String name){
        List<NetsUserEntity> user =null;
        if(!StringUtils.isEmpty(name)){
            user = netsUserMapper.getNetsUser();
        }

        return user;
    }


}
