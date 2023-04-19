package com.ericdschmid.budget.data;

import com.ericdschmid.budget.model.Charge;
import org.springframework.data.repository.CrudRepository;

// This will be replaced by persistent database tracking. The functionality needs to be developed before hooking anything up.
public interface ChargeRepository extends CrudRepository<Charge, Integer> {
}
