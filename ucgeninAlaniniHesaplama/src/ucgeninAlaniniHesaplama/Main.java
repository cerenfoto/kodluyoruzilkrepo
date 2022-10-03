package ucgeninAlaniniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kenar1, kenar2, kenar3, cevre;
		double alan;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütlen 1. kenar uzunluğunu giriniz: ");
		kenar1 = scanner.nextInt();
		System.out.println("Lütlen 2. kenar uzunluğunu giriniz: ");
		kenar2 = scanner.nextInt();
		System.out.println("Lütlen 3. kenar uzunluğunu giriniz: ");
		kenar3 = scanner.nextInt();

		cevre = (kenar1 + kenar2 + kenar3) / 2;
		alan = Math.sqrt(cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre - kenar3));
		System.out.println("Üçgenin alanı: " + alan);

	}

}
