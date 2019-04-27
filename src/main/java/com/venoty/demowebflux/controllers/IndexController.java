package com.venoty.demowebflux.controllers;

import com.venoty.demowebflux.repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class IndexController {

    @Autowired
    BakeryRepository bakeryRepository;

    @GetMapping(value = "/")
    public String getIndex(Model model) {

        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
                new ReactiveDataDriverContextVariable(bakeryRepository.findAll(), 1);

        // Classic
        /*model.addAttribute("orders",bakeryRepository.findAll());*/

        model.addAttribute("orders", reactiveDataDrivenMode);
        return "index";
    }
}
