package com.pluralsight.bdd.supersmoothy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperSmothyStepDef {
    DrickCatalogue drinkCatalogue = new DrickCatalogue();
    SuperSmoothCategory superSmoothCategory = new SuperSmoothCategory(drinkCatalogue);
    MorningFreshnessMember michel;

    @Given("the following drinks categories")
    public void the_following_drinks_categories(List<Map<String, String>> maps) {
        maps.forEach(map -> {
            String d = map.get("Drink");
            String c = map.get("Category");
            Integer p = Integer.parseInt(map.get("Points"));
            drinkCatalogue.addDrink(d, c);
            superSmoothCategory.setPointsPerCategory(c, p);
        });
    }

    @Given("^(.*) is a morning freshness Member$")
    public void micheal_is_a_morning_freshness_Member(String nmae) {
        michel = new MorningFreshnessMember(nmae, superSmoothCategory);
    }

    //@When("^(.*) pushes(\\d+) (.*) drinks$")
    @When("^(.*) pushes (\\d+) (.*) drinks$")
    public void micheal_pushes_Banana_drinks(String name,
                                             Integer amount,
                                             String categ) {
        michel.orders(amount, categ);
    }

    @Then("he should earn {int}")
    public void he_should_earn(Integer expectedPoints) {
        assertThat(michel.getPoints()).isEqualTo(expectedPoints);
    }
}
