package main;

import controller.SelectTiket;
import view.RegisterTiket;

public class Main {
	public static void main(String[] args) {
		RegisterTiket registerTiket = new RegisterTiket();
		SelectTiket selectTiket = new SelectTiket(registerTiket.jenisTiket(), registerTiket.inputData());
		selectTiket.data.hitungBiayaTiket();
	}
}
