import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import wyjatki.WyjatekMnozenia;
import wyjatki.WyjatekSumowania;

public class ArytmetykaPlikowa implements interfejsy.MnoznikInterface, interfejsy.SumatorInterface{

	@Override
	public long sumuj(String plik) throws WyjatekSumowania {
	
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(new File(plik)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int counter=0;
		int wynik=0;

		
			String s=null;
			try {
				while((s=br.readLine())!=null){
				counter++;
				
				for(int k=0; k<s.length(); k++){
					String str = Character.toString(s.charAt(k));
					if(str.matches("[0123456789]"))
					{
						wynik+= Integer.valueOf(str);
					}
					else throw new wyjatki.WyjatekSumowania(s,counter);
				}
}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally{
			
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return wynik;
		
	}

	@Override
	public long mnoz(String plik, int kolumna) throws WyjatekMnozenia {
	
		int wynik=1;
		int counter=0;
		BufferedReader br=null;
		try {
			
			
			try {
				br = new BufferedReader(new FileReader(new File(plik)));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String s =null;
		try {
			while((s=br.readLine())!=null){
				counter++;
					String str = Character.toString(s.charAt(kolumna));
					if(str.equals("2"))
					{
						wynik*= 2;
					}
					else if(str.matches("[A-Za-z]"))throw new wyjatki.WyjatekMnozenia(s,counter);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		} finally{
		
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return wynik;
	}

}
