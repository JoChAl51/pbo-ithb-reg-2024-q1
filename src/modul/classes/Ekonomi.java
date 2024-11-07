package modul.classes;

import modul.interfaces.BiayaPengiriman;

public class Ekonomi extends Tiket implements BiayaPengiriman {
	final int PARASUTTAMBAHAN = 5000;

	public Ekonomi(int jarakTempuh, int beratBagasi) {
		super(jarakTempuh, beratBagasi);
	}

	@Override
	public int hitungBiayaTiket() {
		int total = hargaJarak();
		if (beratBagasi > 5) {
			total += hargaBagasi();
		}
		return total;
	}

	@Override
	public int hargaJarak() {
		return jarakTempuh * 7500;
	}

	@Override
	public int hargaBagasi() {
		return beratBagasi * 1500;
	}

	public int parasutTambahan() {
		return PARASUTTAMBAHAN;
	}
}