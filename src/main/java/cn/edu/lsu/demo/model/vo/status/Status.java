package cn.edu.lsu.demo.model.vo.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@Getter
//@AllArgsConstructor
public interface   Status {
//    OK(0, "OK"),
//    USERNAME_UNIQUE(100, "用户名已存在"),
//    ;

//    private Integer code;
//
//    private String introduce;

    Integer getCode();

    String getIntroduce();
}
