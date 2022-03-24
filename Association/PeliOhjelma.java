package Yhteyssuhteet;

import java.util.Scanner;

	//Tee luokka Peli ja sille ohjelmaluokka PeliOhjelma. Ohjelmalla voidaan pelata numeron arvauspeli‰. 
	//Peli-luokassa on ominaisuudet arvattava (int) ja pelaaja (Henkilo).

public class PeliOhjelma {
	Scanner input = new Scanner(System.in);
	Peli peli;
	Henkilo pelaaja;
	int arvauksia = 0;

	public static void main(String[] args) {
		PeliOhjelma ohjelma = new PeliOhjelma();
		ohjelma.aja();

	}

	public PeliOhjelma() {
		peli = new Peli();
	}

	private void aja() {
		naytaValikko();

	}

	private void naytaValikko() {
		boolean jatkuu = true;
		do {
			System.out.println("1. Tee pelaaja");
			System.out.println("2. Pelaa");
			System.out.println("3. N‰yt‰ peli");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			switch (input.nextInt()) {
			case 0:
				jatkuu = false;
				break;
			case 1:
				teePelaaja();
				break;
			case 2:
				pelaa();
				break;
			case 3:
				naytaPeli();
				break;

			default:
				System.out.println("Valinta ei kelpaa!");
			}
		} while (jatkuu);

	}

	private void naytaPeli() {

		if (arvauksia != 0) {
			System.out.println(pelaaja.getNimi() + " arvasi " + arvauksia + " kertaa numeroa " + peli.getArvattava());
		} else {
			System.out.println("Peli‰ ei ole pelattu");
		}

	}

	private void pelaa() {

		int arvaus;
		boolean valmis = false;

		try {
			if (!pelaaja.getNimi().equalsIgnoreCase("")) {

				System.out.print("Anna arvaus: ");
				while (!valmis) {

					arvaus = input.nextInt();

					if (arvaus < peli.getArvattava()) {
						System.out.println("Arvaa suurempaa:");
						arvauksia++;

					} else if (arvaus > peli.getArvattava()) {
						System.out.println("Arvaa pienemp‰‰:");
						arvauksia++;
					} else {
						System.out.println("Arvasit oikein");
						arvauksia++;
						valmis = true;
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Peli voi alkaa vasta, kun on asetettu pelaaja");
		}

	}

	private void teePelaaja() {
		pelaaja = new Henkilo();
		input.nextLine();
		System.out.print("Anna nimesi: ");
		String nimi = input.nextLine();
		pelaaja.setNimi(nimi);

	}

}
