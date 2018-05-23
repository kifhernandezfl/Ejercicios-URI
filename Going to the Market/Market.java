package market;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Market 
{
    public static void main(String[] args) throws IOException 
    {
        /*BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        int trips = Integer.parseInt(br.readLine());
        int quantity = 0, productos = 0;
        double price = 0, x = 0;
        String product = "";
        String [] separar = {};
        Lista products = new Lista();
        Lista quantitys = new Lista();
        
        for(int i = 0; i < trips; i++)
        {
            productos = Integer.parseInt( br.readLine() );
            
            for(int j = 0; j < productos; j++)
            {
                product = br.readLine();
                //System.out.println(product);
                separar = product.split("\\s+");
                //System.out.println(separar[1]);
                price =  Double.parseDouble(separar[1]);
                products.insertAtEnd(new nodo(separar[0], price));    
            }
            products.printList();
            
            quantity = Integer.parseInt(br.readLine());
            
            for(int k = 0; k < quantity; k++)
            {
                product = br.readLine();
                separar = product.split("\\s+");
                price = Double.parseDouble(separar[1]);
                quantitys.insertAtEnd(new nodo(separar[0], price));
            }
            quantitys.printList();
            
            nodo temp = quantitys.head;
            nodo temp1 = products.head;
            
            while(temp != null)
            {
                if(temp.product.equals(temp1.product))
                x = temp.price * temp1.price;
                System.out.println(x);
                temp = temp.next;
                temp1 = temp1.next;
            }
        }  */
        
        Lista list = new Lista();
        Stack pila = new Stack();
        
        list.insertAtEnd(new nodo("mora",3.2));
        list.insertAtEnd(new nodo("pera",2.1));
        list.insertAtEnd(new nodo("aji",4.1));
        list.insertAtEnd(new nodo("papa",1.2));
        list.printList();
        System.out.println("\n");
        
        pila.Push(new nodo("mora",2));
        pila.Push(new nodo("pera",2));
        pila.Push(new nodo("papa",2));
        
        String info = "";
        String [] split = new String[0];
        String product = "";
        double price = 0;
        double result = 0;
        nodo temp = list.head;
        
         
        info = pila.Pop();
        split = info.split("\\s+");
        product = split[1];
        price = Double.parseDouble(split[2]);


        if(product.equals(temp.product))
        {
            result = price * temp.price;
            System.out.println(temp.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.product))
        {
            result = price * temp.next.price;
            System.out.println(temp.next.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.next.product))
        {
            result = price * temp.next.next.price;
            System.out.println(temp.next.next.product);
            System.out.println("Price: " + result);
        }
                  
        if(product.equals(temp.next.next.next.product))
        {
            result = price * temp.next.next.next.price;
            System.out.println(temp.next.next.next.product);
            System.out.println("Price: " + result);
        }         
        
        info = pila.Pop();
        split = info.split("\\s+");
        product = split[1];
        price = Double.parseDouble(split[2]);


        if(product.equals(temp.product))
        {
            result = price * temp.price;
            System.out.println(temp.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.product))
        {
            result = price * temp.next.price;
            System.out.println(temp.next.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.next.product))
        {
            result = price * temp.next.next.price;
            System.out.println(temp.next.next.product);
            System.out.println("Price: " + result);
        }
                  
        if(product.equals(temp.next.next.next.product))
        {
            result = price * temp.next.next.next.price;
            System.out.println(temp.next.next.next.product);
            System.out.println("Price: " + result);
        }
        
        info = pila.Pop();
        split = info.split("\\s+");
        product = split[1];
        price = Double.parseDouble(split[2]);


        if(product.equals(temp.product))
        {
            result = price * temp.price;
            System.out.println(temp.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.product))
        {
            result = price * temp.next.price;
            System.out.println(temp.next.product);
            System.out.println("Price: " + result);
        }

        if(product.equals(temp.next.next.product))
        {
            result = price * temp.next.next.price;
            System.out.println(temp.next.next.product);
            System.out.println("Price: " + result);
        }
                  
        if(product.equals(temp.next.next.next.product))
        {
            result = price * temp.next.next.next.price;
            System.out.println(temp.next.next.next.product);
            System.out.println("Price: " + result);
        }
    }
}