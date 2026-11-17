# Java10x — Desafio Backend Pleno

Este projeto backend de nível pleno foi utilizado como prática de estudo, a partir de um desafio de desenvolvimento de uma API REST para gerenciamento de relógios.

O objetivo foi exercitar Java e Spring Boot, praticando a organização de um backend em camadas, a persistência em banco relacional e a construção de consultas e respostas HTTP.

## Tecnologias utilizadas

- Java 17 e Spring Boot.
- Spring Web MVC, Spring Data JPA e Hibernate.
- PostgreSQL.
- Jakarta Bean Validation e Lombok.
- Maven Wrapper, Git e GitHub.

## O que foi estudado

### Arquitetura e organização

- Separação de responsabilidades entre controller, service e repository.
- Injeção de dependências com Spring e `@RequiredArgsConstructor`.
- DTOs com Java Records para representar requisições e respostas.
- Mapeamento entre entidades e DTOs.

### API REST

- Definição de rotas, parâmetros de consulta e variáveis de caminho.
- Recebimento de JSON com `@RequestBody` e validação com `@Valid`.
- Operações de criação, consulta, atualização e exclusão de relógios.
- Atualização de entidades existentes e persistência pelo repository.

### Banco de dados e JPA

- Configuração da conexão com PostgreSQL em `application.properties`.
- Mapeamento de entidades, colunas, índices e enums com JPA.
- Identificação de registros com UUID e datas com `Instant`.
- Normalização dos dados com `@PrePersist` e `@PreUpdate`.
- Carga inicial de dados com `CommandLineRunner`.

### Consultas e paginação

- Paginação com `Page`, `Pageable` e `PageRequest`.
- Ordenação com `Sort` e critérios representados por enums.
- Consultas dinâmicas e combinação de filtros com JPA Specifications.
- Busca por marca, modelo e referência.
- Filtros por movimento, material da caixa e tipo de vidro.
- Filtros por intervalos de preço, diâmetro e resistência à água.

### Validação e tratamento de erros

- Restrições de entrada com `@NotBlank`, `@NotNull`, `@Size` e `@Min`.
- Exceção personalizada para registros não encontrados.
- Tratamento centralizado com `@RestControllerAdvice` e `@ExceptionHandler`.
- Respostas de erro com status HTTP, mensagem, caminho e erros de campos.

### Regras e transformação de dados

- Conversão entre valores da API e enums do domínio.
- Cálculo de uma pontuação de colecionador a partir das características do relógio.
- Classificação da resistência à água para apresentação na resposta.

### Configuração e versionamento

- Gerenciamento de dependências com Maven.
- Uso de variável de ambiente para a senha do banco.
- Criação de commits e envio do código ao GitHub.

## Organização do código

| Pacote | Responsabilidade |
| --- | --- |
| `config` | Carga inicial de dados |
| `controller` | Entrada das requisições HTTP |
| `dto` | Dados de entrada e saída da API |
| `entity` | Entidades e enums do domínio |
| `exception` | Exceções e respostas de erro |
| `mapper` | Conversão entre entidades e DTOs |
| `repository` | Acesso ao banco de dados |
| `service` | Operações e especificações de consulta |

## Execução local

Tenha Java 17 e PostgreSQL instalados. Crie o banco `relogiosX` e confira a URL e o usuário em `src/main/resources/application.properties`.

No PowerShell, defina a senha do banco e execute:

```powershell
$env:DB_PASSWORD = "sua-senha-local"
.\mvnw.cmd spring-boot:run
```

A rota base da API é `/api/relogios`.

## Status do estudo

Projeto de estudo em evolução. Os tópicos acima registram os conceitos praticados no código. A execução e os testes devem ser validados conforme o desenvolvimento avança.
