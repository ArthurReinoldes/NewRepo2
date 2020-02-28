package entities;

public class CurrencyConverter {
	
	public double Price;
	public double Amount;
	public static double Iof = 0.06;
	
	public  void Conversion() {
		double Total = (Price * Amount) + ((Price * Amount) * Iof);
		System.out.printf("Total %.2f", Total);
	}

}
