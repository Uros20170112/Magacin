package controller;

import java.time.LocalDate;
import java.util.List;

import artikal.KancelarijskiMaterijal;
import artikal.Knjiga;
import artikal.KucnaHemija;

public class Controller {
	List<Knjiga> listaKnjiga = null;
	List<KancelarijskiMaterijal> listaKM = null;
	List<KucnaHemija> listaKH = null;
	
	public void dodajKnjigu(String naziv, int sifra, String opis, int kolicina) {
		Knjiga knjiga = new Knjiga();
		knjiga.setNaziv(naziv);
		knjiga.setSifra(sifra);
		knjiga.setOpis(opis);
		knjiga.setKolicina(kolicina);
		listaKnjiga.add(knjiga);
	}
	
	public void obrisiKnjigu(Knjiga knjiga) throws Exception {
		if(listaKnjiga.contains(knjiga))
			listaKnjiga.remove(knjiga);
		else
			throw new Exception("Ne postoji ta knjiga u listi!");
	}
	
	public Knjiga pronadjiKnjigu(int sifra) throws Exception {
		for(Knjiga k : listaKnjiga) {
			if(k.getSifra() == sifra) {
				return k;
			}
		}
		throw new Exception("U listi ne postoji ta knjiga!");
	}
	
	
	
	public void dodajKancelarijskiMaterijal(String naziv, int sifra, String opis, int kolicina) {
		KancelarijskiMaterijal km = new KancelarijskiMaterijal();
		km.setNaziv(naziv);
		km.setSifra(sifra);
		km.setOpis(opis);
		km.setKolicina(kolicina);
		listaKM.add(km);
	}
	
	public void obrisiKnjigu(KancelarijskiMaterijal km) throws Exception {
		if(listaKM.contains(km))
			listaKM.remove(km);
		else
			throw new Exception("U lisit ne postoji taj kancelarisjki materijal!");
	}
	
	public KancelarijskiMaterijal pronadjiKancelarijskiMaterijal(int sifra) throws Exception {
		for(KancelarijskiMaterijal k : listaKM) {
			if(k.getSifra() == sifra) {
				return k;
			}
		}
		throw new Exception("U listi ne postoji taj kancelarijaki materijal!");
	}
	
	
	
	public void dodajKucnuHemiju(String naziv, int sifra, String opis, int kolicina, LocalDate rokTrajanja) {
		KucnaHemija kh = new KucnaHemija();
		kh.setNaziv(naziv);
		kh.setSifra(sifra);
		kh.setOpis(opis);
		kh.setKolicina(kolicina);
		kh.setRokTrajanja(rokTrajanja);
		listaKH.add(kh);
	}
	
	public void obrisiKucnuHemiju(KucnaHemija kh) throws Exception {
		if(listaKH.contains(kh))
			listaKH.remove(kh);
		else
			throw new Exception("U lisit ne postoji ta kucna hemija!");
	}
	
	public KucnaHemija pronadjiKucnuHemiju(int sifra) throws Exception {
		for(KucnaHemija k : listaKH) {
			if(k.getSifra() == sifra) {
				return k;
			}
		}
		throw new Exception("U listi ne postoji ta kucna hemija!");
	}
}
