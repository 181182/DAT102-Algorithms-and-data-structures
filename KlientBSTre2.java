package KjedetBinaerSoekeTre;

import java.util.Random;

public class KlientBSTre2 {

	public static void main(String[] args) {

		int antallBSTre = 100;

		final int ANTALL_NODER = 1024;
		Random tilfeldig = new Random();
		int antall = 0;
		
		KjedetBinaerSokeTre<Integer> bs;
		
		Integer minHoyde = ANTALL_NODER;
		Integer maksHoyde = 0;
		Integer gjennomsnitt = 0;

		for (int i = 0; i < antallBSTre; i++) {
			bs = new KjedetBinaerSokeTre<Integer>();

			for (int j = 0; j < ANTALL_NODER; j++) {
				Integer element = new Integer(tilfeldig.nextInt());
				bs.leggTil(element);
			}
			
			antall = antall + bs.antall();
			
			if (minHoyde > bs.hoyde()) {
				minHoyde = bs.hoyde();
			}

			if (maksHoyde < bs.hoyde()) {
				maksHoyde = bs.hoyde();
			}

			gjennomsnitt = gjennomsnitt + bs.hoyde();
		}
		
		System.out.println("Antall noder: " + antall);
		
		System.out.println("Minste høyde: " + minHoyde);
		
		System.out.println("Største høyde: " + maksHoyde);

		System.out.println("Gjennomsnitt: " + gjennomsnitt / antallBSTre);

	}

}
