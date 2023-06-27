package org.ncu.MovieApp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.ncu.MovieApp.Dao.DaoImp;
import org.ncu.MovieApp.entity.Movie;


public class Service {
	
	public Service() {
	}
	
	public ArrayList<Movie> sortList(){
		DaoImp d=new DaoImp();
		ArrayList<Movie> ar=d.getMovies();
		
		Collections.sort(ar,new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				if ((o1.getRating().compareTo(o2.getRating()))==1) {
					return 1;
				} 
				else {
					return -1;
				}
				
			}
		});
		return ar;
		
		
	}
	
	
}
