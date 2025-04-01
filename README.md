# Documentação do Desafio de Sorteio de Números em Java

## Objetivo

Desenvolver um programa em Java que gere uma quantidade definida de números aleatórios dentro de um intervalo específico, garantindo que não haja repetições. Os números sorteados devem ser armazenados em uma lista e exibidos no console ao final da execução. O programa deve permitir reiniciar o sorteio sem encerrar a execução.

## Entradas

O programa deve receber três entradas do usuário:

1. **Quantidade de números a serem sorteados** (inteiro positivo);
2. **Valor mínimo do intervalo** (inteiro);
3. **Valor máximo do intervalo** (inteiro, maior que o valor mínimo).

## Regras e Funcionamento

1. Gerar números aleatórios dentro do intervalo definido pelo usuário;
2. Garantir que os números sorteados sejam únicos, ou seja, sem repetição;
3. Armazenar os números sorteados em uma lista (`ArrayList`);
4. Exibir os números sorteados ao final da execução;
5. Permitir reiniciar o jogo sem precisar encerrar o programa, apagando os dados anteriores e reiniciando o processo.

## Exemplo de Execução

### Entrada do Usuário:

```
Digite a quantidade de números: 3
Digite o valor mínimo: 10
Digite o valor máximo: 20
```

### Saída Esperada:

```
Números sorteados: [12, 17, 19]

Deseja jogar novamente? (S/N)
```

Se o usuário escolher "S", o programa reinicia e solicita os parâmetros novamente. Caso escolha "N", o programa encerra.

## Tecnologias e Conceitos Utilizados

- **Java** como linguagem de programação;
- **Scanner** para entrada de dados do usuário;
- **Random** para geração de números aleatórios;
- **ArrayList** para armazenar os números sorteados;
- **Looping** para controle da repetição do jogo.

## Dica

### 🧐 Quando criar uma nova classe?

Geralmente, criamos classes quando queremos:
 ✔ **Separar responsabilidades** (evitar que uma única classe faça tudo)
 ✔ **Facilitar a reutilização do código** (evitar código duplicado)
 ✔ **Melhorar a organização e legibilidade**

No seu projeto de sorteio, podemos identificar algumas responsabilidades distintas, o que nos ajuda a decidir quantas e quais classes criar.

------

### 📌 Aplicando isso ao projeto de sorteio

Neste caso, podemos organizar o código assim:

​	 1️⃣ **Classe `Sorteador`** → Responsável por gerar os números aleatórios
 	2️⃣ **Classe `JogoSorteio`** → Responsável pelo fluxo do jogo (entrada de dados, chamadas para o `Sorteador`, exibição dos números)
​	 3️⃣ **Classe `Main`** → Apenas para iniciar a execução do jogo

## Considerações Finais

Este desafio é ideal para exercitar conceitos fundamentais de Java, como coleções, manipulação de entradas do usuário e controle de fluxo. O programa deve ser estruturado para facilitar a leitura e manutenção do código.