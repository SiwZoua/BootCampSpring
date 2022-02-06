package com.sip.ams.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@GetMapping("info")
	public String info()
	{
		return "home/info";
	}
	
	@GetMapping("affiche")
	public String affiche()
	{
		return "home/affiche";
	}
	
}
