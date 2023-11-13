package org.lessons.java.shop;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
		public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
			setCodice(codice);
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
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
}
