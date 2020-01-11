package br.com.srbarriga.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.srbarriga.core.BasePage;
import br.com.srbarriga.core.Driver;

public class CadastroPage extends BasePage {

	public CadastroPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "nome")
	WebElement caixaDeTextoNome;

	@FindBy(id = "email")
	WebElement caixaDeTextoEmail;

	@FindBy(id = "senha")
	WebElement caixaDeTextoSenha;

	@FindBy(xpath = "//input[@value='Cadastrar']")
	WebElement botaoCadastrar;
	
	@FindBy(xpath = "/html/body/div[1]")
	WebElement mensagemUsuarioInseridoComSucesso;

	public WebElement getMensagemUsuarioInseridoComSucesso() {
		return mensagemUsuarioInseridoComSucesso;
	}

	public void setMensagemUsuarioInseridoComSucesso(WebElement mensagemUsuarioInseridoComSucesso) {
		this.mensagemUsuarioInseridoComSucesso = mensagemUsuarioInseridoComSucesso;
	}

	public WebElement getCaixaDeTextoNome() {
		return caixaDeTextoNome;
	}

	public void setCaixaDeTextoNome(WebElement caixaDeTextoNome) {
		this.caixaDeTextoNome = caixaDeTextoNome;
	}

	public WebElement getCaixaDeTextoEmail() {
		return caixaDeTextoEmail;
	}

	public void setCaixaDeTextoEmail(WebElement caixaDeTextoEmail) {
		this.caixaDeTextoEmail = caixaDeTextoEmail;
	}

	public WebElement getCaixaDeTextoSenha() {
		return caixaDeTextoSenha;
	}

	public void setCaixaDeTextoSenha(WebElement caixaDeTextoSenha) {
		this.caixaDeTextoSenha = caixaDeTextoSenha;
	}

	public WebElement getBotaoCadastrar() {
		return botaoCadastrar;
	}

	public void setBotaoCadastrar(WebElement botaoCadastrar) {
		this.botaoCadastrar = botaoCadastrar;
	}
}
