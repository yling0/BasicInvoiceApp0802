package me.yling.basicinvoiceapp0802.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping ("/index")
    public String showIndex(Model model)
    {
        model.addAttribute("myMessage");
        return "index";
    }

    @GetMapping ("/login")
    public String showLogin(Model model)
    {
        model.addAttribute("myMessage");
        return "login";
    }

    @GetMapping ("/addproduct")
    public String addproductForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "addproduct";
    }

    @GetMapping ("/listproducts")
    public String showListproducts(Model model)
    {
        model.addAttribute("myMessage");
        return "listproducts";

    }

    @PostMapping ("/addproduct")
    public String addproductSubmit(@ModelAttribute Product addproduct){
        return "productdetails";

    }



}
