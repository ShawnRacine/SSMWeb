package molan.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import molan.pojo.User;
import molan.service.IUserService;

@Controller
public class LoginController {
	@Resource
	private IUserService userService;

	@RequestMapping("/login")
	public String index(@ModelAttribute("contentModel") User user) {
		return "login/login";
	}

	@RequestMapping("/result")
	public String suc(@ModelAttribute("contentModel") User user, Model model) {
		int id = userService.addUser(user);
		if (id > 0) {
			model.addAttribute("user", user);
			return "showUser";
		} else {
			return "error";
		}

	}

}
