package com.ftg.learn.smhtml;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *  springboot整合mvc提供的核心处理servler  相当于原来的dispathServler
 * @auto jxkang
 * @data 2019/10/04
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SmHtmlApplication.class);
    }

}
