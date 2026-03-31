package WendyPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utils.Base.driver;


public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
public void BrowserFactory(){
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
}
public void clickLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
}
public void HomePageisDisplayed(){
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/h2")).isDisplayed();
}
public void clickButton(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
}
public void clicksubmit(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
}
public void headingButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"practice-heading\"]"));
        Thread.sleep(3000);
    }

}

