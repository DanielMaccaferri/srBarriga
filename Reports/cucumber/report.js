$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("novousuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "#encoding UTF-8"
    }
  ],
  "line": 5,
  "name": "Cadastrar usuário",
  "description": "\t\t\t\t\t\tEu como usuario desejo realizar \r\n\t\t\t\t\t\tum cadastro no site.",
  "id": "cadastrar-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@geral"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Cadastrar um usuário válido",
  "description": "",
  "id": "cadastrar-usuário;cadastrar-um-usuário-válido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 10,
      "name": "@cadastrarvalido"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que eu acesse o site",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "eu preencho  dados válidos",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "o usuario e cadastrado com sucesso.",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarUsuarioSteps.que_eu_acesse_o_site()"
});
formatter.result({
  "duration": 7866287100,
  "status": "passed"
});
formatter.match({
  "location": "CriarUsuarioSteps.eu_preencho_dados_válidos()"
});
formatter.result({
  "duration": 1261140700,
  "status": "passed"
});
formatter.match({
  "location": "CriarUsuarioSteps.o_usuario_e_cadastrado_com_sucesso()"
});
formatter.result({
  "duration": 123988500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Cadastrar usuario invalido",
  "description": "",
  "id": "cadastrar-usuário;cadastrar-usuario-invalido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 16,
      "name": "@cadastroinvalido"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "que eu acesse o site",
  "keyword": "Dado "
});
formatter.step({
  "line": 19,
  "name": "eu preencho com dados inválidos",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "o usuário não é cadastrado.",
  "keyword": "Então "
});
formatter.match({
  "location": "CriarUsuarioSteps.que_eu_acesse_o_site()"
});
formatter.result({
  "duration": 405500900,
  "status": "passed"
});
formatter.match({
  "location": "CriaCadastroInvalidoSteps.eu_preencho_com_dados_inválidos()"
});
formatter.result({
  "duration": 56900,
  "status": "passed"
});
formatter.match({
  "location": "CriaCadastroInvalidoSteps.o_usuário_não_é_cadastrado()"
});
formatter.result({
  "duration": 16000,
  "status": "passed"
});
});