package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class ChangeWrong   implements Status {
    @Override
    public Integer getCode() {
        return 113;
    }

    @Override
    public String getIntroduce() {
        return "修改失败";
    }
}