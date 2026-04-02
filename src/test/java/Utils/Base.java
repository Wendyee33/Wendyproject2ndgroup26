package Utils;
import WendyPages.HomePage;
import WendyPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import static Utils.BrowserFactory.driver;

public class Base {

    public static WebDriver driver;

    public static WebDriver startBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        return driver;
    }

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    TakeScreenShots takeScreenShots=new TakeScreenShots();
}