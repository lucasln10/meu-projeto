# 📌 Projeto de Treinamento com Spring Boot

## 🏆 Objetivo
Este projeto foi desenvolvido com o intuito de aprimorar minhas habilidades com **Spring Boot**, explorando diversas bibliotecas essenciais para segurança, autenticação e tratamento de erros.

## 🛠️ Tecnologias Utilizadas
- **Spring Boot** (Framework principal)
- **Spring Security** (Autenticação e autorização)
- **Spring Web** (Desenvolvimento de APIs REST)
- **JWT (JSON Web Token)** (Geração e validação de tokens)
- **PostgreSQL** (Banco de dados relacional)
- **BCrypt** (Criptografia de senhas)

## 📌 Funcionalidades Implementadas
1. **Cadastro e listagem de produtos e preços**: Simulação de um CRUD básico.
2. **Autenticação e Autorização**:
   - Implementação de login com Spring Security.
   - Criptografia de senhas utilizando **HS256**.
   - Geração de tokens JWT válidos por **1 dia útil**.
   - Proteção das requisições com autorização via token.
3. **Tratamento de erros**: Melhorando a experiência e segurança da API.

## 🔗 Banco de Dados
O projeto está conectado a um banco de dados **PostgreSQL** para garantir uma estrutura mais realista e eficiente.

## 🚀 Como Rodar o Projeto
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-repositorio.git
   ```
2. Configure o banco de dados PostgreSQL.
3. Atualize as credenciais no `application.properties`.
4. Execute o projeto com:
   ```bash
   mvn spring-boot:run
   ```

## 🔒 Autenticação
Após o login, um **token JWT** será gerado e deverá ser enviado no cabeçalho das requisições para acessar as rotas protegidas:
```json
Authorization: Bearer <seu-token-aqui>
```

---
📌 **Status do Projeto:** Em desenvolvimento 🚧

