# 📍 Aula - Programação Orientada a Objetos
Esse repositorio será sobre o desenvolvimento da atividade de POO solicitada no dia 23 de Abril de 2024, segue mais detalhes abaixo:

# :books: Biblioteca em Java

Implementar um sistema simples que apresenta via CLI um menu de Biblioteca com as opções:
- Cadastrar Livro :heavy_check_mark:
- Listar Livros :heavy_check_mark:
- Atualizar Livro :heavy_check_mark:
- Excluir Livro :heavy_check_mark:
- Buscar Livro :heavy_check_mark:
- Emprestar Livro :x:
- Devolver Livro :x:

<h1> ⚙  Pré-requisitos do sistema  </h1>

- Sistema deverá persistir os dados em um Banco de Dados;
- Sistema não poderá utilizar nenhuma biblioteca externa para salvar dados; 
- Sistema deverá ser feito com arquitetura MVC;

<h1> ⚙  Pré-requisitos do ambiente  </h1>

- Java Development Kit (JDK);
- Maven;
- Spring;

<div> 
  <h1>Tecnologias Utilizadas</h1>

[![My Skills](https://skillicons.dev/icons?i=github,java,vscode)](https://skillicons.dev)
 </div>
<div>

<h1> ⚙ Banco de Dados </h1>

Vamos usar o Spring Initilizr 
```
https://start.spring.io/
```
Com as seguintes configurações:

- Project – Maven
- Language – Java
- Spring Boot – 3.2.5
- Packaging – Jar
- Java – 17
- Dependencies – H2 Database

<h1> Instalar as dependências </h1>
Navegue até o diretório do projeto (o diretório que contém o arquivo pom.xml) no terminal e execute o comando 

```
mvn install
```

<h1> Executar o projeto </h1>
 Ainda no diretório do projeto, execute o comando. Isso irá iniciar o servidor Spring Boot e executar a aplicação. 

```
mvn spring-boot:run
```









