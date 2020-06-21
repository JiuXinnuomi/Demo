package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.RegisterDTO;
import cn.edu.lsu.demo.model.dto.UserDTO;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.UserVO;
import cn.graydove.security.userdetails.UserDetailService;

public interface UserService extends UserDetailService<UserDTO> {

    UserVO register(RegisterDTO registerDTO);

    User login(String username, String password);
}
