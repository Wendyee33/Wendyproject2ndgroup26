package Tests;
import Utils.BrowserFactory;
import Utils.TakeScreenShots;
import WendyPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import WendyPages.LoginPage;
import WendyPages.DashboardPage;

import static Utils.Base.driver;

public class WendyTests {

    public void verifyHomePageIsDisplayed() {
        TakeScreenShots takeScreenShots = new TakeScreenShots();
        takeScreenShots.takesSnapShot(driver, "HomePageScreenshot1");
    }

    @Test
    public void logintowendyprojectTests() {
        driver = BrowserFactory.startBrowser("Edge", "https://ndosisimplifiedautomation.vercel.app/");
    }

    @Test
    public void loginToHomePage() throws InterruptedException {

        driver = new org.openqa.selenium.edge.EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(3000);

//BROWSER PAGE
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        DashboardPage dashboard = new DashboardPage(driver);

        //LOGIN PAGE
        loginPage.clickLoginButton();
        loginPage.emailDetails();
        loginPage.enterPassword();
        loginPage.clickSubmit();
        loginPage.verifyLoginPageIsDisplayed();
        verifyHomePageIsDisplayed();
        Thread.sleep(2000);

// HOMEPAGE
        homePage.HomePageisDisplayed();
        homePage.clickButton();
        homePage.clicksubmit();
        homePage.headingButton();
        Thread.sleep(3000);


// DASHBOARD
        dashboard.clickPassWord();
        dashboard.summaryFillPracticeFormisDisplayed();
        dashboard.clickPractiseForm();
        dashboard.clickSkillTesting();
        dashboard.enterComments();
        dashboard.acceptTerms();
        dashboard.submitForm();
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();

    }
}