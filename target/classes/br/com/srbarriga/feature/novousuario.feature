#language:pt
#encoding UTF-8

@geral
Funcionalidade: Cadastrar usuário
								Eu como usuario desejo realizar 
								um cadastro no site.
	
	
@cadastrarvalido									
Cenario: Cadastrar um usuário válido
				 Dado que eu acesse o site
				 Quando eu preencho  dados válidos
				 Entao o usuario e cadastrado com sucesso.	
				 
@cadastroinvalido
Cenario: Cadastrar usuario invalido
				Dado que eu acesse o site
				Quando eu preencho com dados inválidos
				Então o usuário não é cadastrado.


				 
