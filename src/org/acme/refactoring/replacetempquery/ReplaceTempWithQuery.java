package org.acme.refactoring.replacetempquery;

/**
 * Martin Fowler, "Refactoring", ch. 6 Composing Methods
 * Replace Temp With Query
 * Versione 0.x, estrazione di discountFactor
 */
public class ReplaceTempWithQuery {
	
	private int _quantity = 5;
	private int _itemPrice = 500;

	public double getPrice() {
		final double discountFactor = discountFactor();
		return basePrice() * discountFactor;
	}

	private double discountFactor() {
		if (basePrice() > 1000) 
			return 0.95;
		return 0.98;
	}

	private int basePrice() {
		return _quantity * _itemPrice;
	}
	
}
