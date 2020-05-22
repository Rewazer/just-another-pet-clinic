/*
 * Created by SS on 22/05/2020
 */

package ru.hcc.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
