package com.itcast.mapper;

import com.itcast.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

//  查询所有....
    List<User> selectAll();

}
