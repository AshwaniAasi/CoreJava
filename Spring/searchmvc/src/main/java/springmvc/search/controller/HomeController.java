package springmvc.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
		
	//handling for request
	@RequestMapping(value = "/welcome")
	public String welcome(@RequestParam("user") String name, Model m){
		m.addAttribute("n", name);
		System.out.println(name);
		return "welcome";
	}
}
