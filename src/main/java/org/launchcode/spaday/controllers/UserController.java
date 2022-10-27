package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, @RequestParam String verify) {
        if (user.getPassword().equals(verify)) {
            UserData.add(new User());
            return "user/index";
        } else {
            return "redirect:/user/add";
        }
    }
}
