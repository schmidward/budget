package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.CollectionData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/collection")
public class CollectionController {
    @GetMapping("")
    public String displayChargesIndexPage(Model model) {
        System.out.println("\n*** Charges page content requested");
        model.addAttribute("collection", CollectionData.findAll());
        return "collection/index";
    }
}
