package SpringWithGradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRest {

	@GetMapping("/hello")
	public String test() {
		return "hello world";
	}
}
