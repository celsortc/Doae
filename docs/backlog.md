# Backlog do projeto

- [x] Separar `JanelaPrincipal` e `PainelEstoque`, preservando menu, aparência e dados compartilhados.
- [x] Integrar `PainelItens` à navegação da janela principal.
- [x] Cadastrar itens pelo formulário e exibi-los na tabela de `PainelItens`, usando o cadastro compartilhado em memória.
- [ ] Conferir visualmente a navegação e o redimensionamento de `PainelItens` no NetBeans.
- [x] Atualizar a lista de itens ao abrir a tela de entrada, permitindo cadastrar um item e usá-lo na mesma execução do programa.
- [x] Melhorar a mensagem de quantidade inválida para explicar que aceita apenas inteiros.
- [x] Validar se há um item selecionado antes de prosseguir com a entrada.
- [x] Limpar o campo Unidade quando não houver item selecionado.
- [x] Limpar quantidade, observação e marcação de doação anônima após registrar uma entrada com sucesso, preservando o preenchimento quando houver erro de validação.
- [ ] Completar a limpeza do formulário após o sucesso: definir o estado inicial dos seletores de item e doador e manter a unidade coerente com a seleção.

## Histórico — checklist de retomada

- [x] Criar o visual de Histórico e Doadores, sem implementar o cadastro de doadores.
- [x] Abrir o Histórico pelo menu e compartilhar o mesmo `ControleEstoque` da janela principal.
- [x] Carregar as sete colunas na ordem correta, consultando nome e unidade pelo item da movimentação.
- [x] Atualizar a tabela ao abrir e limpar as linhas antes de preencher, evitando duplicação.
- [x] Compor `textoDoador` como texto, usando um valor padrão para ausência de doador e substituindo-o conforme anonimato ou nome identificado.
- [x] Validar a exibição de entrada identificada, entrada anônima e saída, incluindo histórico vazio, recarga e novas movimentações.
- [x] Atualizar `lblTotalRegistros` após preencher a tabela, usando a quantidade real de linhas (validado com histórico vazio, recarga e novas movimentações).
- [ ] Filtros do Histórico — adiados para o Pós-MVP.

Retomada: a listagem básica do Histórico e o contador estão concluídos. Os filtros foram adiados para o Pós-MVP.

## Menu e Doadores

- [x] Destacar no menu lateral o botão da tela aberta, iniciando com Estoque.
- [x] Abrir a tela de Doadores pelo menu.
- [x] Remover a coluna Editar, sem ação, das tabelas de Itens e Doadores.
- [x] Guardar os doadores em memória no `CadastroDoadores`, substituindo a lista fixa do `Main`.
- [x] Listar os doadores na tabela, com o total de cadastrados.
- [x] Cadastrar doador pelo botão Salvar, validando o nome e limpando os campos após o sucesso.
- [x] Limpar os campos pelo botão Cancelar.
- [x] Recarregar os doadores da tela de entrada sempre que ela for aberta, incluindo os cadastrados na mesma execução.
- [ ] Conferir visualmente o crescimento vertical da tabela de Doadores e a fonte da ajuda do contato.

Retomada: o cadastro funcional de doadores está concluído (fluxos de Salvar, nome vazio, Cancelar e combo da entrada verificados por um harness Swing temporário, fora do repositório). Pendências locais fora dos commits: `RegistrarEntrada.form`/`.java` com alterações locais (form dessincronizado do `initComponents`) e `System.out.println` de depuração em `RegistrarSaida.java`. Continuar na branch `doae/registro-saida-estoque`.

## Pós-MVP

- [ ] Implementar os filtros do Histórico por item, tipo de movimentação e período, com as ações Aplicar e Limpar; atualizar a tabela e o contador conforme os resultados exibidos.
- [ ] Exibir os erros de validação da saída no próprio formulário, com aviso vermelho inspirado no [modelo do Figma](https://www.figma.com/design/r3bBzEHkAIVfzjvepdOEzX/Doae-v2?node-id=2-3580), em vez do popup atual. Usar um `JLabel` no designer do NetBeans, preenchido após a tentativa de envio e limpo ao tentar novamente ou limpar o formulário; manter as validações no `ControleEstoque` e apresentar uma mensagem amigável para quantidade que não seja um inteiro. Melhoria independente da tela de revisão/confirmação e fora do escopo de histórico, hover e doadores.
- [ ] Criar tela de revisão da entrada: exibir os dados informados, permitir voltar para corrigir sem perder o preenchimento e registrar somente após confirmar. Após o sucesso, atualizar a tabela e voltar ao estoque. Manter o registro direto atual até implementar essa etapa.
- [ ] Criar tela de revisão da saída: exibir item, unidade, saldo disponível, quantidade e observação; permitir voltar para corrigir sem perder o preenchimento. Descontar e registrar a movimentação somente após confirmar, validando novamente o saldo. Após o sucesso, limpar o formulário, atualizar a tabela e voltar ao estoque. Manter o registro direto atual até implementar essa etapa.
