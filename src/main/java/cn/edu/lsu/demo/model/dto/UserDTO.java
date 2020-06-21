package cn.edu.lsu.demo.model.dto;

import cn.graydove.security.userdetails.GrantedAuthority;
import cn.graydove.security.userdetails.UserDetails;
import cn.graydove.security.userdetails.support.Authority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO implements UserDetails {

    private String username;

    private String nickname;

    private String password;

    private Integer id;

    private List<Authority> authorities = Authority.getAuthoritiesByString("user");


    @JsonIgnore
    @Override
    public boolean isEnable() {
        return true;
    }

}
