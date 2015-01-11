package org.acme.refactoring.replacetempquery;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReplaceTempWithQueryTest {

	@Test
	public void shouldPriceIsBasePerDiscount() {
		ReplaceTempWithQuery calculatePrice = new ReplaceTempWithQuery();
		assertEquals(2375, calculatePrice.getPrice(), 0);
	}

}
