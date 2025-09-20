# 🚀 Programação de Soluções Computacionais - Digital 2025 -2

Sistema de gerenciamento de projetos e tarefas com perfis de usuário: Administrador, Gerente e Colaborador.

## 🧩 Funcionalidades

- ✅ Cadastro e autenticação de usuários
- ✅ CRUD de Projetos (Gerentes)
- ✅ CRUD de Tarefas (Gerentes e Colaboradores)
- ✅ Gerenciamento de Equipes
- ✅ Controle de permissões por cargo
- ✅ Interface gráfica moderna com JavaFX
- ✅ Banco de dados MySQL local

## 🛠️ Tecnologias

- Java 17+
- JavaFX 17+
- MySQL 8+
- Scene Builder (para design FXML)
- Maven (gerenciador de dependências)
- Git & GitHub

## 📥 Como Executar

1. Clone o repositório.
2. Crie o banco de dados `digital2025` e execute `src/main/resources/db/schema.sql`.
3. Renomeie `application.properties.example` para `application.properties` e configure suas credenciais.
4. Compile e execute com:
   ```bash
   mvn javafx:run