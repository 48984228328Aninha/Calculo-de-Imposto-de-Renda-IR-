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
import java.util.List;
import java.util.ArrayList;

public class Imposto {

    public List<Double> tabelaINSS() {
        List<Double> tabela = new ArrayList<>();
        tabela.add(0.075);
        tabela.add(0.09);
        tabela.add(0.12);
        tabela.add(0.14);
        return tabela;
    }

    public double verificarDependentes(int dependente) {
        double valorMensal = 189.59;
        return dependente * valorMensal;
    }

    public static void main(String[] args) {
        Imposto calculadora = new Imposto();
        int faixa = 0;
        double salarioBruto = 0;
        double ir = 0;
        double totalDeducao = 0;

        try {     //O usuario coloca o salario bruto.
            salarioBruto = Double
                    .parseDouble(JOptionPane.showInputDialog("Qual é o seu salário bruto?", ""));

        } catch (NumberFormatException e) { //Erro caso o usuario coloque um valor que não seja um número.
            JOptionPane.showMessageDialog(null, "Digite um número válido.", "Número inválido", 0);
        }

        try {   // O usuario coloca se tem dependentes.
            boolean temDependentes = JOptionPane.showConfirmDialog(null, "Você tem dependentes?", "Dependentes",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

            if (temDependentes == true) {   // Se tiver, faz a dedução.
                int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes você tem?", ""));
                totalDeducao = calculadora.verificarDependentes(dependentes);
            }

            else {
                totalDeducao = 0;
            }

        } catch (NumberFormatException e) {   //Erro caso o usuario coloque um valor que não seja um número.
            JOptionPane.showMessageDialog(null, "Digite um número válido.", "Número inválido", 0);
        }



        if (salarioBruto <= 1621.00 ) {       //colocando cada nivel de salario em sua respectiva faixa
    faixa = 1;
} else if (salarioBruto <= 2902.84) {
    faixa = 2;
} else if (salarioBruto <= 4354.27) {
    faixa = 3;
} else if (salarioBruto <= 8475.55) {
    faixa = 4;
} else {
    faixa = 5;
}
switch (faixa) {      //Caso Switch para calcular o IR de acordo com a faixa salarial
    case 1:
        ir = (salarioBruto * calculadora.tabelaINSS().get(0)) - 0;
        JOptionPane.showMessageDialog(null, "O Seu Imposto de Renda é: " + ir);
        break;
    case 2:
        ir = (salarioBruto * calculadora.tabelaINSS().get(1)) - 24.32;
        JOptionPane.showMessageDialog(null, "O Seu Imposto de Renda é: " + ir);
        break;
    case 3:
        ir = (salarioBruto * calculadora.tabelaINSS().get(2)) - 111.40;
        JOptionPane.showMessageDialog(null, "O Seu Imposto de Renda é: " + ir);
        break;
    case 4:
        ir = (salarioBruto * calculadora.tabelaINSS().get(3)) - 198.48;
        JOptionPane.showMessageDialog(null, "O Seu Imposto de Renda é: " + ir);
        break;
    default:
        break;
}
    }
}
