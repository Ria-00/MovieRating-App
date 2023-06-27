package org.ncu.MovieApp.entity;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private int id;
	private String name;
	private String rating;
	private String review;
	private List<String> rateOptions;
	
	public Movie() {
		rateOptions=new ArrayList<String>();
		rateOptions.add("1");
		rateOptions.add("2");
		rateOptions.add("3");
		rateOptions.add("4");
		rateOptions.add("5");
			
	}
	
	public List<String> getRateOptions() {
		return rateOptions;
	}

	public void setRateOptions(List<String> rateOptions) {
		this.rateOptions = rateOptions;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", Review=" + review + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
