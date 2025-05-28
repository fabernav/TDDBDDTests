# TDDBDDTests

Este repositório apresenta um projeto de testes de software utilizando as abordagens **TDD (Test-Driven Development)** e **BDD (Behavior-Driven Development)**, com exemplos práticos em Java e documentação de cenários de teste.

## Estrutura do Projeto

- [`TDDTests.java`](TDDTests.java): Implementa testes automatizados de unidade para autenticação de usuários, seguindo a metodologia TDD.
- [`CaixaBrancaTests.java`](CaixaBrancaTests.java): Exemplo de teste de caixa branca para validação de linhas de transporte.
- [`Bdd.txt`](Bdd.txt): Especificação de requisitos e cenários de BDD, descrevendo o comportamento do sistema sob a perspectiva do usuário.
- [`CaixaPreta.txt`](CaixaPreta.txt): Exemplos de testes de caixa preta, incluindo testes funcionais, não funcionais e de regressão.
- [`README.md`](README.md): Este arquivo de documentação.

## Descrição dos Arquivos

### [`TDDTests.java`](TDDTests.java)

Contém testes automatizados utilizando JUnit para o serviço de autenticação de usuários. Os testes cobrem casos como:
- Login válido
- Senha incorreta
- Campos obrigatórios em branco ou nulos
- Formato de e-mail inválido

Inclui também a implementação simplificada da classe `AuthService` para fins de teste.

### [`CaixaBrancaTests.java`](CaixaBrancaTests.java)

Demonstra testes de caixa branca, validando o método `verificarLinha`, que verifica a disponibilidade de linhas de transporte. Testa diferentes entradas, como valores nulos, vazios e linhas conhecidas/desconhecidas.

### [`Bdd.txt`](Bdd.txt)

Arquivo de especificação BDD, contendo histórias de usuário e cenários detalhados para funcionalidades como:
- Entrada na fila virtual de transporte
- Visualização de localização dos veículos em tempo real
- Consulta de itinerários e horários
- Login de usuário
- Notificações de embarque

Os cenários seguem o formato Gherkin (Dado, Quando, Então).

### [`CaixaPreta.txt`](CaixaPreta.txt)

Documenta exemplos de testes de caixa preta, abordando:
- Testes funcionais (login, fila virtual)
- Testes não funcionais (desempenho, compatibilidade, segurança)
- Testes de regressão

Cada exemplo apresenta entradas, ações e resultados esperados.

## Como Executar os Testes

1. Certifique-se de ter o Java e o JUnit instalados.
2. Compile os arquivos `.java`:
   ```sh
   javac TDDTests.java CaixaBrancaTests.java
