package com.jpm.data;

public class StockData {
	public String stockSymbol;
	public String type;
	public int lastDividend;
	public  float fixedDividend;
	public int parvalue;
	public int price;
		//stock constants
	public static final String common_stock ="COMMON";
	public static final String preferred_stock ="PREFERRED";
	
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLastDividend() {
		return lastDividend;
	}
	public void setLastDividend(int lastDividend) {
		this.lastDividend = lastDividend;
	}
	public float getFixedDividend() {
		return fixedDividend;
	}
	public void setFixedDividend(float fixedDividend) {
		this.fixedDividend = fixedDividend;
	}
	public int getParvalue() {
		return parvalue;
	}
	public void setParvalue(int parvalue) {
		this.parvalue = parvalue;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
