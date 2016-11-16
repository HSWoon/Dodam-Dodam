package me.dodam.plan.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.dodam.plan.test.domain.User;
import me.dodam.plan.test.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/list")
	public String list(ModelMap modelMap){
		modelMap.addAttribute("users", service.findAll());
		
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(ModelMap modelMap){
		return "form";
	}
	
	@RequestMapping("/{seq}")
	public String detail(@PathVariable("seq") User user, ModelMap modelMap){
		modelMap.addAttribute("user", user);
		
		return "detail";
	}
	
	@RequestMapping("/{seq}/edit")
	public String edit(@PathVariable("seq") User user, ModelMap modelMap){
		modelMap.addAttribute("user", user);
		
		return "form";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(User user){
		service.save(user);
		
		return "redirect:/list";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Long seq){
		service.delete(seq);
		
		return "redirect:/list";
	}
}
