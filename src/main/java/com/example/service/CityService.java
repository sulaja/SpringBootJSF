package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Repository.CityRepository;
import com.example.entity.City;

@Service
public class CityService implements ICityService {
	@Autowired
	private CityRepository repo;

	/*
	 * public List<City> listall() { return (List<City>) repo.findAll();
	 * 
	 * }
	 */

	@Override
	public List<City> findall() {
		// TODO Auto-generated method stub
		return (List<City>) repo.findAll();
	}

}
