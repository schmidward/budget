package com.ericdschmid.budget.data;

import com.ericdschmid.budget.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
