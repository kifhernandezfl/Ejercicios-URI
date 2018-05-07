package market;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Market 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
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
        }   
    }
}