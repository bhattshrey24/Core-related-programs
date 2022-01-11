package TeluskoPlaylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VID7 {

	public static void main(String[] args) throws NumberFormatException, IOException {// observe we can throw multiple
																						// errors like this , throw
																						// doesnt handles the error but
																						// basically suppress or
																						// delegate them , basically
																						// sort of converts checked
																						// exception to unchecked
																						// exception
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int j = Integer.parseInt(br.readLine());
//		int k = 0;
//		int i = k + j;

		
		
		// My exception
		
		//  Method 1 (by overriding toString
		// method)
		
		try {
			int a = 100 / 10;
			if (a <= 10) {
				throw new MyException();// i made this code forcefully throw error , 
			} else {
				throw new ArithmeticException();
			}

		} catch (MyException e) {// exception class that i made
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println("inside  Arithmetic class");
		} catch (Exception e) {
			// TODO: handle exception
		}

		//Method 2 (by using constructor)
		try {
			int a = 100 / 10;
			if (a <= 10) {
				throw new MyException("Yo this is from constructor");

			} else {
				throw new ArithmeticException();
			}

		} catch (ArithmeticException e) {
			System.out.println("inside  Arithmetic class");
		} 
		catch (MyException e) {// this will also work , without this will also work
		System.out.println(e);
		}

	}

}
