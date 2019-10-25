package free.fgq.demo.controller;

import free.fgq.demo.common.BaseCommonResult;
import free.fgq.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	IndexService indexService;

	@GetMapping("/index")
	public String index() {
		System.out.println("进入主页");
		return "aaa";
	}

	@GetMapping("/test")
	public BaseCommonResult test() {
		return indexService.test();
	}
}
