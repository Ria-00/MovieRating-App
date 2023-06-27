package org.ncu.MovieApp.Dao;

import java.util.ArrayList;

import org.ncu.MovieApp.entity.Movie;

public interface Dao {

	public void insert(Movie m);
	public void delete(int id);
	public void update(Movie m);
	public ArrayList<Movie> getMovie(int id);
	public ArrayList<Movie> getMovies(); 
	
}
