import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("=== Doae ===");
    System.out.println("Controle de estoque da ONG");
    System.out.println();

    System.out.println("1 - Cadastrar Item");
    System.out.println("2 - Registrar Entrada");
    System.out.println("3 - Registrar Saída");
    System.out.println("4 - Consultar Estoque");
    System.out.println("0 - Sair");

    int opcao = 1;
    while (opcao != 0) {
     opcao= scan.nextInt();
      switch (opcao) {
      case 1:
        System.out.println("Cadastrar");
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