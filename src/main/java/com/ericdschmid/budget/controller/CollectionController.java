package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.AccountRepository;
import com.ericdschmid.budget.data.ChargeTagRepository;
import com.ericdschmid.budget.data.ChargeRepository;
import com.ericdschmid.budget.model.Account;
import com.ericdschmid.budget.model.Charge;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private ChargeRepository chargeRepository;
    @Autowired
    private ChargeTagRepository tagRepository;
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("")
    public String displayChargesIndexPage(Model model) {
        System.out.println("\n*** Charges page content requested by browser");
        model.addAttribute("collection", chargeRepository.findAll());
        return "collection/index";
    }
    @GetMapping("/add")
    public String addCharge(Model model) {
        System.out.println("\n *** GET request submitted for add charge page content");
        model.addAttribute("account", accountRepository.findAll());
        model.addAttribute("chargeCategory", tagRepository.findAll());
        model.addAttribute("charge", new Charge());
        return "collection/add-charge-form";
    }

    //TODO #1 - Update handling to capture account and pass into charge. Likely needs that optional stuff?
    @PostMapping("/add")
    public String processAddCharge(@ModelAttribute @Valid Charge charge, Errors errors, Model model) {
        System.out.println("\n *** POST request submitted to add charge of " + charge.getDetails().getAmount() + " to the collection");
        if (errors.hasErrors()) {
            System.out.println("\n *** Error occurred in the post handling");
            model.addAttribute("account", accountRepository.findAll());
            model.addAttribute("chargeCategory", tagRepository.findAll());
            return "collection/add-charge-form";
        } else {
            chargeRepository.save(charge);
            return "redirect:/collection";
        }
    }

    //TODO #2 - Write controller for delete entry
    //TODO #3 - Write controller for edit entry
    //TODO #4 - Write tests for the controller handling
}
