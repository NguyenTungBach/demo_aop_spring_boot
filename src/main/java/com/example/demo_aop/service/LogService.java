package com.example.demo_aop.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class LogService {
    public String callLogSuccess(){
        log.info("callLogSuccess is called");
        return "check call log";
    }
}
