package net.jisai.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jisai
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "jisai";
	}
}
