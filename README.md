# dontpanic_daily

  *sem melhorias no babyclient

#### Hello SQL

- [x] [Postgresql](https://www.postgresql.org/) utilizando o Hibernate como framework de persistencia
- [x] Conectar com o Banco de Dados
- [x] Criar uma tabela
- [x] Query insert simples
- [ ] Query insert utilizando o hibernate

### BabyServer

- [x] Acesso ao banco de dados
- [x] Equação secreta a cada 24 horas
- [x] Equações secretas devem ser armazenadas no banco de dados
- [ ] Segurança do banco de dados (sql Injection ou as principais vulnerabilidades do DB escolhido)
- [ ] Atualização na documentação

 #### Extra
   - [ ] Se a equação secreta é == 42 e não existe no banco de dados esta é inserida no banco de dados

### Banco de Dados

- [x] Configuração do banco de dados
- [x] Definir Credenciais para acesso
- [x] Nome para tabela
- [x] Nome para coluna
- [x] Tipagem adequada para a equação

### Docker ([ubuntu:20.04 focal](https://hub.docker.com/_/ubuntu))

- [ ] Somente a porta do cliente é exposta
- [x] Um Docker para cada serviço
- [ ] Utilização da Docker network (é proibido usar a rede do host)
- [ ] Each container must bear the same name as the service concerned
- [ ] Your containers should stop when an application also stops for some unexpected or expected 
- [ ] The data in the database container must persist even if you delete the container completely and recreate it

### Testes
- [ ] Atualização de todos os testes
