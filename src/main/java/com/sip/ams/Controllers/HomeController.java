package com.sip.ams.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("home")
public class HomeController {
	
	
	
	@GetMapping("info")
	public String info(Model model)
	{
		String formation = "FullStack";
		model.addAttribute("forYo",formation);
		
		ArrayList<String> listes = new ArrayList<String>(); // Create an ArrayList object
		listes.add("OCP");
		listes.add("OCA");
		listes.add("Spring");
		listes.add("Angular");
		model.addAttribute("listes",listes);
		return "home/info";
	}
	
	@GetMapping("affiche")
	public String affiche()
	{
		return "home/affiche";
	}
	
}
