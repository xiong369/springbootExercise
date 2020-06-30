package com.gb.dao;

import com.gb.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    void insert(User user);

    void deleteById(Integer id);

    void update(User user);

    User selectById(Integer id);

}
