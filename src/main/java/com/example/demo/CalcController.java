package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	@RequestMapping (method = RequestMethod.GET, value = "/multiply")
	public int multiply(int x, int y) {
        return x * y;
    }
	@RequestMapping (method = RequestMethod.GET, value = "/add")
	public int add(int x, int y) {
        return x + y;
    }
	@RequestMapping (method = RequestMethod.GET, value = "/divide")
	public int divide(int x, int y) {
        return x / y;
    }
}
