package org.acme.refactoring.replacetempquery;

/**
 * Martin Fowler, "Refactoring", ch. 6 Composing Methods
 * Replace Temp With Query
 * 
 * Versione 0.1 (versione iniziale)
 */
public class ReplaceTempWithQuery {
	
	private int _quantity = 5;
	private int _itemPrice = 500;

	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
	

}
