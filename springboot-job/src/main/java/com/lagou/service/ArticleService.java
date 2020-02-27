package com.lagou.service;

import com.lagou.mapper.ArticleMapper;
import com.lagou.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper mapper;

    public List<Article> listAll(){
        List<Article> articles = mapper.selectAll();
        return articles;
    }
}
