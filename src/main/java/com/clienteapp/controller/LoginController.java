package com.clienteapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.LoginException;
import com.clienteapp.model.Admin;
import com.clienteapp.services.SecurityService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private SecurityService securityService;
	
	
	//----------------------------------------------------------------------------------------------------------------------------
	// Login Admin
	//----------------------------------------------------------------------------------------------------------------------------
		@GetMapping(value={"/", "login"})
		public ModelAndView preLogin() {
			Admin admin = new Admin();
			return new ModelAndView("login", "command", admin);
		}
		
		@PostMapping("/login")
		public ModelAndView login(@ModelAttribute("SpringWeb") Admin admin, ModelMap model) {

			
			logger.info("login()");
			logger.info(admin.toString());

			ModelAndView modelAndView = null;

			try {
				Admin ad = securityService.validate(admin.getAdmin_id(),admin.getPassword_admin());
				logger.info(ad.toString());
				modelAndView = new ModelAndView("redirect:/admin/menu", "command", ad);
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				model.addAttribute("message", "Usuario y/o clave incorrectos");
				modelAndView = new ModelAndView("login", "command", new Admin());
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				model.addAttribute("message", e.getMessage());
				modelAndView = new ModelAndView("login", "command", new Admin());
			}

			return modelAndView;
		}
		
	//----------------------------------------------------------------------------------------------------------------------------
		

}
