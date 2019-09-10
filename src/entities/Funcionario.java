package entities;

public class Funcionario {

    public String name;
    public double grossSalary;
    public double tax;

    public double salFim(){
        double sf = grossSalary - tax;
        return sf;
    }

}
