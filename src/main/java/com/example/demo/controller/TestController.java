package com.example.demo.controller;

import com.example.demo.model.Article;
import com.example.demo.model.User;
import com.example.demo.service.ArticleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;

    @RequestMapping(path = "message")
    public String getMessage() {
        User user = new User();
        user.setEmail("asd");
        user.setFirstName("Hello");
        user.setLastName("Bye");


        Article article = new Article();
        article.setTitle("Article");

        articleService.save(article);

        userService.saveUser(user);
        return "hello";
    }
}
