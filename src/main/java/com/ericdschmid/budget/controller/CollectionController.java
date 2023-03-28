package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.CollectionData;
import com.ericdschmid.budget.model.Account;
import com.ericdschmid.budget.model.Charge;
import com.ericdschmid.budget.model.ChargeCategory;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
public class CollectionController {



    @GetMapping("")
    public String displayChargesIndexPage(Model model) {
        System.out.println("\n*** Charges page content requested by browser");
        model.addAttribute("collection", CollectionData.findAll());
        return "collection/index";
    }
    @GetMapping("/add")
    public String addCharge(Model model) {
        System.out.println("\n *** GET request submitted for add charge page content");
        Account dummyAccount = new Account("First Bank", "Checking", "03-25-2022");
        model.addAttribute("account", dummyAccount);
        model.addAttribute("chargeCategory", ChargeCategory.values());
        //TODO #1 - Add a model to pass for model binding eventually
        return "collection/add-charge-form";
    }

    //TODO #1 - FIX post handeling where the form goes to /collection/collection/add
    @PostMapping("/add")
    public String processAddCharge(@ModelAttribute @Valid Charge charge, Errors errors, Model model) {
        System.out.println("\n *** POST request submitted to add charge of " + charge.getAmount() + " to the collection");
        if (errors.hasErrors()) {
            Account dummyAccount = new Account("First Bank", "Checking", "03-25-2022");
            model.addAttribute("account", dummyAccount);
            model.addAttribute("chargeCategory", ChargeCategory.values());
            return "collection/add-charge-form";
        } else {
            CollectionData.add(charge);
            return "redirect:/collection";
        }
    }

}
