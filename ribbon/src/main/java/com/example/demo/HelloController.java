package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}
