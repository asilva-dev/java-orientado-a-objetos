package secao2;

public class Aula15 {

    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 14;
        int n3 = 2;
        double n4 = 1.25D;
        double a = 1.0D;
        double b = -3.0D;
        double c = -4.0D;
        double x1 = (-b + Math.sqrt(b * b - 4.0D * a * c)) / (2.0D * a); //Math.sqrt faz raiz quadrada  - Fómula de Bhaskara
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(x1);
    }
}
