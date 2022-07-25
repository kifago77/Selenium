import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorXpath {

@Test
    public void xpathFindElement(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
    driver.manage().window().maximize();
    By fullPathUl = By.xpath("/html/body/div/ul");
    driver.findElement(fullPathUl);
    //clickOnMe
    By idButton = By.xpath("/html/body/button[@id='clickOnMe']");
    driver.findElement(idButton);
    //fname

    By findName = By.xpath("/html/body/input[@name='fname']");
    driver.findElement(findName);
    //topSecret,przez podwojny slesh wchodze bezposrednio do body omijajac html
    By secret = By.xpath("//body/p[@class='topSecret']");
    driver.findElement(secret);
    //Elementy po tekscie by.linkText
    By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
    WebElement schoolLink = driver.findElement(linkText);
    //A żeby znaleźć po czesci tekstu nalezy uzyc contains
    By partialText = By.xpath("//a[contains(text(),'Visit')]");
    WebElement partialSchool = driver.findElement(partialText);
    //Imputy
    By inputLocation = By.xpath("//input");
    WebElement input = driver.findElement(inputLocation);
    input.sendKeys("Pierwszy");
    List<WebElement> inputs = driver.findElements(inputLocation);
    System.out.println("Ilość inputów"+" "+ inputs.size());


    }


    }


