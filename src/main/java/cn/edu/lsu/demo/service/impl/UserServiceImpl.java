package cn.edu.lsu.demo.service.impl;

import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.repository.UserRepository;
import cn.edu.lsu.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

}
