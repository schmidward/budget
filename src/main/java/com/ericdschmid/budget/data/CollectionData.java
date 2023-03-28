package com.ericdschmid.budget.data;

import com.ericdschmid.budget.model.Charge;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// This will be replaced by persistent database tracking. The functionality needs to be developed before hooking anything up.
public class CollectionData {

    private static final Map<Integer, Charge> chargeCollection = new HashMap<>();

    public static void add(Charge charge) { chargeCollection.put(charge.getId(), charge); }

    public static Charge findById(int id) {
        return chargeCollection.get(id);
    }

    public static Collection<Charge> findAll() {
        return chargeCollection.values();
    }

    public static void remove(int id) {
        chargeCollection.remove(id);
    }

}
