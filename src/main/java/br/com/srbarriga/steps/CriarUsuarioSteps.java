package br.com.srbarriga.steps;

import static br.com.srbarriga.core.Driver.getDriver;

import br.com.srbarriga.funcionalidades.CadastroFuncionalidade;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class CriarUsuarioSteps {
	
	String url = "https://srbarriga.herokuapp.com";
	CadastroFuncionalidade cadastro = new CadastroFuncionalidade();

	@Dado("^que eu acesse o site$")
	public void que_eu_acesse_o_site() throws Throwable {
		getDriver().get(url + "/cadastro");

	}

	@Quando("^eu preencho  dados válidos$")
	public void eu_preencho_dados_válidos() throws Throwable {
		cadastro.escreverCampoNome();
		cadastro.escreverCampoEmail();
		cadastro.escreverCampoSenha();
		cadastro.clicarBotaoCadastrar();
	}

	@Entao("^o usuario e cadastrado com sucesso\\.$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {
		cadastro.validarResultado();
	}

}
