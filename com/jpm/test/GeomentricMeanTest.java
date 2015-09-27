package com.jpm.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;
import com.jpm.process.GeomentricMean;
public class GeomentricMeanTest {

	@Test
	public void test() {
		CreateStockTest test = new CreateStockTest();
		String expected_result = "9.47";
		test.createStock();
		GeomentricMean mean = new GeomentricMean();
		double gm = mean.calculateMean();
		System.out.println("Geomentric mean is" + " " + gm);
		DecimalFormat df = new DecimalFormat("###.##");
		
		
		if(df.format(gm).equals(expected_result))
		{
			
			assert true;
	
		}
		
		assert false;
	}

}
