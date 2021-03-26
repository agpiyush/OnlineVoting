package com.cg.onlinevotingsystem.electionoffice.service;

import com.cg.onlinevotingsystem.electionoffice.entities.ElectionOfficer;

import java.util.List;

public interface IElectionOfficeService {

   public ElectionOfficer addElectionOfficer(String firstName, String lastName, String password, String gender, String mobileNo, String emailID, String address1 ,String address2, String district);
   public ElectionOfficer updateElectionOfficerDetails(String firstName, String lastName, String password, String gender, String mobileNo, String emailID, String address1 ,String address2, String district);
   public ElectionOfficer deleteElectionOfficer(int officerID);
   public ElectionOfficer viewElectionOfficerByID(int officerID);
   public List<ElectionOfficer> viewElectionOfficersList();

}
