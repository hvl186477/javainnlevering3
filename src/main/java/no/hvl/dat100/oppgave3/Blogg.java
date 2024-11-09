package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int antall;

	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.antall = 0;
	}

	public int getAntall() {
		return antall;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int pos = 0; pos < antall; pos++) {
			if (innleggtabell[pos].erLik(innlegg)) {
				return pos;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		for (int pos = 0; pos < antall; pos++) {
			if (innleggtabell[pos].erLik(innlegg)) {
				return true;
			}
		}

		return false;
	}

	public boolean ledigPlass() {
		return antall < innleggtabell.length;

	}

	public boolean leggTil(Innlegg innlegg) {

		if (finnes(innlegg)) {
			return false;
		}

		if (ledigPlass()) {
			innleggtabell[antall] = innlegg;
			antall++;
			return true;
		}

		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(antall).append("\n");
		
		for (int i = 0; i<antall; i++) {
			sb.append(innleggtabell[i].toString());
		}		
		return sb.toString();
		
	}
}