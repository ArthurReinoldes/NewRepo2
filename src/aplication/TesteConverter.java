package aplication;

import entities.CurrencyConverter;

public class TesteConverter {

	public static void main(String[] args) {
		
		CurrencyConverter converter = new CurrencyConverter();
		
		converter.Price = 3.10;
		converter.Amount = 200.00;
		converter.Conversion();
	}

}
