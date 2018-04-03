package com.example.demo.service;

import com.example.demo.model.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public Article save(Article article){
          return articleRepository.save(article);
    }
}
