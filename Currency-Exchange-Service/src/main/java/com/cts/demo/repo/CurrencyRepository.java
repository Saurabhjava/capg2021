package com.cts.demo.repo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.cts.demo.bean.ExchangeValue;

@Repository
public class CurrencyRepository implements ICurrencyRepository {
	static List<ExchangeValue> li;
	static {
		li=new ArrayList<ExchangeValue>();
		li.add(new ExchangeValue(101L, "USD", "INR", new BigDecimal(70)));
		li.add(new ExchangeValue(102L, "EUR", "INR", new BigDecimal(80)));
		li.add(new ExchangeValue(103L, "AUD", "INR", new BigDecimal(40)));
		li.add(new ExchangeValue(104L, "DIN", "INR", new BigDecimal(90)));
	}
	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		for(ExchangeValue e:li) {
			if(e.getFrom().equals(from) && e.getTo().equals(to))
				return e;
		}
		return null;
	}
	

}
