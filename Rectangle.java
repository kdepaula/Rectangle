/**
 * Katelyn DePaula Period 7
 */
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the length?");
		double length = scan.nextInt();
		System.out.print("What is the width?");
		double width = scan.nextInt();
		double area = length * width;;
		double diagonal = Math.sqrt(length * length + width * width);
		double perimeter = length + length + width + width;
		System.out.println("The area of the rectangle is: " + area);
		System.out.println("The perimeter of the rectangle is: " + perimeter);
		System.out.println("The diagonal length of the rectangle is: " + diagonal);
		
		
		
		
		
	}

}
