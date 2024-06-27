package beecrownd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		       Scanner scanner = new Scanner(System.in);
		        
		       
		        double A = scanner.nextDouble();
		        double B = scanner.nextDouble();
		        double C = scanner.nextDouble();
		        
		        if (formaTriangulo(A, B, C)) {
		            double perimetro = A + B + C;
		            System.out.printf("Perimetro = %.1f\n", perimetro);
		        } else {
		            double area = ((A + B) * C) / 2.0;
		            System.out.printf("Area = %.1f\n", area);
		        }
		        
		        scanner.close();
		    }
		    
		    public static boolean formaTriangulo(double a, double b, double c) {
		        return a < b + c && b < a + c && c < a + b;
		    }
		}
