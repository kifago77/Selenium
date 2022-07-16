import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openGoogle(){
        System.setProperty("webdriver.chrome.driver","D:\\DriverChrom\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","D:\\FirefoxDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
    }
    @Test
    public void openIe(){
        System.setProperty("webdriver.ie.driver","D:\\InternetExplorerDriver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
        InternetExplorerOptions option = new InternetExplorerOptions();
        option.withInitialBrowserUrl("https://www.google.pl/");
        WebDriver driver = new InternetExplorerDriver(option);
    }

    public WebDriver getDriver(String browser){
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","D:\\DriverChrom\\chromedriver_win32\\chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver","D:\\FirefoxDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
                return new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver","D:\\InternetExplorerDriver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Illegal argument exception!!");
        }
    }
    @Test
    public void openBrowser(){
        WebDriver driver = getDriver("chrome");
        driver.get("https://www.google.pl/");
        driver.manage().window().maximize();
        driver.close();

    }

}
