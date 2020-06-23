package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class ChangePriPlanWrong  implements Status {
    @Override
    public Integer getCode() {
        return 103;
    }

    @Override
    public String getIntroduce() {
        return "修改个人计划失败";
    }
}