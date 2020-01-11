package br.com.srbarriga.funcionalidades;

import com.github.javafaker.Faker;

import br.com.srbarriga.pages.CadastroPage;
import org.junit.Assert;

public class CadastroFuncionalidade {

	private CadastroPage cadastro;
	Faker faker = new Faker();

	public CadastroFuncionalidade() {
		cadastro = new CadastroPage();
	}

	public void escreverCampoNome() {
		cadastro.getCaixaDeTextoNome().sendKeys(faker.funnyName().name());
	}

	public void escreverCampoEmail() {
		cadastro.getCaixaDeTextoEmail().sendKeys(faker.internet().emailAddress());
	}

	public void escreverCampoSenha() {
		cadastro.getCaixaDeTextoSenha().sendKeys(faker.internet().password());
	}

	public void clicarBotaoCadastrar() {
		cadastro.getBotaoCadastrar().click();
	}

	public void validarResultado() {
		String resultado = "Usuário inserido com sucesso";
		String resultadosTela = cadastro.getMensagemUsuarioInseridoComSucesso().getText();
		Assert.assertTrue(resultado.contains(resultadosTela));

	}

}
