package level1_programs;

import java.util.Scanner;

/*
 * Write a program which calculates marks on basis of given grades in java using switch statement
 * if Grade A then  marks >=80
 * if Grade B then marks >=60 and less than 80
 * if Grade C then marks >=40 and less than 60
 * if Grade F then marks <=40
 * if any other grade is passed then print invalid grade
 */
public class GradeProgramUsingSwitchStatementExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter grade from (A, B, C or F) : ");

		String str = scanner.next();
		char grade = str.charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Grade A - marks >=80");
			break;

		case 'B':
			System.out.println("Grade B - marks >=60");
			break;

		case 'C':
			System.out.println("Grade C - marks >=40");
			break;

		case 'F':
			System.out.println("Grade F - marks <40 FAIL");
			break;

		default: // optional
			System.out.println("Invalid Grade");
			break; // optional
		}
	}
}
