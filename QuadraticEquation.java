import java.util.Scanner;

public class QuadraticEquation {

	private static int a, b, c;
	
	public static void main(String[] args) {
		get_a_b_c ();
		solveTheEquation ();
	}

	private static void get_a_b_c() {
	// Read in the values a, b and c.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a value for a: ");
		a = sc.nextInt ();
		System.out.print("Enter a value for b: ");
		b = sc.nextInt ();
		System.out.print("Enter a value for c: ");
		c = sc.nextInt ();
		sc.close ();
	}

	private static void solveTheEquation() {
		// Solve the equation if possible.
		
		System.out.print("\nThe equation " + a + "x\u00B2 + " + b + "x + " + c);
		
		float squareRootPart = (float) (Math.pow(b, 2) - 4 * a * c);
		
		if (squareRootPart < 0 || a == 0)
			System.out.println (" cannot be solved.");
		else {
			float root1 = (float) ((-b + Math.sqrt(squareRootPart))/(2 * a));
			float root2 = (float) ((-b - Math.sqrt(squareRootPart))/(2 * a));
			System.out.printf (" has roots (%1.2f, %1.2f)\n", root1, root2);
		}
	}

}
