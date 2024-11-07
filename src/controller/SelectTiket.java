package controller;

import modul.classes.Bisnis;
import modul.classes.Ekonomi;
import modul.classes.FirstClass;
import modul.classes.Tiket;
import view.RegisterTiket;

public class SelectTiket {
	public Tiket data;

	public SelectTiket(int jenisTiket, int[] jarakBerat) {
		switch (jenisTiket) {
			case 1:
				data = new Ekonomi(jarakBerat[0], jarakBerat[1]);
				break;
			case 2:
				data = new Bisnis(jarakBerat[0], jarakBerat[1]);
				break;
			case 3:
				data = new FirstClass(jarakBerat[0], jarakBerat[1]);
				break;
			default:
				System.out.println("Input Ulang!");
				System.out.println();
				RegisterTiket registerTiket = new RegisterTiket();
		}
	}
}
