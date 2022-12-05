package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//
@RunWith(CucumberWithSerenity.class)
//donde busca los escenarios, y donde estan los pasos de los escenarios
@CucumberOptions(
        features = "src/test/java/features",
        glue = "runners/stepDefinitions",
        snippets = SnippetType.CAMELCASE

)


public class TesRunner {

}
