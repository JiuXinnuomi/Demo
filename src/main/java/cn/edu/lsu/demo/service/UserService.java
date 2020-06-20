package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.RegisterDTO;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.UserVO;

public interface UserService {
    UserVO register(RegisterDTO registerDTO);

    User login(String username, String password);
}
