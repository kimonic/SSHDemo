package mspring4.S_5_1.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping({"/homepage"})
public class HomeCtroller {

    @RequestMapping(method = {POST,GET})
    public String home() {
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        System.out.println("请求已执行");
        return "home";
    }
}
