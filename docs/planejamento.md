# Planejamento do MVP

Documento inicial para orientar o desenvolvimento e o aprendizado da equipe. MVP significa primeira versão funcional com as funcionalidades essenciais. As tarefas abaixo preservam o planejamento original; os marcadores ainda precisam ser revisados conforme o andamento do projeto.

## Tarefas pequenas, na ordem

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

## Quando o MVP estará pronto

- É possível cadastrar um item e um doador.
- É possível receber 10 pacotes de arroz anonimamente e consultar saldo 10.
- É possível registrar saída de 3 pacotes e consultar saldo 7.
- Uma tentativa de retirar 8 pacotes com saldo 7 é recusada sem criar movimentação.
- Quantidades zero, negativas ou inválidas são recusadas.
- O histórico mostra os registros e os filtros funcionam.
- Os dados continuam disponíveis depois de fechar e abrir o programa.
- A interface desktop permite realizar o fluxo sem usar o terminal.
- Outra pessoa consegue preparar e executar o projeto seguindo as instruções.
