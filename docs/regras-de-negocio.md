# Escopo e regras de negócio

## Funcionalidades do MVP

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

## Regras do sistema

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
