package com.gb.service;

import com.gb.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    void save(User user);

    void deleteById(Integer id);

    void update(User user);

    User getUser(Integer id);
}
