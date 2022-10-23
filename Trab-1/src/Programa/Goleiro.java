package Programa;

public class Goleiro {
	
	private String nome;
	private int velo;
	private int agi;
	private int flex;
	private int coord;
	private int forc;
	private int equi;
	private double aag;
	private int lin;
	private int col;
	private int def;
	private int gol;
	private int fora;
	private int trave;
	
	public Goleiro(String nome, int velo, int agi, int flex, int coord, int forc, int equi) {
		this.nome = nome;
		this.velo = velo;
		this.agi = agi;
		this.flex = flex;
		this.coord = coord;
		this.forc = forc;
		this.equi = equi;
		this.aag = aag;
		this.lin = lin;
		this.col = col;
		this.def = def;
		this.gol = gol;
		this.fora = fora;
		this.trave = trave;
	}
	
	public void habilidade() {
		
		this.setAag((velo*3)+(flex*2)+(agi*3)+(coord*2)+(forc)+(equi*2)/8);
		
	}
	
	
	public int getLin() {
		return lin;
	}

	public void setLin(int lin) {
		this.lin = lin;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public String getNome() {
		return nome;
	}
	
	public int getVelo() {
		return velo;
	}
	
	public int getAgi() {
		return agi;
	}
	
	public int getFlex() {
		return flex;
	}
	
	public int getCoord() {
		return coord;
	}
	
	public int getForc() {
		return forc;
	}
	
	public int getEqui() {
		return equi;
	}

	public double getAag() {
		return aag;
	}

	public void setAag(double d) {
		this.aag = d;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	public int getFora() {
		return fora;
	}

	public void setFora(int fora) {
		this.fora = fora;
	}

	public int getTrave() {
		return trave;
	}

	public void setTrave(int trave) {
		this.trave = trave;
	}	
	
	
}
