// Ver se é MEI ou Pessoa física

// Para pessoa física:
// Capturar o salário bruto do usuário
// INSS = (Salário bruto * Alíquota) - Parcela a deduzir
// Base de cálculo do IR = Salário bruto - INSS - Desconto por dependente (se houver)
// No desconto simplificado: Salário bruto - Desconto Simplificado
// Calcular o salário líquido subtraindo o imposto de renda (INSS) do salário bruto
// Verificar se tem dependentes para calcular o desconto do IR
// Se tiver, O valor mensal em 2026: R$ 189,59 fixo por dependente

// Se tiver salário entre 5000,01 - 7350,00 tem redutor adicional
// Desconto extra = 978,62 - (0,133145 * Salário bruto)
// IR final = IR Bruto - Desconto extra

import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o salário bruto:");
            Double salarioBruto = scanner.nextDouble();

            System.out.println("Quantos dependentes você tem?");
            int dependentes = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }

        scanner.close();

    }
}
