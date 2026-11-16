# Java10x — Desafio Backend Pleno

Projeto de estudo de um desafio de backend pleno, com uma API REST para cadastro e consulta de relógios.

## Tecnologias

- Java 17
- Spring Boot, Spring Web MVC e Spring Data JPA
- PostgreSQL
- Bean Validation e Lombok
- Maven Wrapper

## Funcionalidades em desenvolvimento

- Cadastro, consulta, atualização e remoção de relógios.
- Listagem com paginação, filtros e ordenação.
- Conversão entre entidades e DTOs.

## Execução local

É necessário ter Java 17 e PostgreSQL. Crie o banco `relogiosX` e ajuste a conexão em `src/main/resources/application.properties` para o seu ambiente. A senha é lida da variável de ambiente `DB_PASSWORD`.

No PowerShell:

```powershell
$env:DB_PASSWORD = "sua-senha-local"
.\mvnw.cmd spring-boot:run
```

A rota base da API é `/api/relogios`.

## Estado do estudo

O projeto está em desenvolvimento e este commit registra o progresso atual. Há pendências no código, incluindo a sintaxe de `buscarPorId` e a definição de `NaoEncontradoException`; a compilação e os testes ainda precisam ser concluídos.
