package cn.edu.lsu.demo.service.impl;

import cn.edu.lsu.demo.model.dto.RegisterDTO;
import cn.edu.lsu.demo.model.dto.UserDTO;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.UserVO;
import cn.edu.lsu.demo.repository.UserRepository;
import cn.edu.lsu.demo.service.UserService;
import cn.graydove.security.crypto.PasswordEncoder;
import cn.graydove.security.exception.UsernameNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserVO register(RegisterDTO registerDTO) {
        User user = new User();
        user.setUsername(registerDTO.getUsername());
        user.setNickname(registerDTO.getNickname());

        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));



        user= userRepository.save(user);

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }

    @Override
    public User login(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public UserDTO loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepository.findByUsername(username);
        if (u == null) {
            throw new UsernameNotFoundException();
        }
        UserDTO user = new UserDTO();
        BeanUtils.copyProperties(u, user);
        return user;
    }
}
