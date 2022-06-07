# Dont Panic Baby (JAVA)

### BabyServer

#### MELHORIAS

- [x] Código Javascript
- [x] Documentação
- [x] Testes

#### VALIDAR INPUT

- [x] 6 caracteres
- [x] Somente operadores e digitos (0-9) e (*, /, +, -)
- [x] Verificar se é uma operação matematica valida
- [x] Verificar se o resultado é igual a 42
- [X] Definir operação secreta
- [X] Verificar se operação é igual a equação secreta
- [X] Retornar dicas (CCCC#) caso a operação seja == 42 e esta não seja a operação secreta
- [X] Retornar CCCCCC caso  a operação seja == 42
- [X] Fazer tratamento de endpoint, para receber caracteres especiais.
- [X] Tratar caracteres especiais "|"
- [x] Documentação




#### RETORNO JSON

```javascript
{
  "isFortyTwo": true,
  "input": "10*4+2",
  "isValidInput": true,
  "tips": "CCCCCC",
}
```

### BabyClient

- [x] Receber input do usuario
- [x] Encaminhar input para BabyServer
- [x] Receber JSON do BabyServer
- [x] Tratar as informações do JSON
- [x] Adicionar informações do JSON ao frontend
- [x] Link na tela apontando para o README.md do repósitorio


### Testes Unitarios

- [x] Testes unitários utilizando Junit ou Java Puro


### README.md

- [ ] Um readme bem feito

### NGINX

- [x] Makefile ou shell script
- [x] Configuração das rotas do BabyClient
- [x] Testes na VM

### Extra

- [ ] Contador de Tentativas
- [ ] Servidor da 42
- [ ] Testes em Javascript
- [ ] Testes em Python
- [ ] ...


