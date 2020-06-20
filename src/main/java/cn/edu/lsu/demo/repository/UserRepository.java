package cn.edu.lsu.demo.repository;

import cn.edu.lsu.demo.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);
}
