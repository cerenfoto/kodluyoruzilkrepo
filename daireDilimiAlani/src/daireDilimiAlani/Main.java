package daireDilimiAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r;
		double pi = 3.14, aci, alan;
		Scanner scanerr = new Scanner(System.in);
		System.out.println("Lütfen yarıçapı giriniz: ");
		r = scanerr.nextInt();
		System.out.println("Lütfen Merkez Açısının Ölçesünü Giriniz: ");
		aci = scanerr.nextDouble();

		alan = (pi * Math.pow(r, 2) * aci) / 360;
		System.out.println("Hesaplamak istediğiniz daire dilminin alanı: " + alan);

	}

}
