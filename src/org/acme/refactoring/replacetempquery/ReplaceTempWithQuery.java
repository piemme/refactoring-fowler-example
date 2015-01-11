package org.acme.refactoring.replacetempquery;

/**
 * Martin Fowler, "Refactoring", ch. 6 Composing Methods
 * Replace Temp With Query
 * Versione 0.x, replace prima reference di price
 */
public class ReplaceTempWithQuery {
	
	private int _quantity = 5;
	private int _itemPrice = 500;

	public double getPrice() {
		final int basePrice = basePrice();
		final double discountFactor;
		if (basePrice() > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

	private int basePrice() {
		return _quantity * _itemPrice;
	}
	

}
