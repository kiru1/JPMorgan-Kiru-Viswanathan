package com.jpm.test;

import static org.junit.Assert.*;
import com.jpm.process.DividendYield;

import org.junit.Test;

public class DividendYieldTest {

	@Test
	public void test() {
		String stock_symbol = "google";
		int price = 2;
		
		// prefered stock ((2/100) * 100)/2 = 1
		float expected_result=(float) 1.0;
		CreateStockTest createStockTest = new CreateStockTest();
		createStockTest.createStock();
		DividendYield dividendYield = new DividendYield();		
		if(dividendYield.calculate(stock_symbol, price) == expected_result)
		{
		assert true;
		}
	}

}
