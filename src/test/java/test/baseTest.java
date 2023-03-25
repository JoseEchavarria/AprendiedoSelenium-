package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {

    private String PATH_DRIVER = "D:\\repaso\\demo\\src\\main\\resources\\drivers\\chromedriver.exe";
    protected String baseUrl = "https://automationexercise.com/";
    WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new ChromeDriver(options);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    @AfterMethod
    public void close() {
        driver.close();
    }

}
