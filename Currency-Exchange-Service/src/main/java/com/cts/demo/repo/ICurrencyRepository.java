package com.cts.demo.repo;

import com.cts.demo.bean.ExchangeValue;

public interface ICurrencyRepository {
	public ExchangeValue findByFromAndTo(String from, String to);

}
