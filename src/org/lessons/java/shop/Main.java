package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto p = new Prodotto("Pringles", "Patatine gusto paprika", 2.99f, 22);
		System.out.println("Versione con il toString dell'oggetto");
		System.out.println("-------------------------------------");
		System.out.println(p);
		System.out.println("");
		System.out.println("Versione con i getter");
		System.out.println("-------------------------------------");
		System.out.println("Il codice del prodotto è: " + p.getCodice() + "\n"
				+ "Il nome del prodotto è: " + p.getNome() + "\n"
				+ "La sua descrizione: " + p.getDescrizione() + "\n"
				+ "Il suo prezzo è: " + p.getPrezzo() + "€\n"
				+ "Con un iva di: " + p.getIva() + "%\n"
				+ "Il nome esteso è: " + p.getFullName() + "\n"
				+ "Il prezzo compreso di iva è: " + p.getFullPrice() + "€\n"
				+ "Il codice con pad left è: " + p.getPaddedCode() + "\n");
	}
}
