package com.example.BBS.controller;

import com.example.BBS.entity.Entity;
import com.example.BBS.mapper.BbsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BbsController {

    @Autowired
    BbsMapper bbsMapper;

    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World")
                    String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        List<Entity> list = bbsMapper.selectAll();
        model.addAttribute("submissionDetails", list);
        return "index";
    }
}
