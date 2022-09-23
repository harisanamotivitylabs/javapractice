package com.motivity.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.motivity.model.Patients;
import com.motivity.service.PatientsService;

@Controller
public class PatientsController {

	private static final Logger logger = Logger
			.getLogger(PatientsController.class);

	public PatientsController() {
		System.out.println("PatientsController()");
	}

	@Autowired
	private PatientsService patientsService;

	@RequestMapping(value = "/")
	public ModelAndView listPatients(ModelAndView model) throws IOException {
		List<Patients> listPatients = patientsService.getAllPatients();
		model.addObject("listPatients", listPatients);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newPatients", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Patients patients = new Patients();
		model.addObject("patients", patients);
		model.setViewName("PatientsForm");
		return model;
	}

	@RequestMapping(value = "/savePatients", method = RequestMethod.POST)
	public ModelAndView savePatients(@ModelAttribute Patients patients) {
		if (patients.getId() == 0) { // if patients id is 0 then creating the
			// patients other updating the employee
			patientsService.addPatients(patients);
		} else {
			patientsService.updatePatients(patients);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deletePatients", method = RequestMethod.GET)
	public ModelAndView deletePatients(HttpServletRequest request) {
		int patientsId = Integer.parseInt(request.getParameter("id"));
		patientsService.deletePatients(patientsId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatients", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int patientsId = Integer.parseInt(request.getParameter("id"));
		Patients patients = patientsService.getPatients(patientsId);
		ModelAndView model = new ModelAndView("PatientsForm");
		model.addObject("patients", patients);

		return model;
	}

}