package com.veerakumarcse24.recipezoon.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.veerakumarcse24.recipezoon.modal.Greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${app.name}")
    private String appName;

    private static final String template = "Hello %s, welcome to the %s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name, appName));
	}

}