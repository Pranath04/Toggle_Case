package togglecase;

import java.util.Scanner;

public class Togglecase{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String word = scanner.nextLine();
		String s ="";
		scanner.close();
		for(int i=0;i<word.length();i++) {
			s += (char) (word.charAt(i)^(1<<5));
	
		}
		System.out.println(s);
	}
}