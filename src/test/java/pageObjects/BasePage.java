package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;

    public  BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element) throws Exception {
        try {
                element.click();
            }catch (Exception e){
                throw new Exception("No se pudo clickear el elemento : "+element);
            }
    }
    public boolean isDisplayed(WebElement element) throws Exception {
        try {
                return   element.isDisplayed();
            } catch (Exception e) {
                throw new Exception("No se pudo visualizar el elemento : " + element);
        }

    }
    public String getTest(WebElement element) throws Exception {
        try {
          return   element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el Texto  del elemento : "+element);
        }

    }
    public String getTitle() throws Exception {
        try {
            return   driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el Titulo de la pagina");
        }

    }

}
