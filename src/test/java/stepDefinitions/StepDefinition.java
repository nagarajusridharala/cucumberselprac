package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import Cucumber.Automation.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition extends Base
{

    @Given("^User is on Home landing page$")
    public void user_is_on_home_landing_page() throws Throwable
    {
        System.out.println("user_is_on_home_landing_page");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)
            throws Throwable
    {
        System.out.println("login with username and password. " + strArg1 + ", " + strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable
    {
        System.out.println("home_page_is_populated");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_not_displayed_something(String strArg1) throws Throwable
    {
        System.out.println("Cards Status: " + strArg1);
    }

    @When("^User Sign Up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable
    {
        List<List<String>> myrawdata = data.raw();
        System.out.println(myrawdata.get(0).get(0));
        System.out.println(myrawdata.get(0).get(1));
        System.out.println(myrawdata.get(0).get(2));
        System.out.println(myrawdata.get(0).get(3));
        System.out.println(myrawdata.get(0).get(4));
        System.out.println(myrawdata.get(0).get(5));
    }

    @When("^User login into banking application with (.+) and (.+)$")
    public void user_login_into_banking_application_with_and(String username, String password) throws Throwable
    {
        System.out.println("Username: " + username + " , Passowrd: " + password);
    }

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable
    {
        System.out.println("broser launch");
    }

    @When("^Broser is started$")
    public void broser_is_started() throws Throwable
    {
        System.out.println("Enter URL");
    }

    @Then("^check if broser is started$")
    public void check_if_broser_is_started() throws Throwable
    {
        System.out.println("Open application");
    }
}
