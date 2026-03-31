package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();

        driver.get(url);
        return driver;


    }
}