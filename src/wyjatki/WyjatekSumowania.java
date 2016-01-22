package wyjatki;

public class WyjatekSumowania extends Exception{
	String linijka;
	int numer;
	public WyjatekSumowania(String linija, int numer){
		linijka=linija;
		this.numer=numer;
		System.out.println("SUM -> "+linija+" "+numer);
	}
	public String getLine(){return linijka;}
	public int getLineNo(){return numer;}
	
}
