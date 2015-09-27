package com.jpm.process;

import java.util.Iterator;
import java.util.Map;

import com.jpm.data.DataManipulator;
import com.jpm.data.StockData;
import com.jpm.data.TradeStock;

public class GeomentricMean {
	public double calculateMean() {
		StockData stock = new StockData();
		float price = 1;
		float count = 0;
		DataManipulator dataManipulator = new DataManipulator();
		Iterator i = dataManipulator.stockCollection.entrySet().iterator();
		while (i.hasNext()) {

			Map.Entry stockDetail = (Map.Entry) i.next();
			stock = (StockData) stockDetail.getValue();
			price = price * stock.getPrice();
			count = count + 1;
			//System.out.println("price" + stock.getPrice());
		}
		float power=1/count;
		//System.out.println("hi"+power);
		double gm = Math.pow(price,power);
		
		//System.out.println("price" + price);
		//System.out.println(count);
		return gm;
	}
}
