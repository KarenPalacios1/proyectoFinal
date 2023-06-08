package pruebaFinal.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login/login.feature",
				glue = "pruebaFinal.stepDefinitions",
				tags = "")
public class login_Runner {

}
