package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.ChargeCollection;
import com.ericdschmid.budget.model.Account;
import com.ericdschmid.budget.model.Charge;
import com.ericdschmid.budget.model.ChargeCategory;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
public class CollectionController {

    @GetMapping("")
    public String displayChargesIndexPage(Model model) {
        System.out.println("\n*** Charges page content requested by browser");
        model.addAttribute("collection", ChargeCollection.findAll());
        return "collection/index";
    }
    @GetMapping("/add")
    public String addCharge(Model model) {
        System.out.println("\n *** GET request submitted for add charge page content");
        Account dummyAccount = new Account("First Bank", "Checking", "03-25-2022");
        model.addAttribute("account", dummyAccount);
        model.addAttribute("chargeCategory", ChargeCategory.values());
        model.addAttribute("charge", new Charge());
        return "collection/add-charge-form";
    }

    //TODO #1 - Update handling to capture account and pass into charge. Likely needs that optional stuff?
    @PostMapping("/add")
    public String processAddCharge(@ModelAttribute @Valid Charge charge, Errors errors, Model model) {
        System.out.println("\n *** POST request submitted to add charge of " + charge.getAmount() + " to the collection");
        if (errors.hasErrors()) {
            System.out.println("\n *** Error occurred in the post handling");
            Account dummyAccount = new Account("First Bank", "Checking", "03-25-2022");
            model.addAttribute("account", dummyAccount);
            model.addAttribute("chargeCategory", ChargeCategory.values());
            return "collection/add-charge-form";
        } else {
            ChargeCollection.add(charge);
            return "redirect:/collection";
        }
    }

    //TODO #2 - Write controller for delete entry
    //TODO #3 - Write controller for edit entry
    //TODO #4 - Write tests for the controller handling
}
