package pruebaFinal.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://prewildfly.vuce.gub.uy/VUCE/servlet/loginvuce")

public class login_POM extends PageObject {

	
	
	public static Target TXT_Username = Target.the("The input the username").located(By.xpath("//input[@id='W0018vDOCUMENTO']"));
	public static Target TXT_Password = Target.the("The input the password").located(By.xpath("//input[@id='W0018vUSERPASSWORD']"));
	public static Target BTN_Login = Target.the("The input the Login").located(By.xpath("//tbody/tr[1]/td[1]/p[4]/input[1]"));
	
	
	public static Target TXT_Buscar = Target.the("El input que dice que se encuentra en la página").located(By.xpath("//input[@id='vBUSCAR_MPAGE']"));

}
