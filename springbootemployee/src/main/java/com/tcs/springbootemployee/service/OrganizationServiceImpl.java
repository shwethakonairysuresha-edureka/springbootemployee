package com.tcs.springbootemployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootemployee.model.Organization;
import com.tcs.springbootemployee.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	
//	private OrganizationServiceImpl()
//	{
//	}
//	
//	private static OrganizationService dao;
//	
//	public static OrganizationService getInstance()
//	{
//		if(dao == null)
//		{
//			dao = new OrganizationServiceImpl();
//			return dao;
//		}
//		return dao;
//	}
	
//	@Autowired
//	private OrganizationDAO organizationDao;
	
	@Autowired
	OrganizationRepository organizationRepository;

	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try
		{
			organization2 = organizationRepository.save(organization);
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try
		{
			organization2 = organizationRepository.save(organization);
			return "success";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteOrganization(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Organization> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Organization>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
