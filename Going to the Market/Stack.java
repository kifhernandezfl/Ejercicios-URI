package market;
import java.io.*;

public class Stack 
{
	nodo head = null;
	
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	public void Push(nodo newnodo)
	{
		newnodo.next = head;
		head = newnodo;
	}
	
	public String Pop()
	{
		nodo temp = head;
		head = head.next;
		String info = temp.toString();
		//temp=null;
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
	
	public void printStack()
	{	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try
		{   
			while(!isEmpty())
			
				bw.write(Pop());
			
			bw.flush();
		}
		catch(Exception ex) {ex.printStackTrace();}
	}
}