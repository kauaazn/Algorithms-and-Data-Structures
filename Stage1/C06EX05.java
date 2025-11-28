package Etapa1;
//Autor: Kauã Antônio Reis;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class C06EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numInteiro;
        numInteiro = JOptionPane.showInputDialog(null,
                "Informe um número inteiro:",
                "Divisível",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(numInteiro);
        int num1 = Integer.parseInt(numInteiro);
        if ((num1%5 == 0) && (num1%7 == 0)) {
            JOptionPane.showMessageDialog(null,
        num1+" é divisível por 5 e 7",
                    "Divisível",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    num1+" não é divisível por 5 e 7",
                    "Não é divisível",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        teclado.close();

    }
}
