# Sistema de Login de Cadastro de usuário
- Java
- Mysql

## Funcionalidades  
- Cadastro de usuário:  usuários podem se cadastrar fornecendo um nome de usuário, endereço de e-mail e senha válidos. 
- Login: Os usuários registrados podem fazer login usando seu nome de usuário e senha.
- Autenticação: O sistema verifica as credenciais do usuário no banco de dados para autenticação.
- Banco de Dados: Utiliza MySQL para armazenar informações dos usuários.  

   Nele você pode logar e se cadastrar. Na tela de início ele 
  deseja boas vindas.
    Quando tenta logar, ele faz uma busca no banco de dados, se não constar no banco, ele retorna um 
  input informando que senha e usuário estão incorretos, se encontrar, ele mostra um input de boas 
  vindas.
    Realizando um novo cadastro, ele cadastra os dados informados no banco e retorna um input 
  informando que os dados foram cadastrados com sucesso. No cadastro de usuário não é permitido 
  campos vazios,se tiver um campo vazio e tentar se cadastrar, ele retorna um input pedindo para 
  que preencha todos os campos corretamente.
  ![teste2](https://github.com/G4M4-X/Cadastro-usuario/assets/73545523/866375e4-87ca-462b-8d63-44fb5420ab57)
