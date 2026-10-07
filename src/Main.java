import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

      System.out.println("=== Doae ===");
      System.out.println("Controle de estoque da ONG");
      System.out.println();

    int opcao = 1;
    while (opcao != 0) {


      System.out.println("1 - Cadastrar Item");
      System.out.println("2 - Registrar Entrada");
      System.out.println("3 - Registrar Saída");
      System.out.println("4 - Consultar Estoque");
      System.out.println("0 - Sair");

      opcao = scan.nextInt();
      scan.nextLine();
      
      switch (opcao) {
      case 1:
        System.out.println("=== Cadastrar ===");
        System.out.println("Nome");
        String nome = scan.nextLine();
        System.out.println("Descricao");
        String descricao = scan.nextLine();
        System.out.println("Unidade de Medida");
        String unMedida = scan.nextLine();

        Item item = new Item(nome, descricao, unMedida);

        System.out.println(item.getNome());
        break;
      case 2:
        System.out.println("Registrar Entrada");
        break;
      case 3:
        System.out.println("Registrar Saída");
        break;
      case 4:
        System.out.println("Estoque");
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