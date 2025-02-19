package com.mybanking.service;

import java.util.List;

import com.mybanking.entity.Employee;

public interface BankingServiceInterface {

	String createProfileService(Employee emp);

	List<Employee> getallEmployeeRecordService();

	String editRecordService();

}
