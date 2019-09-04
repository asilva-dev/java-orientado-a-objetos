package secao2;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class Ex03_4 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o horário inicio do jogo: ");
        int inicio = sc.nextInt();

        System.out.println("Insira o horário fim do jogo: ");
        int fim = sc.nextInt();

        int total;

        if(inicio < fim){ //se inicio for menor que fim
            total = fim - inicio;
        }else{
            total = 24 - inicio + fim;
        }

        System.out.println("O jogo durou " + total + " hora(s)!");

        sc.close();
    }
}
