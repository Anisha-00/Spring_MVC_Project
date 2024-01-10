package com.cnts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cnts.bean.NewStudent;
import com.cnts.service.NewStudentService;

@Controller
public class AdmissionFormController {

	@Autowired
	private NewStudentService service;
	
	@RequestMapping(path = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView formFetch() {
		return new ModelAndView("admissionForm", "addForm", new NewStudent());
	}

	@RequestMapping(path = "/submit", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView createStandard(@Valid @ModelAttribute(name = "addForm") NewStudent newStudent,
			BindingResult bindingResult, ModelMap map) {
		if (bindingResult.hasErrors()) {
			System.out.println("Binding Result Errors: " + bindingResult.getAllErrors());
			return new ModelAndView("admissionForm", "addForm", newStudent);
		}
		else {
			service.save(newStudent);
			return new ModelAndView("submitted");
		}
	}
	
	@RequestMapping
	public ModelAndView fetchAll() {
		return null;
	}
}
