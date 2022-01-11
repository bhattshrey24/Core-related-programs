package TeluskoPlaylist;

import java.util.Scanner;

public class vid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		try {
			for (int i = 0; i <= 4; i++) {
				a[i] = 5;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inside catch");
			System.out.println(e);
			System.out.println("Max len of array is 4 , you exceeded it");
		}

	}

}
