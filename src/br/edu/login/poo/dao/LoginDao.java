package br.edu.login.poo.dao;

import br.edu.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
    
public void cadastrarUsuario (String nome, String email, String senha) throws SQLException{
   Connection conexao = new conexao().getConnection();
   String sql = "insert into usuario (nome, email, senha) values ('"+nome+"', '"+email+"', '"+senha+"')";
   System.out.println(sql);
   PreparedStatement statment = conexao.prepareStatement(sql);
   statment.execute();
   conexao.close();
   }
  
public void login (String nome, String senha) throws SQLException{
 Connection conexao = new conexao().getConnection();
 String sql = "select nome,senha from usuario where nome = '"+nome+"' and senha = '"+senha+"'";
 System.out.println(sql);
 PreparedStatement statment = conexao.prepareStatement(sql);
 ResultSet rs = statment.executeQuery();
 
 if(rs.next()){
     System.out.println("Possui");   
 }else{
     System.out.println("Não possui");
 }
 conexao.close();
 }

}


