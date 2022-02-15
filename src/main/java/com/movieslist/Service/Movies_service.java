package com.movieslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.movieslist.model.Movies;
import com.movieslist.repo.repo;

@Service
@Component
public class Movies_service implements servicerepo{

	@Autowired
	private repo servicerepo;

	//To adding data
	public Movies adddetails(Movies movies) {
		try {
			Movies adding = servicerepo.save(movies);
			return adding;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("Error occured in saving data",e.getMessage());
		}
		return null;
	}

	//Get details
	public List<Movies> getdetails() {
		return servicerepo.findAll();
	}

	//Getting details by ID
	public Movies getbyid(int getI) {
		return servicerepo.findById(getI).get();
	}

	//Deleting details by ID
	public void deletebyid(int getL) {
		servicerepo.deleteById(getL);
	}

	
}
