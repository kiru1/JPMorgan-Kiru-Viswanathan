package com.jpm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jpm.process.ProfitToEarning;
public class ProfitToEarningTest {

	@Test
	public void test() {
		float expected_result= (float)5.0;
		String stock_symbol = "google";
		int price = 2;
		CreateStockTest createStockTest = new CreateStockTest();
		createStockTest.createStock();
		ProfitToEarning ratio = new ProfitToEarning();
		System.out.println("PE Ratio is" + " "
				+ ratio.calculate(stock_symbol, price));
		float result=ratio.calculate(stock_symbol, price);
		if(expected_result == result)
		{
			assert(true);	
		}
	}

}
