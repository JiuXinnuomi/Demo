package cn.edu.lsu.demo.model.vo.status.impl;

import cn.edu.lsu.demo.model.vo.status.Status;

public class DeleteWrong implements Status {
    @Override
    public Integer getCode() {
        return 114;
    }

    @Override
    public String getIntroduce() {
        return "删除失败";
    }
}