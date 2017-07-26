package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/6/23.
 */
@Controller
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
