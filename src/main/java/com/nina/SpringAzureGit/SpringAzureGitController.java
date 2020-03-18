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

}
