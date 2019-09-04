package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula27_FuncoesString {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String original = "abcde FGHIJ abc DEFG    ";
        String s01 = original.toLowerCase(); //converte para Minusculo
        String s02 = original.toUpperCase(); //Converte para maiusculo
        String s03 = original.trim(); //elimina os espaços nos cantos da string
        String s04 = original.substring(4); //Gera nova string apartir da posição entre parenteses
        String s05 = original.substring(2, 9); //Recorta a string entre o 2 e o 9
        String s06 = original.replace('a', 'x'); //trocou todos a por x
        String s07 = original.replace("abc", "xyz"); //trocou abc por xyz

        int i = original.indexOf("bc"); //posição onde está meu primeiro bc
        int j = original.lastIndexOf("bc"); //ultima ocorrencia do bc

        System.out.println("Original:  -" + original + " - ");
        System.out.println("tolowercase:  -" + s01 + " - ");
        System.out.println("touppercase:  -" + s02 + " - ");
        System.out.println("Trim:  -" + s03 + "- ");
        System.out.println("Substring(4): -" + s04 + " - ");
        System.out.println("Substring(2, 9): -" + s05 + " - ");
        System.out.println("Replace(A, X): -" + s06 + " - ");
        System.out.println("Replace(A, X): -" + s07 + " - ");
        System.out.println("Index of 'bc':  " + i);
        System.out.println("Index of 'bc':  " + j);
    }
}
