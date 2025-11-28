package Etapa1;
//Autor: Kauã Antônio Reis
import javax.swing.JOptionPane;
import java.util.Scanner;
public class C04EX05 {
    public static void main(String[] args) {

        String nome1, nomeEmpresa, cpf, rg, tituEleitor, cartMotorista;
        double salario;
        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("ficha.txt"));

        nome1 = arquivo.nextLine();
        cpf = arquivo.nextLine();

        rg = arquivo.nextLine();

        tituEleitor = arquivo.nextLine();

        cartMotorista = arquivo.nextLine();

        nomeEmpresa = arquivo.nextLine();
        arquivo.nextLine();


        salario = arquivo.nextDouble();
        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE: "+nome1+"\n \n Documentos \n"+"CPF ............................................. " + cpf+"\nC.I ................................." +rg+"\n Titulo de eleitor ........................... " + tituEleitor+"\nCarteira de Motorista ................... " + cartMotorista+"\n Empresa: " + nomeEmpresa+"\n Salário: R$" + salario,
                "Dados",
                JOptionPane.PLAIN_MESSAGE
        );

//            System.out.println("FICHA FUNCIONAL DE: " + nome);
//            System.out.println("Documentos:");
//            System.out.println("CPF ............................................. " + cpf);
//            System.out.println("C.I ................................." + rg);
//            System.out.println("Titulo de eleitor ........................... " + tituEleitor);
//            System.out.println("Carteira de Motorista ................... " + cartMotorista);
//            System.out.println("Empresa: " + nomeEmpresa);
//            System.out.println("Salário: R$" + salario);

        arquivo.close();

    }
}



