package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage{
//Localizadores o variables para la pagina

    //Implementando pageFactory
    @FindBy(className = "page-title")
            private WebElement txtTituloPagina;

    String tituloPaginaString = "Category: comics";

    public ComicsPage(WebDriver driver) {
        super(driver);
    }

    //Getter
    public String getTituloPaginaString() {
        return tituloPaginaString;
    }

    //Acciones o Funciones
    public boolean validacion() throws Exception {
        return    this.isDisplayed(txtTituloPagina) && this.getTest(txtTituloPagina).equals(tituloPaginaString);
    }

}
