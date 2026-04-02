package WendyPages;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {

WebDriver driver;

public void verifyLoginPageIsDisplayed()throws InterruptedException{
    Thread.sleep(5000);
}
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLoginButton(){
    driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        }
    public void emailDetails() {
            driver.findElement(By.id("login-email"))
                    .sendKeys("wen@gmail.com");
        }
    public void enterPassword() {
            driver.findElement(By.id("login-password"))
                    .sendKeys("*12345678");
        }
    public void clickSubmit() {
        driver.findElement(By.id("login-submit")).click();

    }
}