package io.iot.springapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hay")
	public String sayHi() {
		return "Hey Sviatic";
	}
}
