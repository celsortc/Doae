import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Item> itens= new ArrayList<>();

      System.out.println("=== Doae ===");
      System.out.println("Controle de estoque da ONG");
      System.out.println();

    int opcao = 99;
    while (opcao != 0) {


      System.out.println("1 - Cadastrar Item");
      System.out.println("2 - Registrar Entrada");
      System.out.println("3 - Registrar Saída");
      System.out.println("4 - Consultar Estoque");
      System.out.println("0 - Sair");


      boolean verificaMenu = scan.hasNextInt();
      if(verificaMenu == false) {
        System.out.println("Use apenas números e escolha uma opção existente");
        scan.nextLine();

        System.out.println("\nPressione Enter para voltar ao menu.");
        scan.nextLine();
        continue;
      }
      opcao = scan.nextInt();
      scan.nextLine();


      
      switch (opcao) {
      case 1:

      Boolean dadosCorretos = false;

while (dadosCorretos == false) {
  System.out.println("=== Cadastrar ===");
        System.out.println("Nome");
        String nome = scan.nextLine();
        System.out.println("Descricao");
        String descricao = scan.nextLine();
        System.out.println("Unidade de Medida");
        String unMedida = scan.nextLine();

        if(nome.isBlank() || unMedida.isBlank()) {
            System.out.println("Nome e unidade de medida são campos obrigatórios");
        } else {
        Item item = new Item(nome, descricao, unMedida);
        itens.add(item);
        dadosCorretos = true;
        }
}
        break;
      case 2:
        System.out.println("Registrar Entrada");
        break;
      case 3:
        System.out.println("Registrar Saída");
        break;
      case 4:

        System.out.println("=== Estoque ===");
        for(Item itemCadastrado : itens) {
          System.out.println(itemCadastrado.getNome());
        }


        System.out.println("\nPressione Enter para voltar ao menu.");
scan.nextLine();
        break;
      case 0: 
      System.out.println("Saindo...");
      break;  
      default:
        System.out.println("Opção incorreta");
        break;
    }
      
    }

    System.out.println("Sistema encerrado");
    



  }
}