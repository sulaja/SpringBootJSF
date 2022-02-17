package com.example.demo;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.Repository.CityRepository;
import com.example.entity.City;

@Controller
@Scope(value = "session")
@Component(value = "citieslist")
@ELBeanName(value = "citieslist")
@Join(path = "/", to = "/city-list.jsf")
//@RequestMapping(path="/demo")
public class CityController {

	@Autowired
	private CityRepository cityrepository;

	private List<City> cities;

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		cities = cityrepository.findAll();
	}

	public List<City> getCities() {
		cities = cityrepository.findAll();
		return cities;
	}

	public String delete(City city) {

		cityrepository.delete(city);
		city = new City();
		return "/city-list.xhtml?faces-redirect=true";
	}
	
	public String update(City city) {

		cityrepository.save(city);
		city = new City();
		return "/city-list.xhtml?faces-redirect=true";
	}
}
