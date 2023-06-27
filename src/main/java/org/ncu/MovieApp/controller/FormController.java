package org.ncu.MovieApp.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.lang.*;
import org.ncu.MovieApp.Dao.DaoImp;
import org.ncu.MovieApp.entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ncu.MovieApp.service.*;

@Controller
@RequestMapping(value="/movie")
public class FormController {

	@ModelAttribute("movie")
	public Movie getMovieEntity() {
		return new Movie();
	}
	
	@RequestMapping(value="/insert")
	public String insertForm() {
		return "insert-form";
	}
	
	@RequestMapping(value="/insert-process")
	public String insertProcess(@ModelAttribute("movie") Movie m,Model model) {
		try {
			DaoImp d=new DaoImp();
			d.insert(m);
			System.out.println("Inserted Successfully");
			ArrayList<Movie> ar=d.getMovie(m.getId());
			model.addAttribute("list",ar);
			return "display-movie";
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
		
	}
	
	@RequestMapping(value="/delete")
	public String deleteForm() {
		return "delete-form";
	}
	
	@RequestMapping(value="/delete-process")
	public String deleteProcess(@ModelAttribute("movie") Movie m,Model model) {
		try {
			DaoImp d=new DaoImp();
			d.delete(m.getId());
			return "done";
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	@RequestMapping(value="/update")
	public String updateForm() {
		return "update-form";
	}
	
	@RequestMapping(value="/update-process")
	public String updateProcess(@ModelAttribute("movie") Movie m,Model model) {
		try {
			DaoImp d=new DaoImp();
			d.update(m);
			return "done";
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	
	@RequestMapping(value="/view")
	public String viewAll(@ModelAttribute("movie") Movie m,Model model) {
		try {
//			DaoImp d=new DaoImp();
			Service s=new Service();
			ArrayList<Movie> ar=s.sortList();
			model.addAttribute("list",ar);
			return "view";
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
	
	
	
	
	
}
