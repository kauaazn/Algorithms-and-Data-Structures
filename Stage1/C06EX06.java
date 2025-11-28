package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String A, B, C;
        JOptionPane.showMessageDialog(null,
                "Informe os valor dos coeficientes para o cálculo\n de uma função de segundo grau\n\n f(x) = Ax²+Bx+C",
                "Equação de segundo grau",
                JOptionPane.INFORMATION_MESSAGE);
        A = JOptionPane.showInputDialog(null,
                "Informe o valor de A:",
                "Equação de segundo grau",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(A);
        double A1 = Double.parseDouble(A);
        B = JOptionPane.showInputDialog(null,
                "Informe o valor de B:",
                "Equação de segundo grau",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(B);
        double B1 = Double.parseDouble(B);
        C = JOptionPane.showInputDialog(null,
                "Informe o valor de C",
                "Equação de segundo grau",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(C);
        double C1 = Double.parseDouble(C);
        double y1,y2;
        double delta = Math.pow(B1,2) - (4*A1*C1);
        if (delta > 0){
            y1 = ((-B1) + Math.sqrt(delta)) / (2*A1);
            y2 = ((-B1) - Math.sqrt(delta)) / (2*A1);
            JOptionPane.showMessageDialog(null,
                    "Valores: \n\nx1:"+y1+"\nx2: "+y2,
                    "Raiz da função",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            y1 = (-B1) / (2*A1);
            JOptionPane.showMessageDialog(null,
                    "Valores: \n\nx1: "+y1,
                    "Raiz da função",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Não há resultado para a função",
                    "Raiz da função",
                    JOptionPane.INFORMATION_MESSAGE);
            teclado.close();
        }


    }
}
