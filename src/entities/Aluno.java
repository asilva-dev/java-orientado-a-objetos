package entities;

public class Aluno {


    public double nota1, nota2, nota3;

    public double notaFinal(){
        double nf = nota1 + nota2 +nota3;
        return  nf;
    }

    public void aprovacao(){
        if (notaFinal() > 6.00){
            System.out.printf("PASS");
        }
        else{
            System.out.print("FAILED");
        }
    }
}
