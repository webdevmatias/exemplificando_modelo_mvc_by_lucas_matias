package service;

import model.User;
import repository.UserRepository;

// Classe que contém a lógica de negócios para o registro e login
public class UserService {
    private UserRepository repositorioUsuario;

    // Construtor da classe UserService
    public UserService(UserRepository repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    // Método para registrar um novo usuário
    public String registrar(String nomeUsuario, String senha) {
        if (repositorioUsuario.buscarPorNomeUsuario(nomeUsuario) != null) {
            return "Nome de usuário já existe!";
        }
        User usuario = new User(nomeUsuario, senha);
        repositorioUsuario.salvar(usuario);
        return "Usuário registrado com sucesso!";
    }

    // Método para realizar o login de um usuário
    public String fazerLogin(String nomeUsuario, String senha) {
        User usuario = repositorioUsuario.buscarPorNomeUsuario(nomeUsuario);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return "Login bem-sucedido!";
        }
        return "Nome de usuário ou senha inválidos!";
    }
}
