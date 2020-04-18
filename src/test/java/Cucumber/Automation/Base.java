package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException
    {
        try
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                "C:\\Users\\nasridhara\\G2S_automation_workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
            prop.load(fis);
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nasridhara\\Downloads\\Softwares\\chromedriver_win32_v79\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
            driver.manage().window().maximize();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Check getDriver method.");
        }
        return driver;

    }
}
