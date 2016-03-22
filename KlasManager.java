package week5_practicum4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class KlasManager {
	private String path = "B:\\eclipse-java-mars-2-win32-x86_64\\eclipse\\V1ODC1\\src\\week5";
	
	@SuppressWarnings("resource")
	public void klasOpslaan(Klas deKlas) throws IOException {
		/* Voeg hier code toe om parameter 'deKlas' in bestand klas.obj */
		
		FileOutputStream fout = new FileOutputStream(this.path);
		ObjectOutputStream oos;
		oos = new ObjectOutputStream(fout);
		oos.writeObject(deKlas);
	}

	@SuppressWarnings("resource")
	public Klas klasInladen(){
		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */

		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */
		
		Klas deKlas = null;
		try {
			FileInputStream fin = new FileInputStream(this.path);
			ObjectInputStream ois = new ObjectInputStream(fin);
			deKlas = (Klas) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return deKlas;
	}
}
