package com.jpm.process;

import com.jpm.data.DataManipulator;
import com.jpm.data.StockData;

public class ProfitToEarning {
	public float calculate(String stock_symbol, int price) {
		float ratio = 0;
		DataManipulator dataManipulator = new DataManipulator();
		StockData stockData = dataManipulator.stockCollection.get(stock_symbol);
		ratio = stockData.getLastDividend() / price;
		return ratio;

	}
}
