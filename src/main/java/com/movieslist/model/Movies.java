package com.movieslist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="movies_details",schema = "public")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String Movie_Name;
	String Language;
	String Actor_Name;
	String Review;
	String Description;
	String Duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovie_Name() {
		return Movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getActor_Name() {
		return Actor_Name;
	}
	public void setActor_Name(String actor_Name) {
		Actor_Name = actor_Name;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	
					
}
