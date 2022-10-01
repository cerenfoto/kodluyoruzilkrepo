import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double paraTutari;
		double kdvliTutar = 0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Para tutarını giriniz: ");
		paraTutari = scanner.nextDouble();

		if (0 < paraTutari && paraTutari <= 1000) {
			kdvliTutar = paraTutari + (paraTutari * 0.18);

		} else if (paraTutari > 1000) {

			kdvliTutar = paraTutari + (paraTutari * 0.08);

		} else
			System.out.println("Para tutarınız hatalıdır.");

		System.out.println("KDV'li tutarınız: " + kdvliTutar);

	}

}
