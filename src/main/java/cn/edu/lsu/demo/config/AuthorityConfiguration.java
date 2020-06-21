package cn.edu.lsu.demo.config;

import cn.graydove.security.token.authority.AuthorityConfigure;
import cn.graydove.security.token.authority.AuthorityManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorityConfiguration implements AuthorityConfigure {

    @Override
    public void configure(AuthorityManager authorityManager) {
        authorityManager
                .antMatchers("/register").permitAll()
                .anyRequest().authenticated();
    }
}
