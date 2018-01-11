package com.imooc.controller;

import com.imooc.properties.Pepole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: zhangdanyang
 * Date: 2017/12/28 14:23.
 */
@RestController
public class HelloController {

    @Autowired
    Pepole pepole;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return  pepole.getName();
    }

}
