package com.scap.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	@RequestMapping("irHola")
	public ModelAndView redirection() {
		ModelAndView MV = new ModelAndView("hola","mensaje","Hello World, My name is Spring Framework");
		return MV;
	}
}
