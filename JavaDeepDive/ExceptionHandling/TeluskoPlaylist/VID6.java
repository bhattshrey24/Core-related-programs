package TeluskoPlaylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VID6 {
// Try with Resources
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// before java 1.7
		try {
			String s = br.readLine();
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// after java 1.7
		try (BufferedReader brNew = new BufferedReader(new InputStreamReader(System.in))) {
			String s = brNew.readLine();
		} catch (IOException a) {
			//brNew.close();// no need to do this now
		}
	}

}
