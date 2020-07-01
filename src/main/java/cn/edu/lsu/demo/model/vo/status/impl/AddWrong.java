package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class AddWrong implements Status {
    @Override
    public Integer getCode() {
        return 102;
    }

    @Override
    public String getIntroduce() {
        return "添加失败";
    }
}
