package pruebaFinal.stepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import pruebaFinal.tasks.login_task;
import pruebaFinal.userInterface.login_POM;

public class login_Steps extends base{
	private login_POM Login;
	
	
	@Before
	public void setUp() {
		
		Natalia.can(BrowseTheWeb.with(driver));
	}
	
	
	@Given("^El usuario ingresa al login$")
    public void el_usuario_ingresa_al_login() throws Throwable {
		
		Natalia.wasAbleTo(Open.browserOn().the(Login));
}

    @When("^Ingresa credenciales validas$")
    public void ingresa_credenciales_validas() throws Throwable {
    	Natalia.attemptsTo(login_task.Using("46832409", "vuce2023"));
  }
    
    
    @Then("^Un usuario ingresa a la pagina principal$")
    public void un_usuario_ingresa_a_la_pagina_principal() throws Throwable {
    	
    	Natalia.should(seeThat(the(login_POM.TXT_Buscar), isVisible()));
    }
}
