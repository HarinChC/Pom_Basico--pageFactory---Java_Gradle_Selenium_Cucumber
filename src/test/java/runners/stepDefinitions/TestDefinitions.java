package runners.stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;

public class TestDefinitions extends TestBase {


    @Given("^El usuario se encuentra en la pagina Home de imalittlester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittlester() throws Throwable {
        homePage.HomePageIsDisplayed();
        Assert.assertTrue(homePage.HomePageIsDisplayed());

        //Assert.assertTrue(driver.getTitle().contains(homePage.getTxtTituloPagina()));
        Thread.sleep(2000);
    }


    @When("^Hace click sobre el boton the little tester comics$")
    public void hace_click_sobre_el_boton_the_little_tester_comics() throws Exception {
        homePage.clickEnTituloComics();

       Thread.sleep(2000);
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Exception {
        comicsPage.validacion();

        Assert.assertTrue("no esta en la pagina correcta",comicsPage.validacion());
        Thread.sleep(4000);

    }
}
