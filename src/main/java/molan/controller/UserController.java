package molan.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import molan.pojo.User;
import molan.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(@RequestParam("id") int userId, ModelMap model) {
//		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/showId")
	public String showId(ModelMap model) {
//		int userId = Integer.parseInt(request.getParameter("id"));
		Map<String, String> map = new  HashMap<String, String>();
		map.put("sql", "select * from t_user where userId = 2");
		User user = this.userService.getUserById(map);
		model.addAttribute("user", user);
		return "showUser";
	}
}
