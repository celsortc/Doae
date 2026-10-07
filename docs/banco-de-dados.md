# Banco de dados

## Banco de dados proposto

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
