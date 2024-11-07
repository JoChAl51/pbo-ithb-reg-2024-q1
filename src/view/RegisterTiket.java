package view;

import controller.SelectTiket;
import modul.classes.Ekonomi;

import java.util.Scanner;

public class RegisterTiket {
	Scanner scan = new Scanner(System.in);

	int jenisTiket;
	int[] inputData;

	public RegisterTiket() {
		jenisTiket = jenisTiket();
		inputData = inputData();
	}
	
	public int jenisTiket() {
		System.out.println("1. Ekonomi");
		System.out.println("2. Bisnis");
		System.out.println("3. First Class");
		System.out.print("Pilih Jenis Tiket: ");
		return Integer.parseInt(scan.nextLine());
	}

	public int[] inputData() {
		System.out.print("Jarak Tempuh (KM): ");
		int jarak = Integer.parseInt(scan.next());
		System.out.print("Berat Bagasi (KG): ");
		int berat = Integer.parseInt(scan.next());
		return new int[]{jarak, berat};
	}
}
