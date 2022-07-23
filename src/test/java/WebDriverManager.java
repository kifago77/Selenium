import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriverManager {
    @Test
    public void browser(){
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
        driver.manage().window().maximize();
        

    }
    //Konfiguracja , ustawienia przeglądarki
    @Test
    public void browser1(){
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.pl");
    }
}
