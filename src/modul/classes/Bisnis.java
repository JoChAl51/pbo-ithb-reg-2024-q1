package modul.classes;

import modul.interfaces.BiayaPengiriman;

public class Bisnis extends Tiket implements BiayaPengiriman {
	public Bisnis(int jarakTempuh, int beratBagasi) {
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
		return jarakTempuh * 10000;
	}

	@Override
	public int hargaBagasi() {
		return beratBagasi * 2500;
	}
}
