import java.util.List;
public class Banco {
  private String nome;
  private List<Conta> Conta; 

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public List<Conta> getConta(){
    return Conta;
  }
  public void setConta(List<Conta> conta){
    this.Conta = conta;
  }
}
