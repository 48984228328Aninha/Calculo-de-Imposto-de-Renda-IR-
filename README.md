<div align="center">
<h1>Calculadora de Imposto de Renda com regras 2026</h1>
</div>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Licença](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)

Um software simplificado em Java desenvolvida para calcular o Imposto de Renda Retido na Fonte (IRRF), totalmente atualizada com as regras da **Reforma da Renda de 2026**. 

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

* **Interface Interativa:** Captura de dados simplificada via caixas de diálogo (`Swing/JOptionPane`).
* **Tratamento de Exceções:** Proteção contra entradas inválidas (letras ou campos vazios) usando blocos `try-catch`.
* **Dedução de Dependentes:** Opção dinâmica para calcular o abatimento por dependentes (R$ 189,59 por dependente em 2026).
* **Cálculo Progressivo Duplo:** Processa em sequência as faixas do INSS e, em seguida, as faixas do Imposto de Renda.
* **Regra do Novo Redutor (2026):** Aplica o desconto extra por fórmula para salários brutos de até R$ 7.350,00, garantindo a isenção prática para quem ganha até R$ 5.000,00.

---

<div align="center">
<h1>Estrutura do Código</h1>
</div>

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
