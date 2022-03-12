package magacin.interfejs;

import java.util.List;

import artikal.KancelarijskiMaterijal;
import artikal.Knjiga;
import artikal.KucnaHemija;


public interface MagacinInterfejs {
	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public Knjiga pronadjiKnjigu(int sifra);
	
	
	
	public void dodajKancelarijskiMaterijal(KancelarijskiMaterijal km);
	
	public void obrisiKnjigu(KancelarijskiMaterijal km);
	
	public KancelarijskiMaterijal pronadjiKancelarijskiMaterijal(int sifra);
	
	
	
	public void dodajKucnuHemiju(KucnaHemija kh);
	
	public void obrisiKucnuHemiju(KucnaHemija kh);
	
	public KucnaHemija pronadjiKucnuHemiju(int sifra);
}
