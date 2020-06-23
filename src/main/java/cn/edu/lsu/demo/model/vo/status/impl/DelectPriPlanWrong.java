package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class DelectPriPlanWrong  implements Status {
    @Override
    public Integer getCode() {
        return 104;
    }

    @Override
    public String getIntroduce() {
        return "删除个人计划失败";
    }
}
