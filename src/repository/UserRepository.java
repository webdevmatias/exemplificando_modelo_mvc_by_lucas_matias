package repository;

import model.User;
import java.util.HashMap;
import java.util.Map;

// Classe que gerencia o armazenamento dos usuários
public class UserRepository {
    private Map<String, User> usuarios = new HashMap<>();

    // Salva um usuário no repositório
    public void salvar(User usuario) {
        usuarios.put(usuario.getNomeUsuario(), usuario);
    }

    // Busca um usuário pelo nome de usuário
    public User buscarPorNomeUsuario(String nomeUsuario) {
        return usuarios.get(nomeUsuario);
    }
}
