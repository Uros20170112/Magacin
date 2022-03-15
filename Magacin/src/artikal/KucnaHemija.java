package artikal;

import java.time.LocalDate;

public class KucnaHemija {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	private LocalDate rokTrajanja;
	
	
	
	public KucnaHemija() {
		
	}

	public KucnaHemija(String naziv, int sifra, String opis, int kolicina, LocalDate rokTrajanja) {
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
		this.rokTrajanja = rokTrajanja;
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
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(LocalDate rokTrajanja) {
		if(rokTrajanja == null) {
			throw new NullPointerException("Rok trajanja ne sme da bude null!");
		}
		this.rokTrajanja = rokTrajanja;
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
		KucnaHemija other = (KucnaHemija) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kucna hemija [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina
				+ ", Rok trajanja=" + rokTrajanja + "]";
	}
	
	
}

