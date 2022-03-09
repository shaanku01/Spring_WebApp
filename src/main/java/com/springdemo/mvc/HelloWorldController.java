package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    //Need a controller method to Show the initial form:
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    //Need a controller method to process the HTML form:
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //new COntroller method to read form data and add data to model:
    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");
        theName=theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message",result);

        return "helloworld";

    }

    @RequestMapping("/processFormThree")
    public String processFormV3(@RequestParam("studentName") String theName , Model model){
        theName = theName.toUpperCase();
        String result = "THis is from V3 "+theName;
        model.addAttribute("message",result);

        return "helloworld";

    }

}
