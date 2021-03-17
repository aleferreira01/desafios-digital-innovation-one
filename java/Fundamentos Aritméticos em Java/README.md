# Fundamentos Aritméticos em Java

**[Exercício 1 - Quantidade de N´umeros Positivos ](#exercicio1)**<br>
**[Exercício 2 - Exibindo Números Pares](#exercicio2)**<br>
**[Exercício 3 - Análise de Números](#exercicio3)**<br>**[Exercício 4 - Contagem de Cédulas](#exercicio4)**<br>**[Exercício 5 - Consumo Médio do Automóvel](#exercicio5)**

---

## <a name="exercicio1"> Exercício 1 - Quantidade de Números Positivos </a>

- **Desafio**

Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

- **Entrada**

Você receberá seis valores, negativos e/ou positivos.

- **Saída**

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

| Exemplo de Entrada                     | Exemplo de Saída    |
| -------------------------------------- | ------------------- |
| 7<br/>-5<br/>6<br/>-3.4<br/>4.6<br/>12 | 4 valores positivos |

---

## <a name="exercicio2">Exercício 2 - Exibindo Números Pares </a>

- **Desafio**

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

- **Entrada**

Você receberá 1 valor inteiro **N**, onde **N > 0**.

- **Saída**

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 6                  | 2<br/>4<br/>6    |

---

## <a name="exercicio3"> Exercício 3 - Análise de Números </a>

- **Desafio**

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

- **Entrada**

Você receberá 5 valores inteiros.

- **Saída**

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

| Exemplo de Entrada            | Exemplo de Saída                                             |
| ----------------------------- | ------------------------------------------------------------ |
| -5<br/>0<br/>-3<br/>-4<br/>12 | 3 valor(es) par(es)<br/>2 valor(es) impar(es)<br/>1 valor(es) positivo(s)<br/>3 valor(es) negativo(s) |

---

## <a name="exercicio4"> Exercício 4 - Contagem de Cédulas </a>

- **Desafio**

Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre **o valor lido** e a relação de notas necessárias.

- **Entrada**

Você receberá um valor inteiro **N** (0 < **N** < 1000000).

- **Saída**

Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

| Exemplo de Entrada | Exemplo de Saída                                             |
| ------------------ | ------------------------------------------------------------ |
| 576                | 576<br/>5 nota(s) de R$ 100,00<br/>1 nota(s) de R$ 50,00<br/>1 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>1 nota(s) de R$ 5,00<br/>0 nota(s) de R$ 2,00<br/>1 nota(s) de R$ 1,00 |
| 11257              | 11257<br/>112 nota(s) de R$ 100,00<br/>1 nota(s) de R$ 50,00<br/>0 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>1 nota(s) de R$ 5,00<br/>1 nota(s) de R$ 2,00<br/>0 nota(s) de R$ 1,00 |
| 503                | 503<br/>5 nota(s) de R$ 100,00<br/>0 nota(s) de R$ 50,00<br/>0 nota(s) de R$ 20,00<br/>0 nota(s) de R$ 10,00<br/>0 nota(s) de R$ 5,00<br/>1 nota(s) de R$ 2,00<br/>1 nota(s) de R$ 1,00 |

---

## <a name="exercicio5"> Exercício 5 - Consumo Médio do Automóvel </a>

- **Desafio**

Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

- **Entrada**

Você receberá dois valores: um valor inteiro **X** com a distância total percorrida (em Km), e um valor real **Y** que representa o total de combustível consumido, com um dígito após o ponto decimal.

- **Saída**

Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 500<br/>35.0       | 14.286 km/l      |
| 2254<br/>124.4     | 18.119 km/l      |
| 4554<br/>464.6     | 9.802 km/l       |