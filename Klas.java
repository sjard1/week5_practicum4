package week5_practicum4;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Klas implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String klasCode;
	private List<Leerling> klasList = new ArrayList<>();;
	
	public Klas(String kC){
		this.klasCode = kC;
	}
	
	public void voegLeerlingToe(Leerling l){
		klasList.add(l);
	}
	
	public void wijzigCijfer(String naam, double nweCijfer){
		for(Leerling l : klasList){
			if(l.getNaam() == naam){
				l.setCijfer(nweCijfer);
			}
		}
	}
	
	public List<Leerling> getLeerlingen(){
		return this.klasList;
	}
	
	public int aantalLeerlingen(){
		return this.klasCode.length();
	}
	
	public String toString(){
		String str = "In klas " + this.klasCode + " zitten de volgende leerlingen:\n";
		for(Leerling l : this.klasList){
			str += l.toString();
		}
		return str;
	}}