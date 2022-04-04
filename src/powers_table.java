import java.util.Scanner;
import java.lang.Math;

public class powers_table {

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		double NMAX = 3;
		double XMAX;
		
		System.out.println("Enter an integer: ");
		double user_input = scrn.nextDouble();
		XMAX = user_input; 
		
		System.out.println("	Number    Squared    Cubed");
		System.out.println();
		System.out.println("	=======    =======    =====");
		System.out.println();
		
		for (double i = 1; i <= XMAX; i++) {
			for(double j = 1; j <= NMAX; j++)
			System.out.printf("%10.0f",Math.pow(i, j));
			System.out.println();
		}
		
	}

}
