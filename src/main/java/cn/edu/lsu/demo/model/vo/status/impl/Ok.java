package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class Ok implements Status {
    @Override
    public Integer getCode() {
        return 0;
    }

    @Override
    public String getIntroduce() {
        return "OK";
    }
}
