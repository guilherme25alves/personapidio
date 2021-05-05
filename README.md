# API para gerenciamento de Pessoas

Neste pequeno projeto, foi desenvolvido uma API para gerenciar pessoas ou contatos, através de uma API Rest, criada com Spring Boot

Durante o desenvolvimento, foi abordado os seguintes tópicos:

- Setup inicial do projeto com Spring Initialzr;
- Criação e mapeamento de Entidades no banco de dados (Uso do H2);
- Desenvolvimento de CRUD de usuários;
- Abordagem do conceito de cada operação e relação com os conceitos de REST;
- Desenvolvimento de testes unitários para validação das funcionalidades da API;
- Implantação e deploy automático através da plataforma do Heroku;

Para executar o projeto pelo terminal, usar o comando

```
mvn spring-boot:run
```

Link API no HEROKU

[Person API - Java Spring](https://personapidio-bootcamp.herokuapp.com/api/v1/people)

Após execução do comando, você terá acesso aos seguintes endpoints :

| Endpoint  |  Http Verbo  |  Funcionalidade  |
| ------------------- | ------------------- | ------------------- |
|  http://localhost:8080/api/v1/people/teste |  GET | Endpoint teste retorna apenas um texto |
| http://localhost:8080/api/v1/people |  GET | Retorna uma lista de Pessoas |
| http://localhost:8080/api/v1/people |  POST | Persisti um novo objeto Pessoa |
| http://localhost:8080/api/v1/people/{id} |  GET | Recupera uma pessoa a partir de um ID |
| http://localhost:8080/api/v1/people/{id} |  PUT | Atualiza dados de uma pessoa a partir de um ID |
| http://localhost:8080/api/v1/people/{id} |  DELETE | Remove uma pessoa a partir de um ID |

Pré-requisitos para correta execução do projeto:
- Java 11 ou versões superiores;
- Maven 3.6.3 ou versões superiores.

Bibliotecas utilizadas para desenvolvimento
- H2 Database
- Lombok
- Map struct
- JPA
