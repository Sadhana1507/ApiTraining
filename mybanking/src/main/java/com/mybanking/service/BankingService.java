package com.mybanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybanking.dao.BankingDAOInterface;
import com.mybanking.entity.Employee;

@Service
@Transactional

public class BankingService implements BankingServiceInterface{

	
	@Autowired
	private BankingDAOInterface bDao;
	
	@Override
	public String createProfileService(Employee emp) {
		bDao.save(emp);
		return "record created";
	}

	@Override
	public List<Employee> getallEmployeeRecordService() {
		// TODO Auto-generated method stub
		return bDao.findAll();
	}

	@Override
	public String editRecordService() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
