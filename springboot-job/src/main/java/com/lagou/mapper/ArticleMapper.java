package com.lagou.mapper;

import com.lagou.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface ArticleMapper {

    List<Article> selectAll();
}
