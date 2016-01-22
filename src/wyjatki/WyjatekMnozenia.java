package wyjatki;

public class WyjatekMnozenia extends Exception{
	String linijka;
	int numer;
	public WyjatekMnozenia(String linija, int numer){
		linijka=linija;
		this.numer=numer;
		System.out.println("MNOZ -> "+linija+" "+numer);
	};
	public String getLine(){return linijka;};
	public int getLineNo(){return numer;}
	
}
