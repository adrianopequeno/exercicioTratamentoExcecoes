# Tratamento de erros (exercício em Java)
## Sumário
- [O que aprendi](#O-que-aprendi)
- [Pré-requisitos](#pré-requisitos)
- [Enunciado do exercício](#Enunciado-do-exercício)

## O que aprendi
- Tratamento de erros usando try/catch
- Cláusula throws: propaga a exceção ao invés de trata-la
- Cláusula throw: lança a exceção / "corta" o método
- Exception: compilador obriga a tratar ou propagar
- RuntimeException: compilador não obriga

## Pré-requisitos

- Lógica de programação
  - Variáveis, entrada, processamento, saída
  - Estrutura condicional
  - Estruturas repetitivas
- OOP básica
  - Classes, atributos, métodos, objetos
  - Construtores, encapsulamento
  - Herança
  - Polimorfismo

## Enunciado do exercício

Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.

### Exemplo

```
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00

Enter amount for withdraw: 250.00
Withdraw error: Not enough balance
```

