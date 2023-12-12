package atividadesdia12;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1_Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    try (Scanner leia = new Scanner (System.in)) {
		ArrayList <String> cores = new ArrayList<String>();
		String cores2;
		
		
		for(int contador = 0; contador <5; contador++) {
			System.out.println("Insira uma cor: ");
			cores2 = leia.nextLine();
			cores.add(cores2);
		}
			System.out.println("listar todas as cores ");
			for(String i: cores) {
				System.out.println(i);
				
				
			}
	}
    }
    
    }

    	
   
