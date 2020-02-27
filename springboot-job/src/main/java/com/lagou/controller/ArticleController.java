package com.lagou.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.pojo.Article;
import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/listAll")
    public String list(@RequestParam(defaultValue = "1")Integer pageNum, Model model){

        PageHelper.startPage(pageNum, 3);

        List<Article> articles = articleService.listAll();
        PageInfo<Article> pageInfo = new PageInfo<>(articles,3);
        model.addAttribute("data",pageInfo);

        return "index";
    }
}
