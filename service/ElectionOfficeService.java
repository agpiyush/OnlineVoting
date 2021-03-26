package com.cg.onlinevotingsystem.electionoffice.service;

import java.util.List;

import com.cg.onlinevotingsystem.electionoffice.entities.ElectionOfficer;

public class ElectionOfficeService implements IElectionOfficeService {

	@Override
	public ElectionOfficer addElectionOfficer(String firstName, String lastName, String password, String gender,
			String mobileNo, String emailID, String address1, String address2, String district) {

		return null;
	}

	@Override
	public ElectionOfficer updateElectionOfficerDetails(String firstName, String lastName, String password,
			String gender, String mobileNo, String emailID, String address1, String address2, String district) {

		return null;
	}

	@Override
	public ElectionOfficer deleteElectionOfficer(int officerID) {

		return null;
	}

	@Override
	public ElectionOfficer viewElectionOfficerByID(int officerID) {

		return null;
	}

	@Override
	public List<ElectionOfficer> viewElectionOfficersList() {

		return null;
	}
	

}
