package Tehtävät;


public class Asunto {
	private String tyyppi, osoite, kuvaus;
	private double ala, hinta;
	
	public Asunto() {
		
	}

	public Asunto(String tyyppi, String osoite, String kuvaus, double ala, double hinta) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.kuvaus = kuvaus;
		this.ala = ala;
		this.hinta = hinta;
	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public double getAla() {
		return ala;
	}

	public void setAla(double ala) {
		this.ala = ala;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", kuvaus=" + kuvaus + ", ala=" + ala + ", hinta="
				+ hinta + "]";
	}

}
