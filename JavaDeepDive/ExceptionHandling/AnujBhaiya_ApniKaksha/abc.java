package AnujBhaiya_ApniKaksha;

import java.io.BufferedReader;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		abc ob = new abc();

		System.out.println(ob.a(i, j));
	}

	public int a(int i, int j) {
		return b(i, j);
	}

	public int b(int i, int j) {
		int val = 0;
		try {
			val = c(i, j);
			return val;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		} 

	}

	public int c(int i, int j) {// exception not handled here so it checks its parent i.e. b()

		return i / j;

	}

}
