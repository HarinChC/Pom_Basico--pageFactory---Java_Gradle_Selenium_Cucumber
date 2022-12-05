package runners.Browser_Manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    @Override
    public void crearDriver(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();

    }
}
