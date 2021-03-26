package com.cg.onlinevotingsystem;
import com.cg.onlinevotingsystem.electionoffice.dao.IElectionOfficeRepository;
import com.cg.onlinevotingsystem.electionoffice.entities.ElectionOfficer;
import com.cg.onlinevotingsystem.electionoffice.service.IElectionOfficeService;

@SpringBootTest
public class OnlineVotingSystemElectionOfficeTest {
	@InjectMocks
	IElectionOfficeService service;
	@MockBean
	IElectionOfficeRepository repository;
	
	@Test
	public void addElectionOfficerTest() {
		ElectionOfficer s1= new ElectionOfficer("Rohit", "Sharma", "xyz","Male","999999999","abc@xyz.com", "123 Mumbai", "456 Mumbai", "Mumbai");
		service.addElectionOfficer("Rohit", "Sharma", "xyz","Male","999999999","abc@xyz.com", "123 Mumbai", "456 Mumbai", "Mumbai");
		verify(service,times(1)).addElectionOfficer(s1);
	}
	
	@Test
	public void deleteElectionOfficerTest() {
		ElectionOfficer s1= new ElectionOfficer("Rohit", "Sharma", "xyz","Male","999999999","abc@xyz.com", "123 Mumbai", "456 Mumbai", "Mumbai");
		service.deleteElectionOfficer(1);
		
	}

}
