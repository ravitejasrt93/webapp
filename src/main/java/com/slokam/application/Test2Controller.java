package com.slokam.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2Controller {

	@RequestMapping("getData2")
	public @ResponseBody String getData2(){
		return "This is hjbjb from getData2";
	}
}
