package cn.edu.lsu.demo.service.impl;


import cn.edu.lsu.demo.model.entity.PriPlan;
import cn.edu.lsu.demo.repository.PriPlanRepository;
import cn.edu.lsu.demo.service.PriPlanService;
import org.springframework.stereotype.Service;

@Service
public class PriPlanServiceImpl implements PriPlanService {

    private PriPlanRepository priPlanRepository;

    public PriPlanServiceImpl(PriPlanRepository priPlanRepository)
    {
        this.priPlanRepository = priPlanRepository;
    }


    @Override
    public PriPlan selectAll(Integer userId){
        return priPlanRepository.findAllByUserId(userId);
    }

}
