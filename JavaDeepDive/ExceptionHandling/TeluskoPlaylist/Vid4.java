package TeluskoPlaylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Vid4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 2, k = 0, j = 0;
		// unchecked Exception

//		try {
//
//		} catch (Exception e) {
//			System.out.println("EXCEPTIONNNNN UNKOWN");
//		} catch (ArithmeticException e) {// see its givig "compiletime error" cause it will never be executed cause its
//											// written after "Exception" catch which handles all the exception so its
//											// always better to put this "Exception" catch in the end
//
//		}

		try {

		} catch (ArithmeticException ae) {// see now its not giving error

		} catch (Exception e) {

		}

		// Checked exception
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		try {
			a = Integer.parseInt(br.readLine());// we have to put it here cause otherwise it will give "Compiletime Error"
			System.out.println("User entered " + a);
		} catch (IOException io) {

		}catch(NumberFormatException ne) {// cause because you tried to parse String which was not integer like Integer.parseInt("Shrey")
			System.out.println(" YOU HAVE TO ENTER NUMBER U DUMMY");
		}
	}

}
