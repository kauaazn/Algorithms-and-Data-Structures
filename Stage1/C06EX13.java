package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C06EX13 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int horaInicio,minutoInicio, horaFim, minutoFim, duracao, inicio, fim,horas, minutos, soma;
        System.out.print("Hora q começou: ");
        horaInicio=teclado.nextInt();
        System.out.print("Minuto q começou: ");
        minutoInicio=teclado.nextInt();
        System.out.print("Hora que terminou: ");
        horaFim=teclado.nextInt();
        System.out.print("Minuto que terminou: ");
        minutoFim=teclado.nextInt();
        inicio= horaInicio*60+minutoInicio;
        fim= horaFim*60+minutoFim;

        duracao=fim-inicio;
        horas= duracao/60;
        minutos=duracao%60;
        System.out.print(horas+" horas e "+minutos+" minutos.");
        teclado.close();


    }
}
