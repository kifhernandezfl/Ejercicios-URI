package market;

public class nodo 
{
    String product;
    double price;

    nodo next = null; 

    public nodo() {}

    public nodo(String product, double price)
    {
        this.product = product;
        this.price = price;
    }

    public String toString()
    {
        return " " + this.product + "\t" + this.price + "\n";
    }

    public nodo clone()
    {
        nodo temp = new nodo(this.product,this.price);
        return temp;
    }
}
