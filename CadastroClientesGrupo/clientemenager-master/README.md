# Aplicação para Cadastro de Grupo de Clientes 

# Cliente 
Cadastro de Grupo de Clientes [Angular 7, SpringBoot, JPA com Arquitetura Maven, MySql/OAuh2, Autenticação JWT Token]
Você pode acessar ele pelo [ProjetoCadastroPessoa](https://encurtador.com.br/aptAL)
(https://185.199.111.153/projeto-cadastro-pessoa/)

# Mapa da Aplicação:
- Criar tela de login, com usuário e senha (fixo).
- Criar cadastro de Grupo de Clientes contendo: nome e ativo.
- Criar um cadastro de clientes contendo: 
      a) nome, obrigatório;
      b) tipo (pessoa física ou jurídica), obrigatório;
      c) CPF (se pessoa física) ou CNPJ (se pessoa jurídica), obrigatório;
      d) RG (se pessoa física) ou IE (se pessoa jurídica);
      e) Data de Cadastro;
      f) Grupo: Permitir selecionar somente uma opção.
      g) Ativo (se está ativo);     
      h) Telefone, contendo ddd e número, permitir adicionar mais do que um e remover os adicionados. (Mestre Detalhe)
      i) Ao gravar validar se já existe um cliente cadastrado com o CPF/CNPJ informado.
- Criar uma tela para consulta dos clientes e grupo de clientes permitindo:
      a) Filtrar por nome e/ou somente ativos.
      b) Incluir, alterar e excluir.

# Usuários
 ## ADMIN
 - user: admin
 - pass: 123456
 - role: ADMIN (consulta, alterção, exclusão dos dados)
 ## COMUM
 - user: comum
 - pass: 123456
 - role: COMUM (consulta)


# Backend:
 ## Tecnologias
 - Spring Boot
 - Sprint Security
 - OAuth2
 - JAVA EE Spring Data JPA
 - Hibernate Envers 
## Considereções
 - testado com banco de dados H2 e Mysql.
 - testado com TDD local
  ## executar Shell Linux: mvnw spring-boot:run

# Frontend:
  ## Tecnologias (AngularCLI)
# Executar no Shell do Linux:  
- npm install
- npm install -g @angular/cli 
- ng s -o



