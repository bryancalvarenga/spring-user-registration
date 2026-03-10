# Projeto com Spring Boot (CRUD básico)

Este é um projeto simples desenvolvido com **Spring Boot 3**, utilizando as seguintes dependências:

- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

---

## Estrutura do Projeto

```
src/
pom.xml
.gitignore
README.md
```

---

## ️ Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/bryancalvarenga/spring-user-registration.git
   cd spring-user-registration
   ```

2. Execute o projeto com Maven:
   ```bash
   mvn spring-boot:run
   ```
   ou, caso esteja usando o wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

3. O projeto estará disponível em:
   ```
   http://localhost:8080
   ```

---

## Banco de Dados (H2)

Este projeto utiliza o **H2 Database** em memória.

- Console H2:  
  [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- Configurações padrão:
    - **JDBC URL:** `jdbc:h2:mem:usuario`
    - **User:** `devuser`
    - **Password:** *(vazio)*

---

## Observações

- O banco de dados H2 é **em memória** → sempre que reiniciar a aplicação, os dados são resetados.
- Use o **H2 Console** para inspecionar tabelas e realizar queries.

---

## Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Maven
- H2 Database
- Lombok
