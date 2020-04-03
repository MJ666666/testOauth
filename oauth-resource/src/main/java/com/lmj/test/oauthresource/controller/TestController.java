package com.lmj.test.oauthresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Description:
 * date: 2020/4/3 21:34
 *
 * @author MJ
 */
@RestController
public class TestController {


    @GetMapping("/getInfo")
    public String echo() {

        return "visit success";
    }

}
