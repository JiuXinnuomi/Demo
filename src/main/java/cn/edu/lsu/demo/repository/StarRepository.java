package cn.edu.lsu.demo.repository;


import cn.edu.lsu.demo.model.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarRepository  extends JpaRepository<Star, Integer> {

    List <Star> findAllByFocuserId(Integer focuserId);

    List <Star> findAllByFocusedId(Integer focusedId);


}
