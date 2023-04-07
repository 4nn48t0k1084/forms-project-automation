import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Test{

@Test
    public void Test(){
    String url = "https://www.google.com/";
    String query = "best work for a qa london";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASTOKLOS\\IdeaProjects\\selenium\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get(url);
        driver.findElement(By.id("L2AGLb")).sendKeys(Keys.ENTER);
        WebElement search = driver.findElement(By.name("q"));

search.sendKeys(query);
search.submit();
driver.get(url);
driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.RNmpXc")).click();


    }

















}
