package runners.Browser_Manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void crearDriver();
    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            crearDriver();
        }
        return driver;
    }
}
