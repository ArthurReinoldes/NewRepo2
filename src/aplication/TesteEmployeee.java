package aplication;

import java.util.*;
import entities.Employee;

public class TesteEmployeee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double Porcentage;

		Employee func = new Employee();
		Scanner scan = new Scanner(System.in);

		func.Name = "Joao";
		func.GrossSalary = 6000.0;
		func.Tax = 1000.00;

		func.NetSalary();

		System.out.println("Which porcentage to increase salary?");

		Porcentage = scan.nextDouble();

		func.IncreaseSalary(Porcentage);

	}

}
