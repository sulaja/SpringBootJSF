package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.example.Repository.CityRepository;
import com.example.entity.City;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrudTask1ApplicationTests {

	@Autowired
	CityRepository cityRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void SaveCity() {
		City city = cityRepository.save(new City(null, "manila", 1234));
		assertThat(city).hasFieldOrPropertyWithValue("id", 13);
		assertThat(city).hasFieldOrPropertyWithValue("name", "manila");
		assertThat(city).hasFieldOrPropertyWithValue("population", 1234);
	}

}
