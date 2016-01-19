package jeffersonschmitt.github.com.helloword.domain;

import com.activeandroid.Model;

public class User extends Model {
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
