# API REST para gerenciamento de pessoas sendo desenvolvida durante o boocamp da Digitial Innnovation One

:computer:

API REST sendo desenvolvida com:

- Java 16
- Maven 3.8.1
- Junit5  
- IntelliJ IDEA Community Edition
- Controle de versão com GIT
- Armazenamento no Github   
- Spring Boot
- H2 database
- Heroku para deploy
- Postman para simular a execução das funcionalidades da API

####Para executar o projeto pelo terminal, digite:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```

####URI do deploy no heroku:

```
https://personapi-management.herokuapp.com/api/v1/people
```

### Tarefas já definidas:

- [x] Instalar os programas necessários
- [x] Configurar o ambiente de desenvolvimento
- [x] Configurar as dependências em pom.xml
- [x] Configurar a versão do Java e H2 em application.properties
- [x] Criar o README.md
- [x] Definir a organização inicial do projeto 
- [x] Criar o repositório no Github
- [x] Criar as entidades *Person* e *Phone*
- [x] Criar o service *PersonService*
- [x] Criar os DTO's
- [x] Criar as Exceptions
- [x] Criar os Services
- [x] Insere teste com Junit5 
- [x] Deploy no Heroku 
- [ ] Documentação para fazer chamadas da API no Heroku
- [ ] Acrescentar
