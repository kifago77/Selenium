import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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

    }


    }


