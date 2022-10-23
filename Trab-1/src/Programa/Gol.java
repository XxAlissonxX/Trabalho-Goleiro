package Programa;

public class Gol {
	
	private char matriz[][] = new char[9][16];
	
	public void fazerGol() {
		
		int i,j;
		
		for(i=0;i<9;i++) {
			for(j=0;j<16;j++) {
				matriz[i][j]= 'G';
				if(j==0||i==0||j==15) {
					matriz[i][j]='F';
				}else if(j==1 && i>0||j==14 && i>0||i==1 && 1<j) {
					matriz[i][j]='T';
				}
			}
		}

		for(i=0;i<9;i++) {
			System.out.println();
			for(j=0;j<16;j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
		
	}
	
}
