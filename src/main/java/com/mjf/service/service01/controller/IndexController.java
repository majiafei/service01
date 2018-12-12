package com.mjf.service.service01.controller;

/**
 * @Auther: majiafei
 * @Date: 2018/12/12 17:19
 * @Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }

}
