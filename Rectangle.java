/**
 * Katelyn DePaula Period 7
 */
import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the length? ");
		double length = scan.nextDouble();
		scan.nextLine();
		System.out.print("What is the width? ");
		double width = scan.nextDouble();
		double area = length * width;
		double diagonal = Math.sqrt(length * length + width * width);
		double perimeter = length + length + width + width;
		System.out.printf("Area:%21.2f", area);
		System.out.println();
		System.out.printf("Perimeter:%16.2f", perimeter);
		System.out.println();
		System.out.printf("Diagonal Length:%10.2f", diagonal);
		
		
		
	}

}