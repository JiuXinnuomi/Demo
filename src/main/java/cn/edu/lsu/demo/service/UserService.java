package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.entity.User;

public interface UserService {
    User register(String username, String password);

    User login(String username, String password);
}
