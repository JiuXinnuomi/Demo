package cn.edu.lsu.demo.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    /**
     * @ GeneratedValue id生成策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nickname;

    @Column(unique = true, length = 50, nullable = false)
    private String username;

    private String password;
}
