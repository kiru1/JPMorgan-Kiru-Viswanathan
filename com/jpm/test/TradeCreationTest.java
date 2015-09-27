package com.jpm.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.jpm.process.TradeCreation;

public class TradeCreationTest {

	/**
	 * @param args
	 */
	public void tradeCreations() {
		// TODO Auto-generated method stub

		String stockSymbol="google";
		int quantity=10;
		String indicator="BUY";
		int price=10;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		TradeCreation tradeCreation=new TradeCreation();		
		tradeCreation.createTrade(stockSymbol,date,quantity,indicator,price);
		
		 stockSymbol="ibm";
		quantity=5;
		 indicator="BUY";
		 price=13;
		 
		 Calendar curdatetime = Calendar.getInstance();
		 curdatetime.add(Calendar.MINUTE, -15);
		 Date entrydatetime = curdatetime.getTime();
		 
		 tradeCreation.createTrade(stockSymbol,entrydatetime,quantity,indicator,price);
		 
		 
		 stockSymbol="micro";
		 quantity=10;
		indicator="BUY";
		 price=10;
		 curdatetime = Calendar.getInstance();
		 curdatetime.add(Calendar.MINUTE, -5);
		  entrydatetime = curdatetime.getTime();
		  tradeCreation.createTrade(stockSymbol,entrydatetime,quantity,indicator,price);
		
		 
		 stockSymbol="sam";
		 quantity=10;
		indicator="sell";
		 price=10;
		 curdatetime = Calendar.getInstance();
		 curdatetime.add(Calendar.MINUTE, -10);
		  entrydatetime = curdatetime.getTime();
		  tradeCreation.createTrade(stockSymbol,entrydatetime,quantity,indicator,price);
		  
		  stockSymbol="sam";
			 quantity=10;
			indicator="sell";
			 price=10;
			 curdatetime = Calendar.getInstance();
			 curdatetime.add(Calendar.MINUTE, -25);
			  entrydatetime = curdatetime.getTime();
			  tradeCreation.createTrade(stockSymbol,entrydatetime,quantity,indicator,price);
		  
	}
		
	}


