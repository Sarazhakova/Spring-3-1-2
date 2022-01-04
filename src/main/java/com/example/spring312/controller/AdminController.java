package com.example.spring312.controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.RoleService;
import service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;
    private RoleService roleService;

    @GetMapping(value = "")
    public String allUsers(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "adminPanel";
    }

    @PostMapping(value = "/add")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/admin";
    }

    @PatchMapping("/update")
    public String update(@ModelAttribute("user") User user) {
        userService.update(user);
        return "adminPanel";
    }


    @DeleteMapping ("/{id}")
    public String delete(@PathVariable("id") long id) {
        userService.removeUser(id);
        return "redirect:/admin";
    }
}
