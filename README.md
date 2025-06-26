# API em Java com Spring Boot

Este projeto demonstra um exemplo simples de API de produtos usando Spring Boot.
Inclui um controller `ProdutoController` com operações básicas de CRUD.

Para executar o projeto, é necessário ter Java instalado. O Maven Wrapper está
incluído para facilitar a construção e execução.

```bash
./mvnw spring-boot:run
```

Os endpoints disponíveis são:
- `GET /produto`
- `POST /produto`
- `DELETE /produto/{id}`
- `PUT /produto/{id}`

O projeto também possui o actuator habilitado em `/actuator/health`.
