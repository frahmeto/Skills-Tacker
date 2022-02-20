package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String messageOne(){
        String html =  "<html> <body> <h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn, Here is the list:-<ol> <li>JavaScript</li><li>HTML</li><li>Java</li> </ol> </h2>";
        return html;
    }

    @GetMapping(value="form")
    @ResponseBody
    public String formSkills() {
        String html = "<html>" +
                "<body>" +
                "<form method= 'post'>" +
                "Name: <br>" +
                "<input type = 'text' name ='name'/>" +
                "<br>My Favorite language: </br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'html'>HTML</option>" +
                "<option value = 'java'>Java</option>" +
                "</select>" +
                "<br>My Second Favorite language: </br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'html'>HTML</option>" +
                "<option value = 'java'>Java</option>" +
                "</select>" +
                "<br>My Third Favorite language: </br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'javascript'>JavaScript</option>" +
                "<option value = 'html'>HTML</option>" +
                "<option value = 'java'>Java</option>" +
                "</select>" +
                "<input type = 'submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";

        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice){
        String html = "<hl>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
    }

}
