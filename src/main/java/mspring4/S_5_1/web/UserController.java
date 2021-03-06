package mspring4.S_5_1.web;

import mspring4.S_5_1.user.User;
import mspring4.S_5_1.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET})
    public String spittles(
            @RequestParam(value = "max", defaultValue = ("" + Long.MAX_VALUE)) long max,
            @RequestParam(value = "count", defaultValue = "20") int count,
            Model model) {
        model.addAttribute("userList", repository.findUser(max, count));
        return "spittles";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.GET})
    public String register(Model model) {
        model.addAttribute("register","这是通过注册链接来的");
        return "spittles";
    }

    @RequestMapping(value = "/register1", method = {RequestMethod.POST, RequestMethod.GET})
    public String register1(Model model) {
        model.addAttribute("user",new User());
        return "/register/register";
    }
    @RequestMapping(value = "/register2", method = {RequestMethod.POST, RequestMethod.GET})
    public String register2(@Valid User user, Errors errors) {
        if (errors.hasErrors()){
            System.out.println("异常错误输出");
            return "/register/register";
        }
        return "/register/register";
    }

 @RequestMapping(value = "/register5", method = {RequestMethod.POST, RequestMethod.GET})
    public String register5() {
        return "timg.jpg";
    }


    @ResponseBody//加该注解后将直接返回json字符串,需要添加gson等json解析库
    @RequestMapping(value = "/register3", method = {RequestMethod.POST, RequestMethod.GET})
    public User register3(@Valid User user, Errors errors) {
//        if (errors.hasErrors()){
//            System.out.println("异常错误输出");
//            return "/register/register";
//        }
        User user1=new User();
        user1.setSex("男");
        user1.setName("欧阳凤云");
        user1.setAge(22);
        return user1;
    }

    @RequestMapping(value = "/register6", method = {RequestMethod.POST, RequestMethod.GET})
    public String register6() {
        return "hehe";
    }

     @RequestMapping(value = "/register7", method = {RequestMethod.POST, RequestMethod.GET})
    public String register7() {
        return "sss";
    }

     @RequestMapping(value = "/register8", method = {RequestMethod.POST, RequestMethod.GET})
    public String register8() {
        return "iii";
    }

    @RequestMapping(value = "/register9", method = {RequestMethod.POST, RequestMethod.GET})
    public String register9() {
        return "timg";
    }



}
