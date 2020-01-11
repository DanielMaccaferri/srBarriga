package br.com.srbarriga.core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import static br.com.srbarriga.core.Driver.getDriver;

public class BasePage {

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void escrever(By by, String escreve) {
		getDriver().findElement(by).sendKeys(escreve);
	}

	public void selecionaCampo(By by, int index) {
		Select select = new Select(getDriver().findElement(by));
		select.selectByIndex(index);
	}

}
