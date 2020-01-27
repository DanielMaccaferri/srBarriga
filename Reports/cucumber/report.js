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
  "duration": 12404277900,
  "status": "passed"
});
formatter.match({
  "location": "CriarUsuarioSteps.eu_preencho_dados_válidos()"
});
formatter.result({
  "duration": 1380954000,
  "status": "passed"
});
formatter.match({
  "location": "CriarUsuarioSteps.o_usuario_e_cadastrado_com_sucesso()"
});
formatter.result({
  "duration": 31635600,
  "status": "passed"
});
formatter.after({
  "duration": 296755100,
  "status": "passed"
});
});