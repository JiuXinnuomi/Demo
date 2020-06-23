package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class PriPlanIsExist  implements Status {
    @Override
    public Integer getCode() {
        return 101;
    }

    @Override
    public String getIntroduce() {
        return "未找到个人计划";
    }
}
