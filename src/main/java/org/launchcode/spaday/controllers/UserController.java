package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    //should live at /user/add
    @GetMapping ("add")
    public String displayAddUserForm(Model model) {

        model.addAttribute("title" , "Add User");
        //intent:  return the path to the add.html template
        return "user/add";
    }

    //should live at /user
    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
        //System.out.println(user.getUsername());
        model.addAttribute( "username", user.getUsername());
        model.addAttribute("error",true);
        model.addAttribute("email",user.getEmail());
        if (user.getPassword().equals(verify)) {
            //System.out.println("verified!");
            return "user/index.html";
        }else{
//            System.out.println("NOT verified!");
//            System.out.println(user.getPassword());
//            System.out.println(verify);
            return "user/add";
        }
    }

}
