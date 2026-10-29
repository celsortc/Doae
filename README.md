# Doae

Sistema desktop (Java + Swing) para controlar o estoque de doações: itens, doadores, entradas e saídas.

## Como rodar na sua máquina

Clonar o repositório não basta: o Doae precisa do Java para rodar e de um banco MySQL para guardar os dados. Siga os passos na ordem.

### 1. Instale os programas

| Programa | Para que serve | Onde baixar |
|---|---|---|
| **JDK 21** | Compilar e rodar o Java | https://adoptium.net (escolha a versão 21 LTS) |
| **Apache NetBeans** | Abrir e rodar o projeto (já vem com o Maven) | https://netbeans.apache.org/front/main/download/ |
| **MySQL Server 8** | O banco de dados | https://dev.mysql.com/downloads/installer/ |
| **MySQL Workbench** | Programa visual para mexer no banco | Vem junto no instalador do MySQL |
| **Git** | Baixar o código do GitHub | https://git-scm.com/downloads |

Durante a instalação do **MySQL**, o instalador pede uma **senha para o usuário `root`**. Anote essa senha, você vai precisar dela no passo 4.

### 2. Baixe o projeto

Abra o terminal (ou o Git Bash) na pasta onde quer guardar o projeto e rode:

```bash
git clone https://github.com/celsortc/Doae.git
```

Isso cria uma pasta `Doae` com o código.

### 3. Crie o banco de dados

1. Abra o **MySQL Workbench** e entre na conexão `Local instance` com a senha do `root`.
2. Vá em **File → Open SQL Script...** e abra o arquivo `docs/banco/schema.sql` que está dentro da pasta do projeto.
3. Clique no **raio ⚡** (Execute) para rodar o script.
4. Na barra lateral, clique em **atualizar** em *Schemas*. Deve aparecer o banco `doae` com as tabelas `itens`, `doadores` e `movimentacoes`.

### 4. Crie o arquivo de configuração do banco

O Doae lê o endereço, o usuário e a senha do banco de um arquivo chamado `db.properties`. Ele **não vem no repositório** (cada pessoa tem a sua senha). No lugar dele vem um modelo, o `db.properties.example`.

1. Na **pasta raiz do projeto** (a mesma onde está o `pom.xml`), faça uma cópia do arquivo `db.properties.example`.
2. Renomeie a cópia para `db.properties`.
3. Abra o `db.properties` e coloque a senha que você criou no passo 1 depois do `db.senha=`:

```properties
db.url=jdbc:mysql://localhost:3306/doae
db.usuario=root
db.senha=SUA_SENHA_DO_MYSQL
```

Não coloque a sua senha no `db.properties.example`: ele vai para o GitHub. O `db.properties` fica só na sua máquina.

> Cuidado: o nome tem que ser exatamente `db.properties`. No Windows, confira se ele não ficou como `db.properties.txt` (ative *Exibir → Extensões de nomes de arquivos* no Explorador de Arquivos).

### 5. Abra e rode no NetBeans

1. Abra o **NetBeans** e vá em **File → Open Project...**
2. Selecione a pasta `Doae` (ela aparece com o ícone de projeto Maven) e clique em **Open Project**.
3. Na primeira vez, o NetBeans baixa as dependências (o driver do MySQL). Espere a barra de progresso no canto inferior terminar; é preciso estar com internet.
4. Clique com o botão direito no projeto → **Run** (ou aperte **F6**).

A janela do Doae deve abrir. Pronto!

## Problemas comuns

| Mensagem / sintoma | O que fazer |
|---|---|
| `Não foi possível ler o arquivo db.properties` | O arquivo não existe, está com outro nome ou fora da pasta raiz do projeto. Copie o `db.properties.example` como explicado no passo 4. |
| `Access denied for user 'root'@'localhost'` | A senha no `db.properties` está errada. |
| `Communications link failure` | O MySQL não está rodando. Abra *Serviços* do Windows e inicie o serviço `MySQL80`. |
| `Unknown database 'doae'` | O script do banco não foi executado. Refaça o passo 3. |
| Erro dizendo que a versão do Java não é suportada (`release 21`) | O NetBeans está usando um Java antigo. Vá em **Tools → Java Platforms** e adicione o JDK 21; depois, em *Properties* do projeto → *Build → Compile*, escolha o JDK 21. |
