# Projeto de Cadastro e Login de Usuário
Link para o Replit: https://replit.com/@LucasSilva383/exemplificandomodelomvcbylucasmatias?
Link do slide da atividade no canva: https://www.canva.com/design/DAGMPUb5Sqo/qJwGgljZWiPwVCA_7fPEWw/view?utm_content=DAGMPUb5Sqo&utm_campaign=designshare&utm_medium=link&utm_source

Este é um projeto simples de cadastro e login de usuário implementado em Java, seguindo o padrão de arquitetura MVC (Model-View-Controller).

## Funcionalidades

- **Registrar Usuário**: Permite que novos usuários se cadastrem fornecendo um nome de usuário e uma senha.
- **Login de Usuário**: Permite que os usuários registrados façam login utilizando seu nome de usuário e senha.

## Estrutura do Projeto

O projeto está organizado em pacotes conforme o padrão MVC:

- **Model**: Representa os dados do aplicativo.
  - `User.java`: Classe que define o modelo de usuário.
  
- **Repository**: Gerencia o armazenamento e recuperação dos dados.
  - `UserRepository.java`: Classe que armazena os usuários em uma coleção.
  
- **Service**: Contém a lógica de negócio.
  - `UserService.java`: Classe que implementa a lógica de registro e login.
  
- **Controller**: Interage com o usuário e coordena as ações entre o modelo e a visualização.
  - `UserController.java`: Classe que gerencia a interação com o usuário via console.
  
- **Main**: Ponto de entrada da aplicação.
  - `Main.java`: Inicializa e executa a aplicação.

## Como o MVC se Aplica

O padrão MVC separa a aplicação em três componentes principais: Model (Modelo), View (Visão) e Controller (Controlador). Esta separação facilita a manutenção e escalabilidade do código.

1. **Model (Modelo)**:
   - Representa os dados da aplicação.
   - No projeto, a classe `User` representa um usuário com nome de usuário e senha.

2. **View (Visão)**:
   - Responsável pela apresentação dos dados.
   - Neste projeto, a visão é simulada através de mensagens no console.

3. **Controller (Controlador)**:
   - Interage com o usuário e processa as entradas, atualizando o modelo e a visão conforme necessário.
   - No projeto, a classe `UserController` gerencia a interação com o usuário.

### Dinâmica do MVC no Projeto

1. **Interação com o Usuário**:
   - A interação começa na classe `Main`, que cria instâncias do `UserRepository`, `UserService`, e `UserController` e chama o método `iniciar()` no `UserController`.

2. **Controlador (Controller)**:
   - O `UserController` exibe um menu para o usuário, oferecendo opções para registrar, fazer login ou sair.
   - Dependendo da escolha do usuário, o controlador chama os métodos apropriados (`registrar()` ou `fazerLogin()`).

3. **Serviço (Service)**:
   - O `UserController` delega as operações de registro e login ao `UserService`.
   - O `UserService` contém a lógica de negócio e valida os dados. Se o nome de usuário já existir, retorna uma mensagem de erro. Caso contrário, cria um novo `User` e o salva no `UserRepository`.

4. **Repositório (Repository)**:
   - O `UserRepository` armazena os dados dos usuários em um mapa (HashMap).
   - Permite salvar um novo usuário e buscar um usuário pelo nome.
