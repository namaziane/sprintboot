package com.pluralsight.bdd.calculator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDef {
    Calculator calculator;
    double result;

    @Given("a have a calculator")
    public void a_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {double} and {double}")
    public void i_add_and(double double1, double double2) {
        //result = 0.0;
        result = calculator.add(double1, double2);
    }

    @When("^I substract (.*) from (.*)$")
    public void i_substract_from(double double1, double double2) {
        //result = 0.0;
        result = calculator.substract(double1, double2);
    }

    @And("^his favorite flavirs are :$")
    public void testing(List<String> double1) {
        result = 0.0;
    }

    @And("^his favorite flavirs are2 :$")
    public void testing2(Map<String, Integer> double1) {
        result = 0.0;
    }

    @And("^his favorite flavirs are3 :$")
    public void testing3(List<Map<String, String>> double1) {
        result = 0.0;
    }

/*    @And("^(.*)his favorite flavirs are4 :$")
    public void testing4(String qlqChose, List<Map<String, String>> double1) {
        result = 0.0;
    }
*/
    @When("^s?he has some great an? hisbend and s?he matches all to things how hase s?he$")
    public void testing(String double1, String double2, String douxble2) {
        result = 0.0;
    }

    @When("^s?he (?:orders|has ordered) (\\d) (.*) smothy$")
    public void testing2(String double1, Integer double2, String douxble2) {
        result = 0.0;
    }

    @When("I divide {double} from {double}")
    public void i_divide_from(double double1, double double2) {
        // Write code here that turns the phrase above doubleo concrete actions
        //result = 0.0;
        result = double1 / double2;
    }

    @Then("I should have {double}")
    public void i_should_have(Double double1) {
        assertThat(result).isEqualTo(double1);
    }

}
