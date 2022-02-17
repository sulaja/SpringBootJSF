package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Repository.CityRepository;
import com.example.entity.City;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JPAUnitTest 
{

	  
	  @Autowired
	  CityRepository cityRepository;
	  @Test
	  public void SaveCity() 
	   {
		  City city = cityRepository.save(new City(null, "manila", 1234));
		 assertThat(city).hasFieldOrPropertyWithValue("id", null);
		 assertThat(city).hasFieldOrPropertyWithValue("name", "manila");
		 assertThat(city).hasFieldOrPropertyWithValue("population", 1234);
	   }
	 

}
