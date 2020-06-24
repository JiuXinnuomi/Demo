package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class PubPlanIsExist implements Status {
    @Override
    public Integer getCode() {
        return 111;
    }

    @Override
    public String getIntroduce() {
        return "未找到团队计划";
    }
}
