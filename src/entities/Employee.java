package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public void NetSalary() {
		System.out.printf("Eployee: %s, $ %.2f %n", this.Name, this.GrossSalary - Tax);
	}
	
	public void IncreaseSalary(double porcentage) {
		this.GrossSalary = this.GrossSalary + (GrossSalary * (porcentage / 100));
		System.out.printf("Update data: %s, $ %.2f %n", this.Name, this.GrossSalary - Tax);
	}

}
