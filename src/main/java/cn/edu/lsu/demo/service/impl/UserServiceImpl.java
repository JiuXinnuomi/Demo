package cn.edu.lsu.demo.service.impl;

import cn.edu.lsu.demo.model.dto.RegisterDTO;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.UserVO;
import cn.edu.lsu.demo.repository.UserRepository;
import cn.edu.lsu.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserVO register(RegisterDTO registerDTO) {
        User user = new User();
        user.setUsername(registerDTO.getUsername());
        user.setNickname(registerDTO.getNickname());
        user.setPassword(registerDTO.getPassword());

        user = userRepository.save(user);

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

    @Override
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

}
