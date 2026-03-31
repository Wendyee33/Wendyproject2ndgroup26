package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

    public static WebDriver driver;

    public static WebDriver startBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        return driver;
    }

}