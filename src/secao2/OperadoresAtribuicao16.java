package secao2;

public class OperadoresAtribuicao16 {

    public static void main(String[] args) {
        double n1 = 10.0D;
        double n2 = 30.0D;
        String s = "ABC";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s);
        System.out.println("------------------------");
        n1 *= 2.0D;
        n2 += n1;
        s = s + "DEF";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s);
    }
}
