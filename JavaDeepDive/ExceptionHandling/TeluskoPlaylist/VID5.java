package TeluskoPlaylist;

import java.util.Scanner;

public class VID5 {

	public static void main(String[] args) {
		
		try {
			int j = 3, k = 0;
			int i = j / k;
			System.out.println("BYE");
		} catch (ArithmeticException ae) {
			System.out.println("Inside ArithmeticException ");
			System.out.println(" sorry you " + ae.getMessage());
			System.out.println("BYE");// redundant code , and its not good so its better to use finally block
		} catch (Exception e) {

		}

		try {
			int j = 2, k = 0;
			int i = j / k;

		} catch (ArithmeticException ae) {
			System.out.println(" sorry you " + ae.getMessage());
		} catch (Exception e) {

		} finally {// this block get executed no matter wether u catch catches exception or not
			
			// this is useful to close streams and readers , like suppose you opened a
			// stream and some exception occured so after catching error you have to close
			// the stream in order to save memory of user
			System.out.println("Inside finally");
			System.out.println("BYE");
		}
		

	}

}
