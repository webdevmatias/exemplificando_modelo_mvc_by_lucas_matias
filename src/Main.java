import repository.UserRepository;
import service.UserService;
import controller.UserController;

// Classe principal que inicializa e executa a aplicação
public class Main {
    public static void main(String[] args) {
        UserRepository repositorioUsuario = new UserRepository();
        UserService servicoUsuario = new UserService(repositorioUsuario);
        UserController controladorUsuario = new UserController(servicoUsuario);
        controladorUsuario.iniciar();
    }
}
