package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	@RequestMapping (method = RequestMethod.GET, value = "/multiply")
	public static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }
	@RequestMapping (method = RequestMethod.GET, value = "/add")
	public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
	@RequestMapping (method = RequestMethod.GET, value = "/divide")
	public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}
