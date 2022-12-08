package it.cefi.models;

import java.util.Map;
import java.util.TreeMap;

public class Isogramma {
	private String frase;

	
	
	public Isogramma(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public boolean verifica() {
		Map<String, Integer> mapPangramma = new TreeMap<>(){{
			put("a", 0); put("b",0); put("c",0); put("d", 0); put("e",0); 
			put("f", 0); put("g",0); put("h",0); put("i", 0); put("l",0);
			put("m", 0); put("n",0); put("o",0); put("p", 0); put("q",0);
			put("r", 0); put("s",0); put("t",0); put("u", 0); put("v",0);
			put("z",0);
		}};
		
		String[] delimitatore = frase.toLowerCase().split("[^a-z]");
		StringBuilder stringBuilder = new StringBuilder();
		for(String s: delimitatore) {
		stringBuilder.append(s);

		}
		
		frase = stringBuilder.toString();
			
		for(int i=0; i<frase.length(); i++) {	
				
				mapPangramma.put(frase.substring(i,i+1),mapPangramma.get(frase.substring(i,i+1)) +1);
			}
			
		for(int n:mapPangramma.values()) {
			if(n>1) return false;
		}
		return true;
	}
	

}