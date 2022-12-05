package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //Localizadores o variables para la pagina

    //Implementando pageFactory
    @FindBy(xpath = "//a[normalize-space()='The Little Tester comics']")
            private WebElement btnComics;
    //By btnComics = (By.xpath("//a[normalize-space()='The Little Tester comics']"));

    String txtTituloPagina ="Selenium, TestNG, Maven, Spring, IntelliJ and friends.";


    //Getter
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTxtTituloPagina() {
        return txtTituloPagina;
    }

    //Acciones o Funciones

    public boolean HomePageIsDisplayed() throws Exception {
        return this.getTitle().contains(getTxtTituloPagina());
    }
    public void clickEnTituloComics() throws Exception {
        this.click(btnComics);
    }

}
