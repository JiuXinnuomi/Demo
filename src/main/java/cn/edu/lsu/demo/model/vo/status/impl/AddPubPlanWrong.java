package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class AddPubPlanWrong implements Status {
    @Override
    public Integer getCode() {
        return 112;
    }

    @Override
    public String getIntroduce() {
        return "添加团队计划失败";
    }
}
