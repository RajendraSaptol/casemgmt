package com.iig.gcp.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iig.gcp.casem.dto.EmployeeDTO;
import com.iig.gcp.casem.service.CaseService;


@Controller
public class CaseController {
	
	@Autowired
	CaseService caseService;
	
	/*@RequestMapping(value = { "/"})
    public ModelAndView submitUser(ModelMap modelMap) {
		return new ModelAndView("casem/AlertHome");
	}*/
	
	@RequestMapping(value = { "/login/dashboard"})
    public ModelAndView submitUser(ModelMap modelMap) {
		return new ModelAndView("casem/AlertHome");
	}
	
	@RequestMapping(value = {"/casem/AlertHome"}, method = RequestMethod.GET)
    public ModelAndView getAlertDetails() throws Exception {
		ArrayList<EmployeeDTO> arrEmployee =caseService.getAlertsDetails();
		for(EmployeeDTO emp: arrEmployee) {
			System.out.println("employee"+emp.getAlertId());
		}
		return new ModelAndView("casem/AlertDetails");
    }
}