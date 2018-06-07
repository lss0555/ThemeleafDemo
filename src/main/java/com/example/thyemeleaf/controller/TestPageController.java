package com.example.thyemeleaf.controller;

import com.example.thyemeleaf.model.book;
import com.example.thyemeleaf.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class TestPageController {
    /**
     * 嵌入模板
     * @return
     */
    @GetMapping("inclue")
    public String inclue(){
        return "inclue";
    }

    /**
     * 常用th标签
     * @return
     */
    @GetMapping("th")
    public ModelAndView th(HttpServletRequest request){

        ModelAndView view = new ModelAndView("th");
        view.addObject("book",new book(111,"javaweb","<h2>我是html文本标题</h2>","计算机编程类型"));

        HttpSession session = request.getSession();
        session.setAttribute("book",new book(111,"javaweb","<h2>我是html文本标题</h2>","计算机编程类型"));
        return view;
    }
    /**
     * 基本语法
     */
    @GetMapping("expression")
    public ModelAndView expression(){
        ArrayList<user> mDate=new ArrayList<>();
        mDate.add(new user(1,"admin","888888"));
        mDate.add(new user(2,"admin1","8888888"));
        mDate.add(new user(3,"admin2","88888888"));
        mDate.add(new user(4,"admin3","888888888"));

        ModelAndView view = new ModelAndView("expression");
        view.addObject("user",new user(1,"admin","888888"));
        view.addObject("users",mDate);
        return view;
    }
}
