package com.itcast;

import com.itcast.entity.User;
import com.itcast.mapper.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootReview1001ApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void testSelectAll(){
        List<User> userDaos = userDao.selectAll();
        userDaos.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
