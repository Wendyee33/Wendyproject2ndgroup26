package WendyPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage {

 WebDriver driver;

 public DashboardPage(WebDriver driver) {
  this.driver = driver;
 }
  public void clickPassWord(){
  driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
 }
 public void summaryFillPracticeFormisDisplayed() {
  driver.findElement(By.xpath("//*[@id=\"basic-form-requirements\"]/summary")).isDisplayed();
  driver.findElement(By.id("name")).sendKeys("wendy");
  driver.findElement(By.id("email")).sendKeys("wen@gmail.com");
  driver.findElement(By.id("age")).sendKeys("49");
  driver.findElement(By.id("gender")).sendKeys("Female");
  driver.findElement(By.id("country")).sendKeys("South Africa");
  driver.findElement(By.id("experience")).sendKeys("Beginner (0-1 years)");
 }
  public void clickPractiseForm (){
  driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/label")).click();
 }

 public void clickSkillTesting(){
  driver.findElement(By.xpath("//*[@id=\"skill-testing\"]")).click();
 }

 public void enterComments(){
  driver.findElement(By.id("comments")).sendKeys("getting better");
 }

 public void acceptTerms() {
  driver.findElement(By.id("terms")).click();
 }

 public void submitForm() {
  driver.findElement(By.id("submit-btn")).click();
 }

 public void isPractiseSectionDisplayed() {
  driver.findElement(By.xpath("//*[@id=\"practice-section\"]/div[3]/div")).isDisplayed();
 }

 public void toggleSubmission() {
  driver.findElement(By.id("submissions-toggle-btn")).click();
 }

 public void viewSubmission() {
  driver.findElement(By.id("view-submission-0")).click();

 }

}
