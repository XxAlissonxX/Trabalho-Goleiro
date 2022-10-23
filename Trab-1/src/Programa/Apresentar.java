package Programa;

import java.util.ArrayList;

public class Apresentar {
	
	public Montar carregarDados() {
		
		
		Chute chute1 = new Chute();
		chute1.setLinha((int)(Math.random()*8));
		chute1.setColuna((int)(Math.random()*15));
		
		
		Goleiro goleiro1 = new Goleiro("Pedro", 1, 2, 1, 1, 1, 1);
		goleiro1.habilidade();
		goleiro1.setLin((int)(Math.random()*8));
		goleiro1.setCol((int)(Math.random()*15));
		
		Goleiro goleiro2 = new Goleiro("Ederson", 3, 2, 1, 1, 2, 1);
		goleiro2.habilidade();
		goleiro2.setLin((int)(Math.random()*8));
		goleiro2.setCol((int)(Math.random()*15));
		
		Goleiro goleiro3 = new Goleiro("Vitor", 5, 2, 1, 3, 2, 1);
		goleiro3.habilidade();
		goleiro3.setLin((int)(Math.random()*8));
		goleiro3.setCol((int)(Math.random()*15));
		
		Goleiro goleiro4 = new Goleiro("Alisson", 3, 4, 2, 5, 2, 5);
		goleiro4.habilidade();
		goleiro4.setLin((int)(Math.random()*8));
		goleiro4.setCol((int)(Math.random()*15));
		
		Goleiro goleiro5 = new Goleiro("F.Henrique", 2, 4, 6, 3, 8, 1);
		goleiro5.habilidade();
		goleiro5.setLin((int)(Math.random()*8));
		goleiro5.setCol((int)(Math.random()*15));
		
		Goleiro goleiro6 = new Goleiro("Neuer", 1, 4, 2, 3, 5, 2);
		goleiro6.habilidade();
		goleiro6.setLin((int)(Math.random()*8));
		goleiro6.setCol((int)(Math.random()*15));
		
		Goleiro goleiro7 = new Goleiro("Valentim", 1, 2, 6, 3, 4, 1);
		goleiro7.habilidade();
		goleiro7.setLin((int)(Math.random()*8));
		goleiro7.setCol((int)(Math.random()*15));
		
		Goleiro goleiro8 = new Goleiro("TerStagen", 1, 2, 6, 3, 4, 1);
		goleiro8.habilidade();
		goleiro8.setLin((int)(Math.random()*8));
		goleiro8.setCol((int)(Math.random()*15));
		
		Goleiro goleiro9 = new Goleiro("Cristof", 3, 2, 1, 3, 4, 1);
		goleiro9.habilidade();
		goleiro9.setLin((int)(Math.random()*8));
		goleiro9.setCol((int)(Math.random()*15));
		
		Goleiro goleiro10 = new Goleiro("Shumichel", 2, 2, 9, 3, 4, 5);
		goleiro10.habilidade();
		goleiro10.setLin((int)(Math.random()*8));
		goleiro10.setCol((int)(Math.random()*15));
		
		
		Montar montar = new Montar(chute1);
		montar.addBrasil(goleiro1);
		montar.addBrasil(goleiro2);
		montar.addBrasil(goleiro3);
		montar.addBrasil(goleiro4);
		montar.addBrasil(goleiro5);
		montar.addAlemanha(goleiro6);
		montar.addAlemanha(goleiro7);
		montar.addAlemanha(goleiro8);
		montar.addAlemanha(goleiro9);
		montar.addAlemanha(goleiro10);
		
		int matriz[][] = new int[9][16];
		int i,j;
		
		for(i=0;i<9;i++) {
			for(j=0;j<16;j++) {
				matriz[i][j]= 0;//gol
				if(j==0||i==0||j==15) {
					matriz[i][j]=1;//fora
				}else if(j==1 && i>0||j==14 && i>0||i==1 && 1<j) {

				matriz[i][j]=2;//trave
				}
			
			}
		}
		
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro1.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro1.setFora(1);
			
		}else if(goleiro1.getLin() == chute1.getLinha() && goleiro1.getCol() == chute1.getColuna() || 
				goleiro1.getLin() + 1 == chute1.getLinha() && goleiro1.getCol() == chute1.getColuna()) {
			goleiro1.setDef(1);
			
		}else if(goleiro1.getLin() -1 == chute1.getLinha() && goleiro1.getCol() == chute1.getColuna() || 
				goleiro1.getLin() == chute1.getLinha() && goleiro1.getCol() +-1 == chute1.getColuna()) {
			goleiro1.setDef(1);
			
		}else {
			goleiro1.setGol(1);
		}
		
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro2.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro2.setFora(1);
			
		}else if(goleiro2.getLin() == chute1.getLinha() && goleiro2.getCol() == chute1.getColuna() || 
				goleiro2.getLin() + 1 == chute1.getLinha() && goleiro2.getCol() == chute1.getColuna()) {
			goleiro2.setDef(1);
			
		}else if(goleiro2.getLin() -1 == chute1.getLinha() && goleiro2.getCol() == chute1.getColuna() || 
				goleiro2.getLin() == chute1.getLinha() && goleiro2.getCol() +-1 == chute1.getColuna()) {
			goleiro2.setDef(1);
			
		}else {
			goleiro2.setGol(1);
		}
		
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro3.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro3.setFora(1);
			
		}else if(goleiro3.getLin() == chute1.getLinha() && goleiro3.getCol() == chute1.getColuna() || 
				goleiro3.getLin() + 1 == chute1.getLinha() && goleiro3.getCol() == chute1.getColuna()) {
			goleiro3.setDef(1);
			
		}else if(goleiro3.getLin() -1 == chute1.getLinha() && goleiro3.getCol() == chute1.getColuna() || 
				goleiro3.getLin() == chute1.getLinha() && goleiro3.getCol() +-1 == chute1.getColuna()) {
			goleiro3.setDef(1);
			
		}else {
			goleiro3.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro4.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro4.setFora(1);
			
		}else if(goleiro4.getLin() == chute1.getLinha() && goleiro4.getCol() == chute1.getColuna() || 
				goleiro4.getLin() + 1 == chute1.getLinha() && goleiro4.getCol() == chute1.getColuna()) {
			goleiro4.setDef(1);
			
		}else if(goleiro4.getLin() -1 == chute1.getLinha() && goleiro4.getCol() == chute1.getColuna() || 
				goleiro4.getLin() == chute1.getLinha() && goleiro4.getCol() +-1 == chute1.getColuna()) {
			goleiro4.setDef(1);
			
		}else {
			goleiro4.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro5.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro5.setFora(1);
			
		}else if(goleiro5.getLin() == chute1.getLinha() && goleiro5.getCol() == chute1.getColuna() || 
				goleiro5.getLin() + 1 == chute1.getLinha() && goleiro5.getCol() == chute1.getColuna()) {
			goleiro5.setDef(1);
			
		}else if(goleiro5.getLin() -1 == chute1.getLinha() && goleiro5.getCol() == chute1.getColuna() || 
				goleiro5.getLin() == chute1.getLinha() && goleiro5.getCol() +-1 == chute1.getColuna()) {
			goleiro5.setDef(1);
			
		}else {
			goleiro5.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro6.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro6.setFora(1);
			
		}else if(goleiro6.getLin() == chute1.getLinha() && goleiro6.getCol() == chute1.getColuna() || 
				goleiro6.getLin() + 1 == chute1.getLinha() && goleiro6.getCol() == chute1.getColuna()) {
			goleiro6.setDef(1);
			
		}else if(goleiro6.getLin() -1 == chute1.getLinha() && goleiro6.getCol() == chute1.getColuna() || 
				goleiro6.getLin() == chute1.getLinha() && goleiro6.getCol() +-1 == chute1.getColuna()) {
			goleiro6.setDef(1);
			
		}else {
			goleiro6.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro7.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro7.setFora(1);
			
		}else if(goleiro7.getLin() == chute1.getLinha() && goleiro7.getCol() == chute1.getColuna() || 
				goleiro7.getLin() + 1 == chute1.getLinha() && goleiro7.getCol() == chute1.getColuna()) {
			goleiro7.setDef(1);
			
		}else if(goleiro7.getLin() -1 == chute1.getLinha() && goleiro7.getCol() == chute1.getColuna() || 
				goleiro7.getLin() == chute1.getLinha() && goleiro7.getCol() +-1 == chute1.getColuna()) {
			goleiro7.setDef(1);
			
		}else {
			goleiro7.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro8.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro8.setFora(1);
			
		}else if(goleiro8.getLin() == chute1.getLinha() && goleiro8.getCol() == chute1.getColuna() || 
				goleiro8.getLin() + 1 == chute1.getLinha() && goleiro8.getCol() == chute1.getColuna()) {
			goleiro8.setDef(1);
			
		}else if(goleiro8.getLin() -1 == chute1.getLinha() && goleiro8.getCol() == chute1.getColuna() || 
				goleiro8.getLin() == chute1.getLinha() && goleiro8.getCol() +-1 == chute1.getColuna()) {
			goleiro8.setDef(1);
			
		}else {
			goleiro8.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro9.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro9.setFora(1);
			
		}else if(goleiro9.getLin() == chute1.getLinha() && goleiro9.getCol() == chute1.getColuna() || 
				goleiro9.getLin() + 1 == chute1.getLinha() && goleiro9.getCol() == chute1.getColuna()) {
			goleiro9.setDef(1);
			
		}else if(goleiro9.getLin() -1 == chute1.getLinha() && goleiro9.getCol() == chute1.getColuna() || 
				goleiro9.getLin() == chute1.getLinha() && goleiro9.getCol() +-1 == chute1.getColuna()) {
			goleiro9.setDef(1);
			
		}else {
			goleiro9.setGol(1);
		}
		
		if(matriz[chute1.getLinha()][chute1.getColuna()] == 2) {
			goleiro10.setTrave(1);	
			
		}else if(matriz[chute1.getLinha()][chute1.getColuna()] == 1) {
			goleiro10.setFora(1);
			
		}else if(goleiro10.getLin() == chute1.getLinha() && goleiro10.getCol() == chute1.getColuna() || 
				goleiro10.getLin() + 1 == chute1.getLinha() && goleiro10.getCol() == chute1.getColuna()) {
			goleiro10.setDef(1);
			
		}else if(goleiro10.getLin() -1 == chute1.getLinha() && goleiro10.getCol() == chute1.getColuna() || 
				goleiro10.getLin() == chute1.getLinha() && goleiro10.getCol() +-1 == chute1.getColuna()) {
			goleiro10.setDef(1);
			
		}else {
			goleiro10.setGol(1);
		}
		
		return montar;
	}
	
	
	public void jogo(){
		Montar montar = carregarDados();
		System.out.println(montar.imprimir());
		System.out.println("Melhor Brasileiro: "+montar.melhor());
		System.out.println("Melhor Alemao: "+montar.melhor2());
	}
}
