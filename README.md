<div align="center">
<h1>Calculadora de Imposto de Renda com regras 2026</h1>
</div>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Licença](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)

Uma API simplificada em Java desenvolvida para calcular o Imposto de Renda Retido na Fonte (IRRF), totalmente atualizada com as regras da **Reforma da Renda de 2026**. 

O projeto foi estruturado focando em alta manutenibilidade, eliminando estruturas condicionais complexas (`if/else` aninhados) através do uso elegante da **Java Stream API**.

---

<div align="center">
  <video src="https://github.com/user-attachments/assets/cf2d84d0-e6c0-464b-a9f8-9d18954b9706" controls></video>
</div>

<div align="center">
<h1>Funcionalidades</h1>
</div>

* **Cálculo Automatizado da Base:** Dedução automática do INSS sobre o salário bruto.
* **Motor de Busca por Streams:** Identificação da alíquota e parcela a deduzir sem loops ou condicionais engessados.
* **Regra da Reforma de 2026:** Implementação do **Redutor Adicional** para faixas de transição (isenção prática até R$ 5.000,00 e cálculo linear até R$ 7.350,00).
* **Arquitetura Limpa:** Separação clara entre o modelo de dados das tabelas (`FaixaImposto`) e as regras de negócio (`Imposto`).

---

<div align="center">
<h1>Estrutura do Cálculo</h1>
</div>

O sistema opera em 4 etapas bem definidas:

1.  **Dedução da Previdência:** Encontra a base tributável subtraindo o INSS do Salário Bruto.
2.  **Filtro por Stream:** Transforma a tabela progressiva em um fluxo de dados para encontrar a faixa correspondente instantaneamente:
    ```java
    FaixaImposto faixa = tabela.stream()
        .filter(f -> baseCalculo <= f.getLimiteMaximo())
        .findFirst()
        .orElseThrow();
    ```
3.  **Aplicação do Redutor 2026:** Aplica a fórmula de transição pós-reforma baseada no salário bruto inicial.
4.  **Cálculo Efetivo:** Retorna o imposto final devido garantindo a impossibilidade de valores negativos.

---

<div align="center">
<h1>Estrutura do Código</h1>
</div>

* `FaixaImposto.java`: Classe de modelo que encapsula as propriedades de cada faixa da tabela da Receita Federal.
* `Imposto.java`: Core do sistema, responsável por receber as entradas, orquestrar os cálculos e aplicar as regras vigentes.
* `Main.java`: Executável para testes e validação de cenários no console.

---

<div align="center">
<h1>Exemplo de Uso</h1>
</div>

```java
// Definindo os valores de entrada
double salarioBruto = 6000.00;
double inss = 641.51; 

Imposto calculadora = new Imposto(0.0, salarioBruto, inss);
double irrfDevido = calculadora.calcularImposto(inss, salarioBruto);

System.out.printf("IRRF Final Devido: R$ %.2f", irrfDevido);
// Saída esperada para 2026: R$ 385,10
```

<div align="center">
<h1>Tabela IRRF</h1>
  <img width="897" height="532" alt="image" src="https://github.com/user-attachments/assets/1e9a6c74-059f-40db-bc37-922480e6363a" />
</div>

<div align="center">
<h1>Tabela INSS</h1>
  <img width="910" height="550" alt="image" src="https://github.com/user-attachments/assets/99165c98-108c-4518-b636-b7f99e2505ce" />
</div>

### Desenvolvido por Luiz e Amanda
