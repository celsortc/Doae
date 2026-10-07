# Arquitetura e decisões técnicas

## Decisões e propostas

- Definido: a equipe da ONG utiliza e alimenta o sistema.
- Definido: o MVP começa sem login; autenticação será uma evolução futura.
- Definido: programação em Java, banco MySQL e desenvolvimento no VS Code.
- Proposta de escopo: controlar entradas e saídas de itens físicos.
- Proposta de interface final: aplicação desktop com JavaFX. Scene Builder pode ajudar a montar as telas.
- Proposta de construção: aprender e implementar o fluxo no terminal antes de criar as telas.
- Proposta de limite: trabalhar com o estoque de uma única ONG.

Confirmar as propostas com a equipe e os coordenadores antes de implementar as partes correspondentes.

## O que precisaremos codificar

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
