# dontpanic_daily

  *sem melhorias no babyclient

#### Hello SQL

- [x] [Postgresql](https://www.postgresql.org/) utilizando o Hibernate como framework de persistencia
- [ ] Conectar com o Banco de Dados
- [ ] Criar uma tabela
- [ ] Query insert simples
- [ ] Query insert utilizando o hibernate

### BabyServer

- [ ] Acesso ao banco de dados
- [ ] Equação secreta a cada 24 horas
- [ ] Equações secretas devem ser armazenadas no banco de dados
- [ ] Segurança do banco de dados (sql Injection ou as principais vulnerabilidades do DB escolhido)
- [ ] Atualização na documentação

 #### Extra
   - [ ] Se a equação secreta é == 42 e não existe no banco de dados esta é inserida no banco de dados

### Banco de Dados

- [ ] Configuração do banco de dados
- [ ] Definir Credenciais para acesso
- [ ] Nome para tabela
- [ ] Nome para coluna
- [ ] Tipagem adequada para a equação
- [ ] ------


### Docker ([ubuntu:20.04 focal](https://hub.docker.com/_/ubuntu))

- [ ] Somente a porta do cliente é exposta
- [ ] Um Docker para cada serviço
- [ ] Utilização da Docker network (é proibido usar a rede do host)
- [ ] Each container must bear the same name as the service concerned
- [ ] Your containers should stop when an application also stops for some unexpected or expected 
- [ ] The data in the database container must persist even if you delete the container completely and recreate it
- [ ] ------

### Testes
- [ ] Atualização de todos os testes
- [ ] ------

sudo docker pull postgres
sudo docker run --name postgres -e POSTGRES_PASSWORD=1234 -d postgres
docker exec -it postgres psql -U postgres

apt install psql -y
psql -h localhost -p 5432 -U postgres

