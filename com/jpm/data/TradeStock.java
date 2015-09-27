package com.jpm.data;

import java.util.Date;

public class TradeStock {
String tradeRef;
String stockSymbol;
Date timestamp;
int quantity;
String indicator;
int price;
//trade constants
public static final String sell_indicator ="SELL";
public static final String buy_indicator="BUY";
public String getTradeRef() {
	return tradeRef;
}
public void setTradeRef(String tradeRef) {
	this.tradeRef = tradeRef;
}
public String getStockSymbol() {
	return stockSymbol;
}
public void setStockSymbol(String stockSymbol) {
	this.stockSymbol = stockSymbol;
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getIndicator() {
	return indicator;
}
public void setIndicator(String indicator) {
	this.indicator = indicator;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
