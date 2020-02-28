package aplication;
import java.util.*;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		rec.Height = sc.nextDouble();
		rec.Width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rec.Area());
		System.out.printf("PERIMETER = %.2f%n", rec.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.Diagonal());
	
	}

}
