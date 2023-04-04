package com.example.demo_aop.controller;

import com.example.demo_aop.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @Autowired
    LogService logService;
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public void TestException() {
        logService.callLogSuccess();
    }
}
