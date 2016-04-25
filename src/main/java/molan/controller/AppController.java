package molan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import molan.pojo.IParams;
import molan.pojo.User;

@Controller
public class AppController {

	@RequestMapping("/app")
	public @ResponseBody User showInfo(@RequestBody IParams info) throws Exception {

		User user = new User();
		try {
			user.setAge(info.getAge() + 1);
			user.setUserName(info.getName());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return user;
	}
}
