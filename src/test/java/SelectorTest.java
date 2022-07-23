import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {
    @Test
    public void findElement(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();
        //Wyszukanie id przez By.id
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        //Wyszukanie name przez By.name
        WebElement findName = driver.findElement(By.name("fname"));
        //Wyszukanie ukrytyuch Hidden przez By.className
        WebElement findHidden = driver.findElement(By.className("topSecret"));
        //Wyszukanie Tagu input oraz listy inputów
        By inputLocator = By.tagName("input");
        WebElement findInput = driver.findElement(inputLocator);
        findInput.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());
        //fname,clickOnMe,topSecret, Tag imput
    }
}
