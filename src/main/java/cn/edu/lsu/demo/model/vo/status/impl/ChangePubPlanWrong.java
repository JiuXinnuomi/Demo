package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class ChangePubPlanWrong   implements Status {
    @Override
    public Integer getCode() {
        return 113;
    }

    @Override
    public String getIntroduce() {
        return "修改团队计划失败";
    }
}