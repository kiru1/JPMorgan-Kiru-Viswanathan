package com.jpm.test;

import java.util.Iterator;

import com.jpm.data.DataManipulator;
import com.jpm.process.StockProcess;

public class CreateStockTest {

	public void createStock() {
		System.out.println("hi");
		String stock_symbol = "google";
		String type = "PREFERRED";
		int last_dividend = 10;
		int fixed_dividend = 2;
		int par_value = 100;
		int price = 10;
		StockProcess a = new StockProcess();
		a.createStock(stock_symbol, type, last_dividend, fixed_dividend,
				par_value, price);
		stock_symbol = "ibm";
		type = "PREFERRED";
		last_dividend = 10;
		fixed_dividend = 2;
		par_value = 100;
		price = 5;

		a.createStock(stock_symbol, type, last_dividend, fixed_dividend,
				par_value, price);
		stock_symbol = "mic";
		type = "PREFERRED";
		last_dividend = 10;
		fixed_dividend = 2;
		par_value = 100;
		price = 17;
		a.createStock(stock_symbol, type, last_dividend, fixed_dividend,
				par_value, price);
		DataManipulator dataManipulator = new DataManipulator();
		Iterator i = dataManipulator.stockCollection.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}

	}

}