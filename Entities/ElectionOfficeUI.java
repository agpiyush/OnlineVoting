package com.cg.onlinevotingsystem.electionoffice.ui;

import com.cg.onlinevotingsystem.electionoffice.entities.ElectionOfficer;
import com.cg.onlinevotingsystem.electionoffice.service.ElectionOfficeService;
import com.cg.onlinevotingsystem.electionoffice.service.IElectionOfficeService;

@Component
public class ElectionOfficeUI {
	@Autowired
	IElectionOfficeService service;
	
	public void display() {
		ElectionOfficer s1= new ElectionOfficer("Rohit", "Sharma", "xyz","Male","999999999","abc@xyz.com", "123 Mumbai", "456 Mumbai", "Mumbai");
		System.out.println(s1);
		
	}

}
