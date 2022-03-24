package Yhteyssuhteet;

public class Peli {
	private int arvattava;
	private Henkilo pelaaja;
	
	public Peli() {
		arvattava = 73;
		pelaaja = null;
	}

	public Peli(int arvattava, Henkilo pelaaja) {
		this.arvattava = arvattava;
		this.pelaaja = pelaaja;
	}

	public int getArvattava() {
		return arvattava;
	}

	public void setArvattava(int arvattava) {
		this.arvattava = arvattava;
	}

	public Henkilo getPelaaja() {
		return pelaaja;
	}

	public void setPelaaja(Henkilo pelaaja) {
		this.pelaaja = pelaaja;
	}
	

	@Override
	public String toString() {
		return "Peli [arvattava=" + arvattava + ", pelaaja=" + pelaaja + "]";
	}
	
}

