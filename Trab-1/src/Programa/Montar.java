package Programa;

import java.util.ArrayList;


public class Montar {
	
	private Goleiro goleiro;
	private Chute chute;
	public ArrayList<Goleiro> listaBrasil;
	public ArrayList<Goleiro> listaAlemanha;
	public Montar(Chute chute) {
		
		this.chute = chute;
		listaBrasil = new ArrayList<Goleiro>();
		listaAlemanha = new ArrayList<Goleiro>();
	}


	public Chute getChute() {
		return chute;
	}

	public void setChute(Chute chute) {
		this.chute = chute;
	}

	public ArrayList<Goleiro> getListaAlemanha() {
		return listaAlemanha;
	}


	public void setListaAlemanha(ArrayList<Goleiro> listaAlemanha) {
		this.listaAlemanha = listaAlemanha;
	}


	public ArrayList<Goleiro> getListaGoleiro() {
		return listaBrasil;
	}
	
	public void addAlemanha(Goleiro gole) {
		listaAlemanha.add(gole);
	}
	
	public void setListaGoleiro(ArrayList<Goleiro> lista) {
		this.listaBrasil = lista;
	}
	
	public void addBrasil(Goleiro gole) {
		listaBrasil.add(gole);
	}
	
	public Goleiro getGoleiro() {
		return goleiro;
	}

	public void setGoleiro(Goleiro goleiro) {
		this.goleiro = goleiro;
	}	
	
	
	
	public String imprimir() {
		
		String saida = "";

		saida += "\n----------------------------------------------------\n";

		saida += "\n*******  Goleiros *******  ";
		
		saida += "\n\t Brasil";
		
		for (Goleiro goleiro : listaBrasil) {
			
			saida += "\n\n nome: " + goleiro.getNome();
			saida += "\n aag: " + goleiro.getAag();	
			saida += "\n Posicao: " + goleiro.getLin()+"."+goleiro.getCol();
			
			if(goleiro.getTrave()!=0) {
				saida += "\n Bola na Trave ";
			}else if(goleiro.getFora()!=0) {
				saida += "\n Bola Fora ";
			}else if(goleiro.getGol()!=0) {
				saida += "\n Gooolll!!!";
			}else if(goleiro.getDef()!=0) {
				saida += "\n Defesa!";
			}
		}
		

		saida += "\n----------------------------------------------------";
		

		saida += "\n*******  Goleiros *******  ";
		
		saida += "\n\t Alemanha";
		
		for (Goleiro goleiro : listaAlemanha) {
			
			saida += "\n\n nome: " + goleiro.getNome();
			saida += "\n aag: " + goleiro.getAag();	
			saida += "\n Posicao: " + goleiro.getLin()+"."+goleiro.getCol();
			
			if(goleiro.getTrave()!=0) {
				saida += "\n Bola na Trave ";
			}else if(goleiro.getFora()!=0) {
				saida += "\n Bola Fora ";
			}else if(goleiro.getGol()!=0) {
				saida += "\n Gooolll!!!";
			}else if(goleiro.getDef()!=0) {
				saida += "\n Defesa!";
			}
		}
		

		saida += "\n----------------------------------------------------";


		return saida;
	}
	public String melhor() {
		
		double nota = 0;
		String melhor = "";
		
		for (Goleiro best : listaBrasil) {
			nota = best.getAag();
			melhor = best.getNome();
			
			if(best.getAag()>nota) {
				melhor = best.getNome();
				nota = best.getAag();
			}
		}
		return melhor;
	}
	
public String melhor2() {
		
		double nota = 0;
		String melhor = "";
		
		for (Goleiro best : listaAlemanha) {
			nota = best.getAag();
			melhor = best.getNome();
			
			if(best.getAag()>nota) {
				melhor = best.getNome();
				nota = best.getAag();
			}
		}
		return melhor;
	}
}
