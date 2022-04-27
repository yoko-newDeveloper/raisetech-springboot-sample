package jp.co.raisetechspringbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TopController {

//	todo: add service by DI

	@GetMapping
	public String index(Model m) { // Modelを使うとTymeleafのhtml側に値を渡す
		String messageString = "wasshoi";
		m.addAttribute("message", messageString); // "message"という名のmessageStringを渡す
		return "index";

	}

}
