package com.kishantalati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: kishan talati
 * Date: 09/07/15
 * Time: 5:23 PM
 */
@Controller
public class NavigationController {

    @RequestMapping(value={"/", "index"}, method= RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
