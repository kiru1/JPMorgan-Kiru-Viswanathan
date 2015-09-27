package com.jpm.process;

import java.util.Date;

import com.jpm.data.DataManipulator;
import com.jpm.data.TradeStock;

public class TradeCreation {
	public void createTrade(String stockSymbol, Date date, int quantity,
			String indicator, int price) {
		String traderef = "tradenum";
		TradeStock tradeStock = new TradeStock();
		tradeStock.setStockSymbol(stockSymbol);
		tradeStock.setTimestamp(date);
		tradeStock.setQuantity(quantity);
		tradeStock.setIndicator(indicator);
		tradeStock.setPrice(price);
		DataManipulator dataManipulator = new DataManipulator();
		traderef = traderef + dataManipulator.tradeCollection.size();
		tradeStock.setTradeRef(traderef);
		dataManipulator.tradeCollection.put(traderef, tradeStock);
		System.out.println(traderef);

	}

}
