package Etapa1;
//Autor: Kauã Antônio Reis;
import java.util.Scanner;
public class C07EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de uma equipe: ");
        String equipe = scanner.nextLine().trim();

        String estado;

        switch (equipe.toLowerCase()) {
            case "américa":
            case "atlético":
            case "bruzeiro":
            case "villa nova":
                estado = "Minas Gerais";
                break;

            case "botafogo":
            case "flamengo":
            case "fluminense":
            case "vasco":
                estado = "Rio de Janeiro";
                break;

            case "corinthians":
            case "palmeiras":
            case "santos":
            case "são paulo":
                estado = "São Paulo";
                break;

            case "grêmio":
            case "internacional":
            case "juventude":
                estado = "Rio Grande do Sul";
                break;

            case "náutico":
            case "santa cruz":
            case "sport":
                estado = "Pernambuco";
                break;

            default:
                estado = "Equipe não cadastrada.";
                break;
        }

        System.out.println("Estado: " + estado);
    }
}