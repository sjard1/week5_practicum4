package week5_practicum4;


import java.io.Serializable;

public class Leerling implements Serializable{
	private static final long serialVersionUID = 1L;

	private String naam;
	private double cijfer;
	
	public Leerling(String nm){
		this.naam = nm;
	}
	
	public String getNaam(){
		return this.naam;
	}
	
	public double getCijfer(){
		return this.cijfer;
	}
	
	public void setCijfer(double c){
		this.cijfer = c;
	}
	
	public String toString(){
		return this.naam + " heeft cijfer: " + this.cijfer + "\n";
	}
}