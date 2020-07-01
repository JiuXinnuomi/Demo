package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class IsExist implements Status {
    @Override
    public Integer getCode() {
        return 121;
    }

    @Override
    public String getIntroduce() {
        return "未找到";
    }
}
