package com.gth.foodshare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gth.foodshare.model.Mall;
import com.gth.foodshare.service.MallService;
import com.gth.foodshare.service.UserService;
import com.gth.foodshare.util.SearchUtils;

@Controller
public class MyController {

	@Autowired
	private MallService mallService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/bootstrapTest", method = RequestMethod.GET)
	public String bootstrapTest() {
		return "index";
	}
	
	@RequestMapping(value = "/getAllMalls", method = RequestMethod.GET)
	@ResponseBody
	public List<Mall> getAllMalls() {
		return mallService.findAll();
	}

	@RequestMapping(value = "/checkUser", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkUser(HttpServletRequest request, Model model,
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		return userService.checkUser(username, password);
	}

	@RequestMapping(value = "/searchMall", method = RequestMethod.GET)
	@ResponseBody
	public List<Mall> searchMall(HttpServletRequest request, Model model,
			@RequestParam(value = "key", required = true) String key) {
		return SearchUtils.addResultSpan(mallService.findAll(), key);
	}
}
