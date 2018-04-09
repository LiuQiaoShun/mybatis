package online.qsx.controller;

import online.qsx.model.Role;
import online.qsx.model.User;
import online.qsx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "to_Register")
    public String to_Register(){
        return "register";
    }

    @RequestMapping(value = "do_Register",method = RequestMethod.POST)
    @ResponseBody
    public User do_Register(User user,String roleName){

        Role role=new Role(roleName);
        List<Role> roles=new ArrayList<>();
        roles.add(role);
        user.setRoles(roles);
        userService.saveUser(user);

        System.out.println(userService.saveUser(user));
        System.out.println(roleName);


        return user;
    }


}
