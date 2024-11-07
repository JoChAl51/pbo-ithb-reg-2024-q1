package modul.classes;

public abstract class Tiket {
	int jarakTempuh;
	int beratBagasi;

	public Tiket(int jarakTempuh, int beratBagasi) {
		this.jarakTempuh = jarakTempuh;
		this.beratBagasi = beratBagasi;
	}

	public abstract int hitungBiayaTiket();

	public int getJarakTempuh() {
		return jarakTempuh;
	}

	public void setJarakTempuh(int jarakTempuh) {
		this.jarakTempuh = jarakTempuh;
	}

	public int getBeratBagasi() {
		return beratBagasi;
	}

	public void setBeratBagasi(int beratBagasi) {
		this.beratBagasi = beratBagasi;
	}
}
