package controller;

import service.UserService;
import java.util.Scanner;

// Classe que controla a interação com o usuário via console
public class UserController {
    private UserService servicoUsuario;

    // Construtor da classe UserController
    public UserController(UserService servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    // Método para registrar um novo usuário
    public void registrar() {
        System.out.println("\n");
        System.out.println("|--------------------|");
        Scanner scanner = new Scanner(System.in);
        System.out.println("| Digite o usuário: ");
        System.out.println("|--------------------|");
        String nomeUsuario = scanner.nextLine();
        System.out.println("| Digite a senha: ");
        String senha = scanner.nextLine();

        String resultado = servicoUsuario.registrar(nomeUsuario, senha);
        System.out.println("|--------------------|");
        System.out.println("| " +resultado);
        System.out.println("|--------------------|\n");
    }

    // Método para realizar o login de um usuário
    public void fazerLogin() {
        System.out.println("\n");
        System.out.println("|--------------------|");
        Scanner scanner = new Scanner(System.in);
        System.out.println("| Digite o usuário: ");
        System.out.println("|--------------------|");
        String nomeUsuario = scanner.nextLine();
        System.out.println("| Digite a senha: ");
        String senha = scanner.nextLine();

        String resultado = servicoUsuario.fazerLogin(nomeUsuario, senha);
        System.out.println("|--------------------|");
        System.out.println("| "+resultado);
        System.out.println("|--------------------|\n");

    }

    // Método que inicia a interação com o usuário
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("|--------------------|");
            System.out.println("| 1. Registrar");
            System.out.println("| 2. Fazer Login");
            System.out.println("|--------------------|");
            System.out.println("| 3. Sair");
            System.out.println("|--------------------|\n");
            System.out.print("| Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // consumir nova linha

            switch (escolha) {
                case 1:
                    registrar();
                    break;
                case 2:
                    fazerLogin();
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("|--------------------|");
                    System.out.println("| Saindo...");
                    System.out.println("|--------------------|\n");
                    return;
                default:
                    System.out.println("\n");
                    System.out.println("|--------------------|");
                    System.out.println("| Opção inválida. Tente novamente.");
                    System.out.println("|--------------------|\n");
            }
        }
    }
}
