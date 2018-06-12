package mspring4.S_5_1.web;

import mspring4.S_5_1.user.User;
import mspring4.S_5_1.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
