package pruebaFinal.stepDefinitions;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class base {

	public static Actor Natalia = Actor.named("Natalia");
	
	@Managed(uniqueSession = true)
	public static WebDriver driver;

}
