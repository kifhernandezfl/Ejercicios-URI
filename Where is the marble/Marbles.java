package urijudge;
import java.util.*;

public class Marbles 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();
        nodo temp = lista.head;
        int id = 0 ,x = 0 ,y = 0, max = Integer.MIN_VALUE;
        
        int marbles = -1;
        int querys = -1;
        
        while(marbles != 0 && querys != 0)
        {
            marbles = scan.nextInt();
            querys = scan.nextInt();
            //System.out.println(marbles);
            //System.out.println(querys);


            for(int i = 0; i < marbles; i++)
            {
                id = scan.nextInt();
                lista.insertAtEnd(new nodo(id));
                
                if(id > max)
                    max = id;
            }
            
            lista.quickSort(lista);
            //lista.printList();

            for(int j = 0; j < querys; j++)
            {
                x = scan.nextInt();
                System.out.println("Caso #:" + (j+1));
               // System.out.println(x);
              //System.out.println("bianry " + lista.binarySearch(x, 0, max));
                if(lista.binarySearch(x, 0, max) == null)
                {
                    System.out.println( x + " not found" );
                }else
                {
                    System.out.println( x + " found at " + lista.binarySearch(x, 0, max));
                }
            }
        }
    }
}
