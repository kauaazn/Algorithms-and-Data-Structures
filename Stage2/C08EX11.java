//Autor: Kauã Antônio Reis
package Etapa2;

import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        int mulheresCondicao = 0;
        String nomeMaiorSalario = "";
        double maiorSalario = Double.MIN_VALUE;

        double maiorSalarioHomem = Double.MIN_VALUE;
        double menorSalarioHomem = Double.MAX_VALUE;
        boolean existeHomem = false;

        for (int i = 1; i <= 50; i++) {

            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));

            // Lê o sexo
            String[] sexoOpcoes = {"M", "F"};
            int sexoIndex = JOptionPane.showOptionDialog(null, "Sexo de " + nome, "Sexo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sexoOpcoes, sexoOpcoes[0]);
            String sexo = sexoOpcoes[sexoIndex];

            // Lê o estado civil
            String[] estadoCivilOpcoes = {"C", "S", "O"};
            int estadoCivilIndex = JOptionPane.showOptionDialog(null, "Estado civil de " + nome, "Estado Civil",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, estadoCivilOpcoes, estadoCivilOpcoes[0]);
            String estadoCivil = estadoCivilOpcoes[estadoCivilIndex];

            // Lê a cor dos olhos
            String[] olhosOpcoes = {"A", "C", "P", "O"};
            int olhosIndex = JOptionPane.showOptionDialog(null, "Cor dos olhos de " + nome, "Cor dos Olhos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, olhosOpcoes, olhosOpcoes[0]);
            String olhos = olhosOpcoes[olhosIndex];

            // Lê a cor dos cabelos
            String[] cabeloOpcoes = {"L", "P", "C", "R"};
            int cabeloIndex = JOptionPane.showOptionDialog(null, "Cor do cabelo de " + nome, "Cor do Cabelo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, cabeloOpcoes, cabeloOpcoes[0]);
            String cabelo = cabeloOpcoes[cabeloIndex];

            // Lê o salário
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de " + nome + ":"));

            // Lê a escolaridade
            String[] escolaridadeOpcoes = {"1 - Analfabeto", "2 - Fundamental", "3 - Médio", "4 - Superior"};
            int escolaridadeIndex = JOptionPane.showOptionDialog(null, "Escolaridade de " + nome, "Escolaridade",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolaridadeOpcoes, escolaridadeOpcoes[0]);
            int escolaridade = escolaridadeIndex + 1;

            // Condição letra a - lê se é mulher loira, olho azul, idade entre 18 e 25, salario > 10000 e curso superior
            if (sexo.equals("F") && cabelo.equals("L") && olhos.equals("A")
                    && idade >= 18 && idade <= 25
                    && estadoCivil.equals("S")
                    && salario > 10000
                    && escolaridade == 4) {
                mulheresCondicao++;
            }

            // Pessoa com maior salário
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            // Diferença de salário dos homens
            if (sexo.equals("M")) {
                existeHomem = true;
                if (salario > maiorSalarioHomem) {
                    maiorSalarioHomem = salario;
                }
                if (salario < menorSalarioHomem) {
                    menorSalarioHomem = salario;
                }
            }
        }

        String resultado = "Quantidade de mulheres loiras, olhos azuis, 18-25 anos, solteiras, salário > 10.000 e superior: "
                + mulheresCondicao + "\n";
        resultado += "Pessoa com maior salário: " + nomeMaiorSalario + " (R$ " + maiorSalario + ")\n";
        if (existeHomem)
            resultado += "Diferença entre maior e menor salário dos homens: R$ " + (maiorSalarioHomem - menorSalarioHomem);


        JOptionPane.showMessageDialog(null, resultado);

    }
}
