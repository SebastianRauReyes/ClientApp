package com.clienteapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.clienteapp.model.Customer;
import com.clienteapp.services.CustomerService;




@Controller
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/admin/menu")
	public String menu() {

		return "/admin/menu";
	}

		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
		// LIST
		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
	@GetMapping("/admin/emp/list")
	public String list(@ModelAttribute("SpringWeb") Customer customer, ModelMap model) {

		try {
			model.addAttribute("employees", customerService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/emp/list";
	}
	
		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
		// UPDATE
		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
	
	@GetMapping("/admin/emp/{action}/{employee_id}")
	public ModelAndView form(@PathVariable String action, @PathVariable int customer_id, ModelMap model) {

		// action = {"editform","deleteform"}
		logger.info("action = " + action);
		ModelAndView modelAndView = null;

		try {
			Customer customer = customerService.find(customer_id);
			logger.info(customer.toString());
			modelAndView = new ModelAndView("admin/emp/" + action, "command", customer);
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("admin/emp/" + action, "command", new Customer());
		}

		return modelAndView;
	}
	
	@PostMapping("/admin/emp/editsave")
	public ModelAndView editsave(@ModelAttribute("SpringWeb") Customer customer, ModelMap model) {

		
		logger.info("Customer = " + customer);
		
		ModelAndView modelAndView = null;

		try {
			customerService.update(customer.getCustomer_id(), customer.getCompany_name() , customer.getContact_name(),
					customer.getContact_tittle(), customer.getAddress(), customer.getCity());

			modelAndView = new ModelAndView("redirect:/admin/emp/list");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("redirect:/admin/emp/list");
		}

		return modelAndView;
	}
		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
		// CREATE
		//-----------------------------------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------------------------------
	
	@GetMapping("/admin/emp/createform")
	public String formCreate() {
		return "/admin/emp/createform";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView createform(Customer customer, ModelMap model) {
			
		ModelAndView modelAndView = null;

		try {
			customerService.create(customer.getCompany_name(), customer.getContact_name(), 
					customer.getContact_tittle(), customer.getAddress(), customer.getCity());

			modelAndView = new ModelAndView("redirect:/");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			modelAndView = new ModelAndView("redirect:/");
		}

		return modelAndView;
	}
	
	
	
	
	

}
