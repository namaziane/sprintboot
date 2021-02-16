package com.pluralsight.bdd.supersmoothy;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothCategory {

    Map<String, Integer> pointPerCategory = new HashMap<>();
    DrickCatalogue drickCatalogue;

    SuperSmoothCategory(DrickCatalogue drickCatalogue) {
        this.drickCatalogue = drickCatalogue;
    }

    public void setPointsPerCategory(String c, Integer p) {
        pointPerCategory.put(c, p);
    }

    public Integer getPointFor(String drink) {
        return pointPerCategory.get(categoryOf(drink));
    }

    private String categoryOf(String drink) {
        return drickCatalogue.getCategoryOf(drink);
    }
}
