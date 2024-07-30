package model;

// Classe que representa um Usuário
public class User {
    private String nomeUsuario; // Nome de usuário
    private String senha; // Senha do usuário

    // Construtor da classe User
    public User(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    // Getters e setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
