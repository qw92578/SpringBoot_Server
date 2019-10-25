package free.fgq.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/index")
	public String index() {
		System.out.println("进入主页");
		return "aaa";
	}
}
