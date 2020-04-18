package stepDefinitions;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base
{
    @Before("@mobileTest")
    public void beforeValidation()
    {
        System.out.println("Mobile Test Before Hook");
    }

    @After("@mobileTest")
    public void afterValidation()
    {
        System.out.println("Mobile Test After Hook");
    }

    @Before("@webTest")
    public void beforeValidationWeb()
    {
        System.out.println("---------Before Hook for Web----------");
    }

    @After("@webTest")
    public void afterValidationWeb()
    {
        System.out.println("---------After Hook for Web-----------");
    }

    @Before("@seleniumTests")
    public void beforeSeleniumTests()
    {
        System.out.println("---------Before Hook for SeleniumTests-----------");
    }

    @After("@seleniumTests")
    public void afterSeleniumTests()
    {
        driver.close();
        System.out.println("---------After Hook for SeleniumTests-----------");
    }

    @After("@smokeTest")
    public void aftersmokeTest()
    {
        driver.close();
        System.out.println("---------After Hook for @smokeTest-----------");
    }

}
