package cn.edu.lsu.demo.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String focuser;

    @Column(unique = true, nullable = false)
    private String foucused;


}
