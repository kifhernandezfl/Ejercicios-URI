package cards;
import java.util.*;

public class Cards 
{
     public static void main(String[] args) 
    {
        Queue cola = new Queue();
        Queue cola1 = new Queue();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        for (int i = 1; i <= size; i++)
        {
            cola.Enqueue(new nodo(i));
        }
        
        while(cola.length() > 1)
        {
            
            int s = Integer.parseInt(cola.Dequeue());
            cola1.Enqueue(new nodo(s));
            String x = cola.Dequeue();
            int y = Integer.parseInt(x);
            cola.Enqueue(new nodo(y));
        }
        cola1.printQueue();
        cola.printQueue();
    }
}
