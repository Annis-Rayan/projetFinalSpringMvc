package projetFinalSpringMvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "prenom", required = false, defaultValue = "world") String prenom,
			Model model) {
		model.addAttribute("prenom", prenom);
		return "hello";
	}

	@RequestMapping("/session")
	public String testSession(HttpSession session) {
		session.setAttribute("test", "un truc en session");
		return "hello";
	}

	@RequestMapping("/recup")
	public String testSession() {
		return "recup";
	}

	
}
