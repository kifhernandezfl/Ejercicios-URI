package cards;
import java.util.*;

public class Cards 
{
     public static void main(String[] args) 
    {
        Queue cola = new Queue();
        
        cola.Enqueue(new nodo(1));
        cola.Enqueue(new nodo(2));
        cola.Enqueue(new nodo(3));
        cola.Enqueue(new nodo(4));
        cola.Enqueue(new nodo(5));
        cola.Enqueue(new nodo(6));
        cola.Enqueue(new nodo(7));
        cola.Dequeue();
        String x = cola.Dequeue();
        int y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        //cola.printQueue();
        cola.Dequeue();
        x = cola.Dequeue();
        y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        //cola.printQueue();
        cola.Dequeue();
        x = cola.Dequeue();
        y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        //cola.printQueue();
        cola.Dequeue();
        x = cola.Dequeue();
        y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        //cola.printQueue();
        cola.Dequeue();
        x = cola.Dequeue();
        y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        //cola.printQueue();
        cola.Dequeue();
        x = cola.Dequeue();
        y = Integer.parseInt(x);
        cola.Enqueue(new nodo(y));
        cola.printQueue();
        
/*        System.out.println(cola.Dequeue());
        System.out.println(cola.Dequeue());
        cola.printQueue();*/
    }
}

    

