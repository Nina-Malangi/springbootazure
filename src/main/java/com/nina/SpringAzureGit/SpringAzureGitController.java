package com.nina.SpringAzureGit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringAzureGitController {
	
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessages(){
		return "Hello Azure Git Deployment";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String getAddition(){
		return "Add of 1 + 2 is : "+(1+2);
	}

}
