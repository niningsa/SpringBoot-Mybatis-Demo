package com.ln.controller;

import com.ln.entity.SaleTest;
import com.ln.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @Description:
 * @date 2017/11/1 17:23
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/testList")
    public List<SaleTest> getSaleList() {
        return testService.getSaleList();
    }

    @GetMapping("/hello")
    public String say() {
        return "Hello World";
    }
}
