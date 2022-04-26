package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sample_StepDefinitions {

    boolean progress;

    @Given("I am at school")
    public void iAmAtSchool() {

        System.out.println("I am at school step");

    }

    @Given("I am at work")
    public void iAmAtWork() {

        System.out.println("I am at work step");

    }

    @Given("I am at {string}")
    public void iAmSomewhere(String somewhere) {

        System.out.println("I am at "+somewhere+" step called via Examples");

    }

    @When("I do study")
    public void iDoStudy() {

        System.out.println("I studied");
        progress=true;

    }

    @When("I do work")
    public void iDoWork() {

        System.out.println("I worked");
        progress=true;

    }

    @When("I do {string}")
    public void iDoSomething(String something) {

        System.out.println("I "+something+ " step called via Examples");
        progress=true;

    }

    @And("I also do something else")
    public void iAlsoDoSomethingElse() {

        System.out.println("I did another thing now.");

    }

    @Then("I confirm that I learned")
    public void iValidateThatILearned() {

        System.out.println("I confirm my outcome");
        Assert.assertTrue(progress);

    }

    @Then("I confirm that I got paid")
    public void iValidateThatIGotPaid() {

        System.out.println("I confirm my outcome");
        Assert.assertTrue(progress);

    }

    @Then("I confirm that I {string}")
    public void iValidateThatSomethingHappened(String expected) {

        System.out.println("I confirm my outcome");
        Assert.assertTrue(progress);

    }
}
