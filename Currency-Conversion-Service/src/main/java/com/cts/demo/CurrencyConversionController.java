package com.cts.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	@Autowired
	CurrencyExchangeServiceProxy proxy;
	
	/*@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity ) {
		Map<String,String> m=new HashMap<String ,String>();
		m.put("from", from);
		m.put("to", to);
		ResponseEntity<CurrencyConversionBean> resEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,m);
		CurrencyConversionBean res=resEntity.getBody();
		return new CurrencyConversionBean(from,to,res.getConversionRate(),quantity,quantity.multiply(res.getConversionRate()),res.getPort());
	}*/
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity ) {
		CurrencyConversionBean res=proxy.retriveExchangeValue(from, to);
		return new CurrencyConversionBean(from,to,res.getConversionRate(),quantity,quantity.multiply(res.getConversionRate()),res.getPort());
	}
}
