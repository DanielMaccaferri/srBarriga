package br.com.srbarriga;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import br.com.srbarriga.core.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.srbarriga.steps" }, 
                 features = {"src/main/java/br/com/srbarriga/feature" }, 
                 plugin = {  "pretty", "html:target/cucumber-reports" }, 
                 tags = { "@cadastrarvalido " })

public class Runner {
	@AfterClass
	public static void encerraTeste() {
		Driver.encerraDriver();
	}

}