# Doae — plano do MVP

Documento inicial para orientar o desenvolvimento e o aprendizado da equipe.
MVP significa primeira versão funcional com as funcionalidades essenciais.

## 1. Objetivo

Ajudar uma ONG a registrar os itens recebidos, registrar suas saídas e consultar o estoque disponível.
Exemplo: entram 10 pacotes de arroz, saem 3 e o sistema mostra saldo de 7 pacotes.

## 2. Decisões e propostas

- Definido: a equipe da ONG utiliza e alimenta o sistema.
- Definido: o MVP começa sem login; autenticação será uma evolução futura.
- Definido: programação em Java, banco MySQL e desenvolvimento no VS Code.
- Proposta de escopo: controlar entradas e saídas de itens físicos.
- Proposta de interface final: aplicação desktop com JavaFX. Scene Builder pode ajudar a montar as telas.
- Proposta de construção: aprender e implementar o fluxo no terminal antes de criar as telas.
- Proposta de limite: trabalhar com o estoque de uma única ONG.

Confirmar as propostas com a equipe e os coordenadores antes de implementar as partes correspondentes.

## 3. Funcionalidades do MVP

- Cadastrar, consultar e editar itens.
- Cadastrar, consultar e editar doadores.
- Registrar entrada de um item, com doador identificado ou anônimo.
- Registrar saída de um item.
- Consultar saldo por item.
- Consultar histórico de entradas e saídas, com filtros por item, tipo e período.

Ficam para versões futuras: login, várias ONGs, chat, cadastro pelo doador, pagamentos,
reservas de doações, relatórios exportáveis e cancelamento de movimentações.
No MVP, revisar os dados antes de confirmar: movimentações confirmadas não terão edição ou exclusão.
Essa limitação deve ser reavaliada antes de usar o sistema em uma operação real.

## 4. Regras do sistema

1. Todo item precisa de nome e unidade de medida; descrição é opcional.
2. Cada item utiliza uma unidade consistente, como pacote, unidade, kg ou litro.
3. Toda movimentação precisa de item, tipo, quantidade e data/hora; observação é opcional.
4. Os tipos de movimentação são ENTRADA e SAIDA. A quantidade é sempre positiva.
5. O saldo é a soma das entradas menos a soma das saídas. Não armazenar saldo separadamente no MVP.
6. Uma saída não pode ser maior que o saldo disponível do item.
7. Na entrada, o doador é opcional. Sem doador associado, a doação é considerada anônima.
8. Um cadastro de doador precisa de nome; contato é opcional. Não criar um doador vazio para representar anonimato.
9. Na saída, doador_id fica vazio. O destino da entrega pode ser descrito na observação, sem cadastro de beneficiários.
10. Uma movimentação representa um único item. Uma entrega com vários itens gera vários registros.
11. Itens e doadores vinculados a movimentações devem permanecer cadastrados para preservar o histórico.

## 5. Banco de dados proposto

O diagrama existe; o banco ainda precisa ser criado. Os tipos abaixo são uma proposta para o script SQL.

| Tabela | Campo | Tipo proposto | Regra |
| --- | --- | --- | --- |
| itens | id | INT | Chave primária, gerada automaticamente |
| itens | nome | VARCHAR(100) | Obrigatório |
| itens | descricao | VARCHAR(255) | Opcional |
| itens | unidade_medida | VARCHAR(20) | Obrigatório |
| doadores | id | INT | Chave primária, gerada automaticamente |
| doadores | nome | VARCHAR(100) | Obrigatório |
| doadores | contato | VARCHAR(100) | Opcional |
| movimentacoes | id | INT | Chave primária, gerada automaticamente |
| movimentacoes | item_id | INT | Chave estrangeira para itens.id, obrigatória |
| movimentacoes | doador_id | INT | Chave estrangeira para doadores.id, opcional |
| movimentacoes | tipo | VARCHAR(10) | ENTRADA ou SAIDA |
| movimentacoes | quantidade | DECIMAL(10,3) | Maior que zero; permite frações, como 1,5 kg |
| movimentacoes | data | DATETIME | Obrigatória; inicialmente preenchida com o momento do registro |
| movimentacoes | observacao | VARCHAR(255) | Opcional |

Relacionamentos: um item pode ter muitas movimentações; um doador pode estar associado a muitas entradas.
Usar BigDecimal no Java para as quantidades decimais.

## 6. Telas previstas para a versão desktop

| Tela | Conteúdo | Ações |
| --- | --- | --- |
| Estoque / início | Lista com nome do item, unidade e saldo; busca por nome; navegação | Abrir cadastros, registrar entrada ou saída e acessar histórico |
| Itens | Lista dos itens; formulário com nome, descrição e unidade | Cadastrar, editar e salvar |
| Doadores | Lista dos doadores; formulário com nome e contato | Cadastrar, editar e salvar |
| Entrada | Seleção do item, unidade visível, quantidade, doador opcional, observação e data/hora automática | Revisar, confirmar ou voltar sem salvar |
| Saída | Seleção do item, unidade e saldo visíveis, quantidade, observação e data/hora automática | Revisar, confirmar ou voltar sem salvar |
| Histórico | Data/hora, tipo, item, quantidade, unidade, doador e observação; filtros por item, tipo e período | Aplicar e limpar filtros |

As telas devem mostrar mensagens claras para campos inválidos, estoque insuficiente e falhas de acesso ao banco.
Depois de uma entrada ou saída confirmada, atualizar o saldo exibido.

## 7. O que precisaremos codificar

- Modelos: classes Item, Doador e Movimentacao e enum TipoMovimentacao.
- Acesso ao banco: conexão JDBC e operações SQL de cadastro, edição e consulta.
- Regras: validação dos campos, registro de entrada, registro de saída e cálculo de saldo.
- Interface inicial: menu de terminal e leitura das escolhas.
- Interface desktop: telas JavaFX e seus controladores, reutilizando as regras já implementadas.
- Configuração: projeto Maven para organizar dependências, incluindo o driver do MySQL e, depois, JavaFX.
- Documentação: script SQL e instruções para preparar o banco e executar o programa.

Separar interface, regras e acesso ao banco em classes próprias conforme cada parte surgir.
Usar consultas parametrizadas (PreparedStatement), fechar recursos de conexão e manter senhas fora do Git.
Na saída, conferir o saldo e inserir o registro em uma transação com proteção contra saídas simultâneas.

## 8. Tarefas pequenas, na ordem

Faça uma tarefa por vez. Cada etapa tem um resultado observável.

- [ ] 1. Confirmar com a equipe o escopo e as propostas deste documento.
- [ ] 2. Conferir o JDK e as extensões Java no VS Code; executar um programa simples.
- [ ] 3. Criar Main e exibir as opções do menu no terminal.
- [ ] 4. Ler uma escolha com Scanner e mostrar a opção selecionada.
- [ ] 5. Repetir o menu até escolher Sair e tratar opções inválidas.
- [ ] 6. Criar a classe Item; cadastrar e listar itens em memória para praticar objetos e listas.
- [ ] 7. Organizar o projeto com Maven e criar o script SQL das três tabelas.
- [ ] 8. Criar o banco MySQL e praticar inserção e consulta diretamente com SQL.
- [ ] 9. Conectar o Java ao MySQL e persistir o cadastro de itens.
- [ ] 10. Editar e consultar itens; fechar e abrir o programa para conferir a persistência.
- [ ] 11. Implementar cadastro, edição e consulta de doadores.
- [ ] 12. Implementar entrada de item, incluindo doação anônima.
- [ ] 13. Consultar o saldo por item com base nas movimentações.
- [ ] 14. Implementar saída e impedir quantidade acima do saldo.
- [ ] 15. Implementar histórico e filtros.
- [ ] 16. Criar uma janela JavaFX simples e a navegação entre telas.
- [ ] 17. Construir as telas de itens e doadores reutilizando os cadastros existentes.
- [ ] 18. Construir as telas de estoque, entrada, saída e histórico.
- [ ] 19. Conferir o fluxo completo e as mensagens de erro com dados fictícios.
- [ ] 20. Documentar a instalação e a execução; preparar uma demonstração do MVP.

Salvar avanços pequenos no Git com mensagens que expliquem a mudança.
Não é necessário criar todas as classes e telas de uma vez.

## 9. Quando o MVP estará pronto

- É possível cadastrar um item e um doador.
- É possível receber 10 pacotes de arroz anonimamente e consultar saldo 10.
- É possível registrar saída de 3 pacotes e consultar saldo 7.
- Uma tentativa de retirar 8 pacotes com saldo 7 é recusada sem criar movimentação.
- Quantidades zero, negativas ou inválidas são recusadas.
- O histórico mostra os registros e os filtros funcionam.
- Os dados continuam disponíveis depois de fechar e abrir o programa.
- A interface desktop permite realizar o fluxo sem usar o terminal.
- Outra pessoa consegue preparar e executar o projeto seguindo as instruções.
