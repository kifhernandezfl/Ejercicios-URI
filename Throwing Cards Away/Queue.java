package cards;
import java.io.*;

public class Queue 
{
    nodo head = null;

    public boolean isEmpty()
    {
        return head == null ? true : false;
    }

    public void  Enqueue(nodo newnodo)
    {
        if(isEmpty())
            head = newnodo;
        else
        {
            nodo temp = head;

            while(temp.next != null)
                temp = temp.next;
            
            temp.next = newnodo;
        }
    }

    public String Dequeue()
    {
        nodo temp = head;
        head = head.next;
        String info = temp.toString();
        //temp = null;
        System.gc();
        return info;
    }
    
    public String Peek()
    {
        nodo temp = head;
        String info = temp.toString();	
        return info;	
    }
    
    public int length() // tamaño de la lista
	{
		int counter = 0;
		nodo temp = head;
		
		while(temp != null)
		{
			counter += 1;
			temp = temp.next;
		}
		
		return counter;
	}
    
    public void printQueue()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try
        {  
            while(!isEmpty())
                bw.write(Dequeue());
            bw.flush();
        }
        catch(Exception ex) {ex.printStackTrace();}
    }
}