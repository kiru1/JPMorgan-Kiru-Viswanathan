package com.jpm.process;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.jpm.data.DataManipulator;
import com.jpm.data.TradeStock;

public class VolumeWeightedStock {

	public float volumeWeightStock() {
		DataManipulator dataManipulator = new DataManipulator();
		Calendar curdatetime = Calendar.getInstance();
		curdatetime.add(Calendar.MINUTE, -15);
		Date vwstk_cutoff = curdatetime.getTime();
		TradeStock stock = new TradeStock();
		System.out.println("cutoff time" + vwstk_cutoff);
		Iterator i = dataManipulator.tradeCollection.entrySet().iterator();
		float tq_sum = 0;
		float qty_sum = 0;
		float vol_stk_ratio = 0;
		while (i.hasNext()) {

			Map.Entry trade = (Map.Entry) i.next();
			stock = (TradeStock) trade.getValue();
			System.out.println(stock.getTradeRef() + stock.getTimestamp());
			if (stock.getTimestamp().after(vwstk_cutoff)) {
				System.out.println("includer" + stock.getTradeRef()
						+ stock.getTimestamp());
				tq_sum = tq_sum + (stock.getPrice() * stock.getQuantity());
				qty_sum = qty_sum + stock.getQuantity();
			}

		}
		vol_stk_ratio = tq_sum / qty_sum;
		return vol_stk_ratio;

	}

}
