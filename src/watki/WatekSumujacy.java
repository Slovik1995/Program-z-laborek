package watki;

import wyjatki.WyjatekSumowania;

public class WatekSumujacy extends Thread{
	public WatekSumujacy(String plik, interfejsy.SumatorInterface su, Wynik w){
		try {
			w.setWynik(su.sumuj(plik));
		} catch (WyjatekSumowania e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
