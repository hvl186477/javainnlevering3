package no.hvl.dat100.oppgave4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		Path path = Paths.get(mappe + "/" + filnavn);
		try {
			Files.write(path, samling.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
