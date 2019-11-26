package free.fgq.demo.controller;

import free.fgq.demo.common.BaseCommonResult;
import free.fgq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/index")
	public String index() {
		System.out.println("进入主页");
		return "aaa";
	}

	/**
	 * 获取用户名
	 * @param id
	 * @return
	 */
	@GetMapping("/getUserInfo")
	public BaseCommonResult getUserInfo(@RequestParam("id") Integer id) {
		return userService.getUserInfo(id);
	}
}
