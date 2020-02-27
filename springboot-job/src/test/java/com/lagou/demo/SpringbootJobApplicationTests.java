package com.lagou.demo;

import com.github.pagehelper.Page;
import com.lagou.controller.ArticleController;
import com.lagou.pojo.Article;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJobApplicationTests {

    @Autowired
    private ArticleController controller;

    @Test
    void contextLoads() {

    }

}
