# desafioSl

Desenvolver uma API (Restful) simples que receba uma requisição HTTP com uma string, e encontre o primeiro caractere Vogal,
após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita na string.

Deverá ser executado o comando "mvn clean install" para que as dependências sejam baixadas para o repositório e o "war" seja criado

Fazer o deploy do war utilizando o maven ou "adicionando" ao tomcat

Com a aplicação rodando:

Adicionar "/verificaVogal"
  - Para poder visualizar todas as palavras que foram testadas até o momento

Adicionar "/verificaVogal/{i}" onde {i} é a palavra que será testada
 - Para poder encontrar a vogal

 