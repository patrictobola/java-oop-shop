package org.lessons.java.shop;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
		public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
			
		}
		
		public int getCodice() {
			return codice;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getDescrizione() {
			return descrizione;
		}
		public float getPrezzo() {
			return prezzo;
		}
		public int getIva() {
			return iva;
		}
}
