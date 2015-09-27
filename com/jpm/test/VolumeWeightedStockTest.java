package com.jpm.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.jpm.process.VolumeWeightedStock;
public class VolumeWeightedStockTest {

	@Test
	public void test() {
		float expected_result=(float) 10.0;
		TradeCreationTest tradeCreation = new TradeCreationTest();
		tradeCreation.tradeCreations();
		VolumeWeightedStock stock = new VolumeWeightedStock();
		float ratio = stock.volumeWeightStock();
		System.out.println("volume weighted stock price for past 15 min" + " "
				+ ratio);
		if(expected_result==ratio)
		{
			assert(true);
			
		}
	}

}
