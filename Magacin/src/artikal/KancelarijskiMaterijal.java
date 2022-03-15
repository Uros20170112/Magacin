package artikal;

public class KancelarijskiMaterijal {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	
	public KancelarijskiMaterijal(String naziv, int sifra, String opis, int kolicina) {
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}
	public KancelarijskiMaterijal() {
		
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) {
			throw new NullPointerException("Naziv ne sme da bude null!");
		}
		if(naziv == "" || naziv == " ") {
			throw new IllegalArgumentException("Naziv ne sme da bude prazan string!");
		}
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 0 ) {
			throw new IllegalArgumentException("Sifra mora biti pozitivan broj!");
		}
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null) {
			throw new NullPointerException("Naziv ne sme da bude null!");
		}
		if(opis.length() < 10) {
			throw new IllegalArgumentException("Opis mora da ima vise od 10 karaktera!");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0) {
			throw new IllegalArgumentException("Kolicina ne sme da bude manja od 0!");
		}
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kancelarijski materijal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina="
				+ kolicina + "]";
	}


	
}
