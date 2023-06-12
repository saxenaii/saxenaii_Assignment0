package com.saxenaii_Assignment0.saxenaii_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Assignment0Controller {

  @RequestMapping("/start")
  public String startMap(){
    return "start";
  }
  
  @RequestMapping("/index")
  public String indexMap(){
    return "start";
  }
}