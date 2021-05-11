package com.cts.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.bean.ExchangeValue;
import com.cts.demo.repo.ICurrencyRepository;

@RestController
public class CurrencyController {
	
	@Autowired
	private ICurrencyRepository rep;
	@Autowired
	private Environment env;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeVale(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ev=rep.findByFromAndTo(from, to);
		ev.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ev;
	}

}
