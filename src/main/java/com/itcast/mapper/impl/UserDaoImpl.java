package com.itcast.mapper.impl;

import com.itcast.entity.User;
import com.itcast.mapper.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
//  查询所有....
    @Override
    public List<User> selectAll() {
        return null;
    }
}
