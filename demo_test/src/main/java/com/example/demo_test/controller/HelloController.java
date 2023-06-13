package com.example.demo_test.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//请求类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "hello";
    }

    @RequestMapping("/world")
    public String simple(@RequestParam(name = "name") String username, Integer age){
        System.out.println(username+":"+age);
        return "OK";
    }

    @RequestMapping("/array")
    public String arrayTest(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/list")
    public String listTest(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }
    @RequestMapping("/data")
    public String dataTest(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime update){
        System.out.println(update);
        return "OK";
    }
    @RequestMapping("/json")
    public String jsonTest(@RequestBody user User){
        System.out.println(User);
        return "OK";
    }
    @RequestMapping("/path/{id}")
    public Result path(@PathVariable Integer id){
        System.out.println(id);
        return Result.success(id);
    }
}
