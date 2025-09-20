-- Cria o banco de dados se ele ainda não existir
CREATE DATABASE IF NOT EXISTS digital2025;

-- Usa o banco de dados criado
USE digital2025;

-- Cria a tabela de usuários
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,                     -- ID autoincrementado e chave primária
    nome VARCHAR(100) NOT NULL,                           -- Nome obrigatório
    email VARCHAR(100) UNIQUE NOT NULL,                   -- E-mail único e obrigatório
    senha VARCHAR(255) NOT NULL,                          -- Senha (em produção, use hash)
    cargo ENUM('ADMIN', 'GERENTE', 'COLABORADOR') NOT NULL, -- Cargo restrito a esses 3 valores
    ativo BOOLEAN DEFAULT TRUE,                           -- Usuário ativo por padrão
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP         -- Data/hora de criação automática
);

-- Cria a tabela de projetos
CREATE TABLE projeto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    descricao TEXT,
    data_inicio DATE NOT NULL,
    data_fim DATE,
    status ENUM('EM_ANDAMENTO', 'CONCLUIDO', 'CANCELADO') DEFAULT 'EM_ANDAMENTO',
    id_gerente INT NOT NULL,
    FOREIGN KEY (id_gerente) REFERENCES usuario(id) ON DELETE CASCADE -- Relacionamento com usuário
);

-- Cria a tabela de equipes
CREATE TABLE equipe (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    id_projeto INT NOT NULL,
    FOREIGN KEY (id_projeto) REFERENCES projeto(id) ON DELETE CASCADE
);

-- Tabela de relacionamento N:N entre equipes e usuários (membros)
CREATE TABLE equipe_membro (
    id_equipe INT NOT NULL,
    id_usuario INT NOT NULL,
    PRIMARY KEY (id_equipe, id_usuario), -- Chave primária composta
    FOREIGN KEY (id_equipe) REFERENCES equipe(id) ON DELETE CASCADE,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id) ON DELETE CASCADE
);

-- Cria a tabela de tarefas
CREATE TABLE tarefa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    descricao TEXT,
    data_criacao DATE NOT NULL DEFAULT (CURRENT_DATE), -- Data padrão = hoje
    data_conclusao DATE,
    status ENUM('PENDENTE', 'EM_PROGRESSO', 'CONCLUIDA') DEFAULT 'PENDENTE',
    id_projeto INT NOT NULL,
    id_responsavel INT NOT NULL,
    FOREIGN KEY (id_projeto) REFERENCES projeto(id) ON DELETE CASCADE,
    FOREIGN KEY (id_responsavel) REFERENCES usuario(id) ON DELETE CASCADE
);