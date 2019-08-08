package com.techchefs.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.common.EmpConstant;

@Controller
@RequestMapping("/validator")
@PropertySource(EmpConstant.PROP_FILENAME)
public class ValidateController {
	
	
	@GetMapping("/validate/{url1}/{url2}")
	public String validateSessionGet(@PathVariable String url1,@PathVariable String url2,HttpSession ses,ModelMap map ,@Value("${msg}") String msg) {
		if(ses.isNew())
		{
			map.addAttribute("msg", msg);
			ses.invalidate();
			return EmpConstant.VIEW_LOGIN_PAGE;
		}
		//return url;
		return "forward:/"+url1+"/"+url2;
		}
	
	
//		@GetMapping("/validate")
//		public String validateSessionGet1(HttpServletRequest req,ModelMap map ,@RequestParam String url) {
//			if(req.getSession(false)==null)
//			{
//				map.addAttribute("msg", "Please Login First");
//				return"loginForm";
//			}
//			return url;
//			}
	
	
	@PostMapping("/validate")
	public String validateSessionPost(@PathVariable String url1,@PathVariable String url2,
			HttpSession ses, ModelMap map,
			/* @RequestParam String url, */@Value("${msg}") String msg) {
		return validateSessionGet(url1, url2, ses, map, msg);
	}

}
