package br.com.srbarriga;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.srbarriga.steps" }, features = {
		"src/main/java/br/com/srbarriga/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" }, tags = { "@geral" })

public class Runner {
	@AfterClass
	public static void encerraTeste() {
		// Driver.encerraDriver();
	}

}