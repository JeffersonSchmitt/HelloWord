package jeffersonschmitt.github.com.helloword.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name="User")

public class User extends Model {

  @Column(name="usuario") String usuario;
  @Column(name="senha") String senha;

  private String usuario;
  private String senha;
  private double saldo;
  private String cpf;


  public User() {
    super();
  }

  public User(String usuario, String senha) {
    this.usuario = usuario;
    this.senha = senha;
  }

  public String getUsuario() {
    return usuario;
  }

  public String getSenha() {
    return senha;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getCpf() {
    return cpf;
  }

  public void changeSenha(String senha) {
    this.senha = senha;
  }
}
