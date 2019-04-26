package com.example.demo.controller;
import com.example.demo.Entity.User;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchUserController {
	
	@GetMapping("/UIatm")
	public String PageUIatm(Model model) {
		System.out.println("Go to page UIatm.jsp");
		return "UIatm";
	}
	
	@RequestMapping(params = "save", method = RequestMethod.POST)
	public String saveUser(HttpServletRequest request, Model model, @RequestParam("money") String money) {
	    System.out.println("::::::::::::After click btn confrim from UIatm::::::");
	    System.out.println("Money from input == : "+money);
	    User atm = new User();
	    int Intmoney = Integer.parseInt(money);
	    int check = Intmoney%100;
	    System.out.println("check mod :: == "+check);
	    if(check != 0) {
	    	model.addAttribute("atm", atm);
	    	model.addAttribute("checkinput", "Input is Invalid");
	    	return "UIatm";
	    }
	    else {
	    	 while (true) {
	 			if(Intmoney >= 1000) {
	 				Intmoney = atm.Processb1000(Intmoney);
	 			}
	 			else if(Intmoney >= 500) {
	 				Intmoney = atm.Processb500(Intmoney);
	 			}
	 			else if(Intmoney >= 100) {
	 				Intmoney = atm.Processb100(Intmoney);
	 			}
	 			else {
	 				model.addAttribute("atm", atm);
	 				model.addAttribute("checkinput", "Input is Valid");
	 				return "UIatm";
	 			}
	 		}
	    }
	   
	}	
}