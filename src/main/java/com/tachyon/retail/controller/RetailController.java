package com.tachyon.retail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetailController {

	@GetMapping("/v1/retail/{retailId}")
	public String getRetail(@PathVariable(value = "retailId") int retailId)
	{
		System.out.println("In Get Retail service retailId::" + retailId);		
		return "Get retail for " + retailId;
	}
	
	@PostMapping("/v1/retail/{retailId}")
	public String postRetail(@PathVariable(value = "retailId") int retailId)
	{
		System.out.println("In Post Retail service retailId::" + retailId);		
		return "Post retail";
	}
	
	@PutMapping("/v1/retail/{retailId}")
	public String putRetail(@PathVariable(value = "retailId") int retailId)
	{
		System.out.println("In Put Retail service retailId::" + retailId);		
		return "Put retail";
	}

}
