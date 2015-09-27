package com.jpm.process;

import com.jpm.data.DataManipulator;
import com.jpm.data.StockData;

public class StockProcess {

	public void createStock(String stock_symbol, String type,
			int last_dividend, int fixed_dividend, int par_value, int price) {
		StockData stockData = new StockData();
		stockData.setStockSymbol(stock_symbol);
		stockData.setPrice(price);
		stockData.setFixedDividend(fixed_dividend);
		stockData.setLastDividend(last_dividend);
		stockData.setParvalue(par_value);
		stockData.setType(type);
		DataManipulator dataManipulator = new DataManipulator();
		dataManipulator.stockCollection.put(stock_symbol, stockData);
	}

}
