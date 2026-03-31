import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.helpers.ThreadLocalMapOfStacks;
import org.testng.annotations.Test;

public class logintoWendyproject {

    WebDriver driver;

    @Test//*[@id="app-main-content"]/section/div[1]/h2
    public void logintowendyprojectTests() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver .get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("email-login")).sendKeys("wen@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("*12345678");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/h2")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"practice-heading\"]"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"basic-form-requirements\"]/summary")).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("wendy");
        driver.findElement(By.id("email")).sendKeys("wen@gmail.com");
        driver.findElement(By.id("age")).sendKeys("49");
        driver.findElement(By.id("gender")).sendKeys("Female");
        driver.findElement(By.id("country")).sendKeys("South Africa");
        driver.findElement(By.id("experience")).sendKeys("Beginner (0-1 years)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"skill-testing\"]")).click();
        driver.findElement(By.id("comments")).sendKeys("getting better");
        driver.findElement(By.id("terms")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"practice-section\"]/div[3]/div")).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("view-submission-0")).click();
        Thread.sleep(3000);

        driver.quit();


    }

}


//