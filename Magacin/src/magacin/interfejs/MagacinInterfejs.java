package magacin.interfejs;

import java.time.LocalDate;
import java.util.List;

import artikal.KancelarijskiMaterijal;
import artikal.Knjiga;
import artikal.KucnaHemija;


public interface MagacinInterfejs {
	public void dodajKnjigu(String naziv, int sifra, String opis, int kolicina);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public Knjiga pronadjiKnjigu(int sifra);
	
	
	
	public void dodajKancelarijskiMaterijal(String naziv, int sifra, String opis, int kolicina);
	
	public void obrisiKnjigu(KancelarijskiMaterijal km);
	
	public KancelarijskiMaterijal pronadjiKancelarijskiMaterijal(int sifra);
	
	
	
	public void dodajKucnuHemiju(String naziv, int sifra, String opis, int kolicina, LocalDate rokTrajanja);
	
	public void obrisiKucnuHemiju(KucnaHemija kh);
	
	public KucnaHemija pronadjiKucnuHemiju(int sifra);
}
