package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int km;
		double ucret;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen gideceğiniz mesafeyi KM cinsinden giriniz: ");

		km = scanner.nextInt();
		ucret = 10 + (km * 2.20);

		if (ucret < 20) {
			System.out.println("Ödemeniz gereken minumum tutar 20 liradır.");
		} else {
			System.out.println("Ödemeniz gereken minumum tutar " + ucret + " liradır.");
		}

	}

}
