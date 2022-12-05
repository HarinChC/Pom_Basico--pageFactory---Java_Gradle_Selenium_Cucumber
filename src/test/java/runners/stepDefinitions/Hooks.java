package runners.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runners.Browser_Manager.DriverManager;
import runners.Browser_Manager.DriverManagerFactory;
import runners.Browser_Manager.DriverType;

import java.util.concurrent.TimeUnit;
public class Hooks {
    private static WebDriver driver;
    private DriverManager driverManager;
    @Before
    public void inicializar() throws InterruptedException {
        driverManager = DriverManagerFactory.getManager(DriverType.Chrome);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//TIEMPO DE ESPERA DE ELEMENTOS
        Thread.sleep(2000);
    }
    @After
    public void finalizar(){
        driverManager.quitDriver();
    }
    public static WebDriver  getDriver(){
        return driver;
    }
}
