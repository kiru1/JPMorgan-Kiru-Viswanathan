package com.jpm.process;

import com.jpm.data.DataManipulator;
import com.jpm.data.StockData;

public class DividendYield {
	public float calculate(String stock_symbol, int price) {
		float dividendYield = 0;
		DataManipulator dataManipulator = new DataManipulator();
		if (dataManipulator.stockCollection.get(stock_symbol) != null) {
			StockData stockData = dataManipulator.stockCollection
					.get(stock_symbol);
			if (stockData.getType() == stockData.common_stock) {

				dividendYield = stockData.getLastDividend() / price;

			} else if (stockData.getType() == stockData.preferred_stock) {

				dividendYield = ((stockData.getFixedDividend()/100) * stockData.getParvalue())/price;

			} else
				System.out
						.println("wrong stockstype.cannot calculate dividendyield");
		}
		return dividendYield;

	}

}
