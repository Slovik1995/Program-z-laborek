package watki;

import wyjatki.WyjatekMnozenia;

public class WatekMnozacy extends Thread{
	public WatekMnozacy(String plik, int kolumna, interfejsy.MnoznikInterface mi, Wynik w){
		try {
			w.setWynik(mi.mnoz(plik, kolumna));
		} catch (WyjatekMnozenia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
