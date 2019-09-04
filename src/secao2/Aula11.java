package secao2;

public class Aula11 {

    public static void main(String[]Args){
        byte n1 = 126; //Só aceita ate 127
        int n2  = 1000;
        int n3  = 2147483647;
        long n4 = 2147483648L; //Colocar o L no final para entender que é um long
        boolean completed = false;
        char gender = 'F';
        char letter = '\u0041';
        float n5 = 4.5f;//f minusculo no fim para indicar que é um float
        double n6 = 4.5;

        System.out.println(completed);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

    }
}

