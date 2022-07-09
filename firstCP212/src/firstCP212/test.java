package firstCP212;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter yout first and lastname: ");
		String firstname = scanner.next();
		String lastname = scanner.next();
		System.out.println("Nice to meet you, " + firstname + " " + lastname + ".");

	}

}
