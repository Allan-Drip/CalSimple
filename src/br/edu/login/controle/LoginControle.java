
package br.edu.login.controle;
import br.edu.login.view.Cadastrar;
import br.edu.login.poo.dao.conexao;
import br.edu.login.poo.dao.LoginDao;
import br.edu.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginControle {
  public void cadastrarUsuario(Cadastrar view) throws SQLException {
    Connection conexao = (Connection) new conexao().getConnection();
    LoginDao cadastro = new LoginDao();
    cadastro.cadastrarUsuario(view.getUsuario().getText(), view.getEmail().getText(), view.getSenha().getText());
    
}
  
public void login(LoginView view) throws SQLException {
    Connection conexao = new conexao().getConnection();
    LoginDao login = new LoginDao();
    login.login(view.getUsuario().getText(), view.getSenha().getText());
    
} 
    
}
