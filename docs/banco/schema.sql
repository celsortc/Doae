CREATE DATABASE IF NOT EXISTS doae
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE doae;

CREATE TABLE IF NOT EXISTS itens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    unidade_medida VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS doadores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    contato VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS movimentacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_id INT NOT NULL,
    doador_id INT,
    tipo VARCHAR(10) NOT NULL,
    quantidade DECIMAL(10,2) NOT NULL,
    anonima BOOLEAN NOT NULL DEFAULT FALSE,
    data_hora DATETIME NOT NULL,
    observacao VARCHAR(255),
    CONSTRAINT fk_mov_item FOREIGN KEY (item_id) REFERENCES itens(id),
    CONSTRAINT fk_mov_doador FOREIGN KEY (doador_id) REFERENCES doadores(id),
    CONSTRAINT ck_mov_tipo CHECK (tipo IN ('ENTRADA', 'SAIDA')),
    CONSTRAINT ck_mov_quantidade CHECK (quantidade > 0)
);