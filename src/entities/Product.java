package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //Total no estoque
    public double totalValueInStock(){

        return price * quantity;
    }

    //Adicionando Produtos no estoque
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    //Removendo Produtos no estoque
    public void  removeProducts(int quantity){
        this.quantity -= quantity;
    }

    //Imprimindo na tela
    public String toString() {
        return name
        + ", $ "
         + String.format("%.2f", price)
         + ", "
         + quantity
         + " units, Total: $ "
         + String.format("%.2f", totalValueInStock());
    }
}
