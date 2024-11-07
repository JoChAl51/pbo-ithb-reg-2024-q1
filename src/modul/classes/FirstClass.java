package modul.classes;

import modul.interfaces.BiayaPengiriman;

public class FirstClass extends Tiket implements BiayaPengiriman {
	public FirstClass(int jarakTempuh, int beratBagasi) {
		super(jarakTempuh, beratBagasi);
	}

	@Override
	public int hitungBiayaTiket() {
		return hargaJarak();
	}

	@Override
	public int hargaJarak() {
		return jarakTempuh * 15000;
	}

	@Override
	public int hargaBagasi() {
//		Khusus first class, tidak perlu membayar bagasi
		return 0;
	}
}
