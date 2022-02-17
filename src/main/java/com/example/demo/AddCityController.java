package com.example.demo;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


import com.example.Repository.CityRepository;
import com.example.entity.City;

@Controller
@Scope(value = "session")
@Component(value = "addcityController")
@ELBeanName(value = "addcityController")
@Join(path = "/addcity", to = "/addcity-form.jsf")
public class AddCityController 

{
	@Autowired
	private CityRepository cityrepository;
	private City city = new City();
	
	public String save()
	{
		cityrepository.save(city);

		city = new City();
		return "/city-list.xhtml?faces-redirect=true";
	}
	
	public City getcity() {
		return city;
	}
	
}
