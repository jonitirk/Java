package Teht‰v‰t;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

//Tee ohjelma AsuntolistaOhjelma, jolla lis‰t‰‰n listaan asuntoja ja n‰ytet‰‰n ne. 
//Tee AsuntolistaOhjelma luokkaan metodit lisaaAsunto ja naytaAsunnot.

public class AsuntolistaOhjelma {
	Scanner input = new Scanner(System.in);
	Asunto asunto;
	String tyyppi, osoite, kuvaus;
	double ala, hinta;
	ArrayList<Asunto> asunnot = new ArrayList<Asunto>();
	DecimalFormat desimaalit = new DecimalFormat("0.00");

	public static void main(String[] args) {
		AsuntolistaOhjelma ohjelma = new AsuntolistaOhjelma();
		ohjelma.aja();

	}

	private void aja() {
		naytaValikko();
		
	}

	private void naytaValikko() {
		boolean jatkuu = true;
		do {
			System.out.println("1. Lis‰‰ asunto");
			System.out.println("2. N‰yt‰ asunnot");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-2): ");
			switch (input.nextInt()) {
			case 0:
				jatkuu = false;
				break;
			case 1:
				lisaaAsunto();
				break;
			case 2:
				naytaAsunnot();
				break;

			default:
				System.out.println("Valinta ei kelpaa!");
			}
		} while (jatkuu);
		
	}

	private void lisaaAsunto() {
		asunto = new Asunto();
		input.nextLine();
		
		System.out.print("Anna asunnon tyyppi: ");
		tyyppi = input.nextLine();
		asunto.setTyyppi(tyyppi);
		
		System.out.print("Anna osoite: ");
		osoite = input.nextLine();
		asunto.setOsoite(osoite);
		
		System.out.print("Anna pinta-ala: ");
		ala = input.nextDouble();
		asunto.setAla(ala);
		
		System.out.print("Anna hinta: ");
		hinta = input.nextDouble();
		asunto.setHinta(hinta);
		
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		kuvaus = input.nextLine();
		asunto.setKuvaus(kuvaus);
		
		asunnot.add(asunto);
		
	}

	private void naytaAsunnot() {
		input.nextLine();
		for(Asunto x: asunnot) {
			System.out.println("Tyyppi: " + x.getTyyppi());
			System.out.println("Osoite: " + x.getOsoite());
			System.out.println("Pinta-ala: " + desimaalit.format(x.getAla()));
			System.out.println("Hinta: " + desimaalit.format(x.getHinta()) + " euroa");
			System.out.println("Kuvaus: " + x.getKuvaus());
		}
		
	}

}
