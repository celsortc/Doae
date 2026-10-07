public class Item {

  private String nome;
  private String descricao;
  private String unidadeMedida;

  public Item(String nome, String descricao, String unidadeMedida) {
    this.nome = nome;
    this.descricao = descricao;
    this.unidadeMedida = unidadeMedida;
  }

  public String getNome() {
    return nome;
  }
}
