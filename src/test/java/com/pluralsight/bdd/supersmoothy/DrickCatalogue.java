package com.pluralsight.bdd.supersmoothy;

import java.util.*;

public class DrickCatalogue {
    Map<String, String> categories = new HashMap<>();

    public void addDrink(String d, String c) {
        categories.put(d, c);
    }

    public String getCategoryOf(String drink) {
        return categories.get(drink);
    }
}
