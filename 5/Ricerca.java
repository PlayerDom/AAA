package it.domi.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Ricerca {
	private List<Integer> numero = new ArrayList<>();
	private int input;
	
	public Ricerca(int input) {
		Random random = new Random();
		for(int i=0; i<100; i++) {
		numero.add(random.nextInt(101));
		}
		Collections.sort(numero);
		this.input=input;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public List<Integer> getNumero() {
		return numero;
	}

	public void setNumero(List<Integer> numero) {
		this.numero = numero;
	}

	public int binarySearch(int low,int high) {
		 int mid = (low + high) / 2; 

		 if (low > high)
         return -1;

		     else if (input == numero.get(mid)) {
		    	 	
		            return mid;
		     }
		     else if (input > numero.get(mid))        
             return binarySearch(mid + 1, high);
         
         else                        
             return binarySearch(low, mid - 1); 
	
	}
	 
}
