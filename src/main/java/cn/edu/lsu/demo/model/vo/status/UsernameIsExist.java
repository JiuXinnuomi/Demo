package cn.edu.lsu.demo.model.vo.status;

import cn.edu.lsu.demo.model.vo.Status;

public class UsernameIsExist implements Status {
    @Override
    public Integer getCode() {
        return 100;
    }

    @Override
    public String getIntroduce() {
        return "用户名已存在";
    }
}
