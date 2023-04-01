package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.AccountRepository;
import com.ericdschmid.budget.model.Account;
import com.ericdschmid.budget.model.AccountType;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("")
    public String displayAccountsIndex(Model model) {
        System.out.println("\n *** Account page content requested by browser");
        model.addAttribute("accounts", accountRepository.findAll());
        return "account/index";
    }

    @GetMapping("/add")
    public String displayAddAccountForm(Model model) {
        System.out.println("\n *** GET request submitted for add account form");
        model.addAttribute("account", new Account());
        model.addAttribute("types", AccountType.values());
        return "account/add-account-form";
    }

    @PostMapping("/add")
    public String processAddAccountForm(@ModelAttribute @Valid Account account, Errors errors,
                                        Model model) {
        System.out.println("\n *** POST request submitted to add " + account.getName() + " to the account repository");
        if (errors.hasErrors()) {
            System.out.println("\n *** Error occurred in the post handling");
            model.addAttribute("types", AccountType.values());
            return "account/add-account-form";
        } else {
            accountRepository.save(account);
            return "redirect:/account";
        }
    }

    // TODO #3 - Write edit/delete method
}
