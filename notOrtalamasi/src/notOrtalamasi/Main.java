package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int vizeNotu, finalNotu;
		double ortalamasi;

		Scanner scnneer = new Scanner(System.in);

		System.out.println("Lütfen vize notunuzu giriniz: ");
		vizeNotu = scnneer.nextInt();
		System.out.println("Lütfen final notunuzu giriniz: ");
		finalNotu = scnneer.nextInt();

		ortalamasi = (vizeNotu + finalNotu) / 2;

		System.out.println(ortalamasi >= 60 ? "Sınıfı geçti" : "Sınıfta Kaldı");

	}

}
