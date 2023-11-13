package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
		public Prodotto(String nome, String descrizione, float prezzo, int iva) {
			setCodice(rndNumber());
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
		}
		
//		Metodi
		private int rndNumber() {
			Random in = new Random();
			return in.nextInt();
		}
		public String getFullName() {
			return codice + "-" + nome;
		}
		
//		Codice
		public int getCodice() {
			return codice;
		}
		private void setCodice(int codice) {
			this.codice = codice;
		}
		
//		Nome
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

//		Descrizione
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
//		Prezzo
		public float getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(float prezzo) {
			this.prezzo = prezzo;
		}
		
//		Iva
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}
		
		@Override
		public String toString() {
			return "Il codice del prodotto è: " + codice + "\n"
					+ "Il nome del prodotto è: " + nome + "\n"
					+ "La sua descrizione: " + descrizione + "\n"
					+ "Il suo prezzo è: " + prezzo + "\n"
					+ "Con un iva di: " + iva + "%\n"
					+ "Il nome esteso è: " + getFullName() + "\n";
		}
		
		
}
