package manavKasaProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armutKF = 2.14, elmaKF = 3.67, muzKF = 0.95, domatesKF = 1.11, patlicanKF = 5.00, toplamUcret = 0, kilo;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kaç kilo armut aldınız: ");
		kilo = scanner.nextDouble();
		toplamUcret = toplamUcret + (armutKF * kilo);

		System.out.println("Kaç kilo elma aldınız: ");
		kilo = scanner.nextDouble();
		toplamUcret = toplamUcret + (elmaKF * kilo);

		System.out.println("Kaç kilo domates aldınız: ");
		kilo = scanner.nextDouble();
		toplamUcret = toplamUcret + (domatesKF * kilo);

		System.out.println("Kaç kilo muz aldınız: ");
		kilo = scanner.nextDouble();
		toplamUcret = toplamUcret + (muzKF * kilo);

		System.out.println("Kaç kilo patlıcan aldınız: ");
		kilo = scanner.nextDouble();
		toplamUcret = toplamUcret + (patlicanKF * kilo);

		System.out.println("Ödemeniz gereken tutar: " + toplamUcret);

	}

}
