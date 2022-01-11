package TeluskoPlaylist;

import java.util.Scanner;

public class Vid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int k = sc.nextInt();
		try {
			int i = j / k;
			System.out.println("the division is "+ i);
		} catch (ArithmeticException ae) {
			System.out.println("inside catch arthematic block");
			System.out.println(ae.getMessage().toString());
		}catch (Exception e) {
			System.out.println("you didnt handled "+e+" Exception ");
		}
		
		System.out.println("BYE");// it gets executed after handling exception if it occurs

	}

}
