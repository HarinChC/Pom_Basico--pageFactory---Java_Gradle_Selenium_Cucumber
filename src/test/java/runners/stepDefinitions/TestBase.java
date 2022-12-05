package runners.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ComicsPage;
import pageObjects.HomePage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    protected ComicsPage comicsPage = PageFactory.initElements(driver,ComicsPage.class);
}
