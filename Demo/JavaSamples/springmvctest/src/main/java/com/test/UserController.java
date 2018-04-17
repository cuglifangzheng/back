package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register() {
        return "user/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(String userName) {
        User user = new User();
        userService.createUser(user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/createSuccess");
        user.setUserName(userName);
        mv.addObject("user22", user);

        return mv;
    }
}
