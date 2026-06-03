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

import javax.swing.JOptionPane;

public class Imposto {

    public static void main(String[] args) {
        try {
            Double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(0, "Digite o salário bruto:"));
            JOptionPane.showMessageDialog(null, salarioBruto, null, 0);

        } catch (NumberFormatException e) {
            System.out.println("Digite um número válido.");
        }

        try {
            int dependentes = Integer.parseInt(JOptionPane.showInputDialog(0, "Quantos dependentes você tem?"));
            JOptionPane.showMessageDialog(null, dependentes, null, 0);

        } catch (NumberFormatException e) {
            System.out.println("Digite um número válido.");
        }

    }
}
