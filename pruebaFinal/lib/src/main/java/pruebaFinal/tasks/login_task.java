package pruebaFinal.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebaFinal.userInterface.login_POM;

public class login_task implements Task {
	
	private String username;
	private String password;
	
	private login_task(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
	public static login_task Using(String username, String password) {
		return new login_task(username,password);
		
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				Enter.theValue(username).into(login_POM.TXT_Username),
				Enter.theValue(password).into(login_POM.TXT_Password),
				Click.on(login_POM.BTN_Login)
				);
		
	}
	
	
}
