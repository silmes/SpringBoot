package com.abc.mapper;


import com.abc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface  UserMapper {
    List<User> getAll();

    User getOne( Integer userid);

    void insert(User user);

    void update(User user);

    void delete(Integer userid);
}
