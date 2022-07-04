package com.devtec.br.Spring_MVC.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.devtec.br.Spring_MVC.entity.User;
import com.devtec.br.Spring_MVC.repositories.UserRepository;

@Controller
public class UserController {

    @Autowired 
    private UserRepository userrepository;

    @PostMapping("/Login")
    public String home(HttpServletRequest request) {
        User userAdmin = new User("Deyvison", "Desenvolvimento", "Deydias", "deyvisondias@hotmail.com", "mudar@123",
                "mudar@123");
        List<User> list = this.userrepository.findAll();
        for (User user : list) {
            if (userAdmin.getUser() == user.getUser() && userAdmin.getPassword() == user.getPassword()) {
                return "home";
            }
        }
        return "Acesso negado";
    }

    @PostMapping("/Login")
    public String register(User user) {
		return null;

    }
    
}