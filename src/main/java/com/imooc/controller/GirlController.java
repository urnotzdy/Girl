package com.imooc.controller;

import com.imooc.repository.GIrlRepository;
import com.imooc.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description:
 * User: zhangdanyang
 * Date: 2018/1/4 15:23.
 */
@RestController
public class GirlController {

    @Autowired
    GIrlRepository gIrlRepository;

    @GetMapping("/girls")
    public List<Girl> selectGirls(){
        return gIrlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl add(
            @RequestParam(value = "age")String age
        ){
        Girl girl=new Girl();
        girl.setAge(Integer.valueOf(age));
        girl.setId(1);
        return gIrlRepository.save(girl);
    }

}
