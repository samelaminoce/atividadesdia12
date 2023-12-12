package atividadesdia12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista2_Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner leia = new Scanner (System.in);
      Set <Integer> numeros = new HashSet<Integer>();
      int entradanum;
      
      for(int indice = 0; indice < 10; indice++) {
      System.out.println("Insira o " + (indice + 1)+ " º número:");
     int numero = leia.nextInt();
      numeros.add(numero);
      }
      System.out.println("\nlista de dados do Set: ");
      Iterator <Integer> num = numeros.iterator();
      while (num.hasNext()) {
    	  System.out.println(num.next());
    	  
      }
      
      

      
     
   
		
	
      
      
      
  
      
	}

}
