package com.abc.service;

import com.abc.mapper.UserMapper;
import com.abc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;


    public void insert(User user){
        userMapper.insert(user);
        logger.info("success");
    }

    public User findOne(Integer id){
        return userMapper.getOne(id);
    }

    public static void main(String args[])
    {

        String url = "jdbc:mysql://localhost/test";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","a12345");
            if(!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
