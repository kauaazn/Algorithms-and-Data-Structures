package Etapa1;
//Autor: Kauã Antônio Reis
import java.util.Scanner;
public class C04EX02 {
    public static void main(String[] args) {
        String nome, cpf, identidade, tituloEleitor, carteiraMotorista, nomeEmpresa;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Escreva seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Escreva seu número de RG: ");
        identidade = teclado.nextLine();
        System.out.print("Escreva seu título de eleitor: ");
        tituloEleitor = teclado.nextLine();
        System.out.print("Escreva seu número de carteira de motorista: ");
        carteiraMotorista = teclado.nextLine();
        System.out.print("Escreva o nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();
        teclado.nextLine();
        System.out.print("Coloque o valor do seu salário: ");
        salario = teclado.nextDouble();

        System.out.println("FICHA FUNCIONAL DE: "+nome+"\n\nDocumentos:\nCPF:.................................... "+cpf+
                "\nC.I .................................... "+identidade+
                "\nTítulo de eleitor ...................... "+tituloEleitor+
                "\nCarteira de motorista .................. "+carteiraMotorista+
                "\nEmpresa: "+nomeEmpresa+
                "\nSalário: R$"+salario);
        teclado.close();

    }
}

