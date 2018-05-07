package cards;

public class nodo 

{
    int id;

    nodo next = null; 

    public nodo() {}

    public nodo(int id)
    {
        this.id = id;
    }

    public String toString()
    {
        int pos = this.id;
        return String.valueOf(pos);
    }

    public nodo clone()
    {
        nodo temp = new nodo(this.id);
        return temp;
    }
}


