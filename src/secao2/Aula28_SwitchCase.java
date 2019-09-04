package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula28_SwitchCase {

    public static void main(String[]Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero do dia na semana:");
        int dia = sc.nextInt();

        String day;

        switch(dia) {
            case 1:
                day = "Segunda";
                break;
            case 2:
                day = "Terça";
                break;
            case 3:
                day = "Quarta";
                break;
            case 4:
                day = "Quinta";
                break;
            case 5:
                day = "Sexta";
                break;
            case 6:
                day = "Saado";
                break;
            case 7:
                day = "Domingo";
                break;
            default:
                day = "Valor invalido!";
        }

        System.out.println("O dia e: " + day);
        sc.close();
    }
}
