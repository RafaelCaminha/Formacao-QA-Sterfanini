#language: pt
#encoding: UTF-8


Funcionalidade: Acessar o sistema

@LoginFalha
Cenario: Usuário invalido
Quando eu informar o usuário "Ad"
E informar a senha "asd"
E clicar no botão login
Então o sistema exibe a mensagem de usuário invalido

@LoginSucesso
Cenario: Realizar login
Quando eu informar o usuário "Admin"
E informar a senha "admin123"
E clicar no botão login
Então o sistema exibe o usuário logado


