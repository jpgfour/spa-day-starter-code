package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
