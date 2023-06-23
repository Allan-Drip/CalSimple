
package br.edu.login.poo;


public class Login {
    private String nome, senha , email;

    public Login(String senha, String email) {
        this.senha = senha;
        this.email = email;
    }

   

public void cadastrar (String senha, String email, String nome){
this.nome = nome;
this.senha = senha;
this.email = email;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    


 }


