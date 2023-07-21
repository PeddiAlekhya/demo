package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.model1;
import com.example.demo.Service.service1;

@Controller
public class controller1 {
    @Autowired
    service1 serve;

    @GetMapping("/")
    public String index(){
     return "index";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/search")
    public String search(){
     return "search";
    }
    @PostMapping("/search")
    public String search(@ModelAttribute model1 use1){
        serve.add1(use1);
        return "redirect:/";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute model1 use1){
        serve.add1(use1);
        return "redirect:/";
    }

    // private void add1(model1 use2) {
    // }

    @GetMapping("/bag")
    public String bag(){
        return "bag";
    }

    // @PostMapping("/bag")
    // public String bag(@ModelAttribute model1 use1){
    //     serve.add1(use1);
    //     return "redirect:/";
    // }


    @PostMapping("/register")
     public String signin(@ModelAttribute model1 use1){
      serve.add1(use1);
      return "redirect:/";
     }
        
    }

