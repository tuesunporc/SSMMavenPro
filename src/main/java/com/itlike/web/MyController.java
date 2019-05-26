package com.itlike.web;

import com.itlike.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("teacher")
    public String Test(String name){
        System.out.println("web层------"+name);
        teacherService.save(name);
        return "result";
    }
}
