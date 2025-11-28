package Etapa1;
//Autor: Kauã Antônio Reis

import javax.swing.JOptionPane;

public class C04EX04{
    public static void main(String[] args) {
        String nome, sobreNome, nomeMeio;
        String idade;

        sobreNome = JOptionPane.showInputDialog(null,
                "Digite seu sobrenome:",
                "Informe seu sobrenome: ",
                JOptionPane.QUESTION_MESSAGE);

        nome = JOptionPane.showInputDialog(null,
                "Digite seu nome",
                "Sobrenome",
                JOptionPane.QUESTION_MESSAGE);
        nomeMeio = JOptionPane.showInputDialog(null,
                "Digite seu nome do meio ",
                "nome meio ",
                JOptionPane.QUESTION_MESSAGE);

        idade = JOptionPane.showInputDialog(null,
                "informe sua idade",
                "idade",
                JOptionPane.QUESTION_MESSAGE);

        System.out.println(sobreNome + ", " + nome + " " + nomeMeio);
        System.out.println("idade: " + idade + " anos.");
    }
}

