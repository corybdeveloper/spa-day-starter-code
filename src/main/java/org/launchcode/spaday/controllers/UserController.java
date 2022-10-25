package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "user", method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping()
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("user", user);
            return "user/index";
    }
}

