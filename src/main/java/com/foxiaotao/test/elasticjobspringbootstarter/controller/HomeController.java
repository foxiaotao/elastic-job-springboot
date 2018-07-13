package com.foxiaotao.test.elasticjobspringbootstarter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sxt.com.simon.password.des.SimonPassword;

/**
 * Created with suntao on 2018/7/12
 */
@Controller
@Slf4j
public class HomeController {


    @RequestMapping("/home")
    public void home(){
        log.info("====home====");
        log.info("[password]{}",SimonPassword.enPassword("12233"));
        return ;
    }
}
