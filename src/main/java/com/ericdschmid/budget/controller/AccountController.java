package com.ericdschmid.budget.controller;

import com.ericdschmid.budget.data.AccountRepository;
import com.ericdschmid.budget.model.Account;
import com.ericdschmid.budget.model.AccountType;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
        return "account/add";
    }

    @PostMapping("/add")
    public String processAddAccountForm(@ModelAttribute @Valid Account account, Errors errors,
                                        Model model) {
        System.out.println("\n *** POST request submitted to add " + account.getName() + " to the account repository");
        if (errors.hasErrors()) {
            System.out.println("\n *** Error occurred in the post handling");
            model.addAttribute("types", AccountType.values());
            return "account/add";
        } else {
            accountRepository.save(account);
            return "redirect:/account";
        }
    }

    @GetMapping("/edit/{accountId}")
    public String displayEditAccountForm(Model model, @PathVariable int accountId) {
        System.out.println("\n *** GET request submitted for edit account form");
        Optional<Account> result = accountRepository.findById(accountId);
        if (result.isPresent()) {
            Account account = result.get();
            model.addAttribute("account", account);
            model.addAttribute("types", AccountType.values());
        }
        return "account/edit";
    }

    //TODO: Figure out this post mapping issue
    @PostMapping("/edit/{accountId}")
    public String processEditAccountForm(@ModelAttribute @Valid Account account, Errors errors, Model model, @PathVariable int accountId) {
        System.out.println("\n *** POST request submitted to edit " + account.getName() + " to the account repository");
        if (errors.hasErrors()) {
            Optional<Account> result = accountRepository.findById(accountId);
            if (result.isPresent()) {
                Account displayAccount = result.get();
                model.addAttribute("account", displayAccount);
                model.addAttribute("types", AccountType.values());
            }
            return "account/edit";
        } else {
            Account update = accountRepository.findById(accountId).get();
            update.setName(account.getName());
            update.setType(account.getType());
            update.setDateOpened(account.getDateOpened());
            accountRepository.save(account);
            return "redirect:/account";
        }
    }

}
