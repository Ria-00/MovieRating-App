package org.ncu.MovieApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ncu.MovieApp.entity.Movie;

public class DaoImp implements Dao{

	@Override
	public void insert(Movie m) {
		// TODO Auto-generated method stub
		try {
			SqlCon sql=new SqlCon();
			Connection con=sql.getCon();
			PreparedStatement stmt=con.prepareStatement("insert into movies values(?,?,?,?)");  
			stmt.setInt(1,m.getId());//1 specifies the first parameter in the query  
			stmt.setString(2,m.getName());
			stmt.setString(3,m.getRating());
			stmt.setString(4,m.getReview());
			stmt.executeUpdate();  
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			SqlCon sql=new SqlCon();
			Connection con=sql.getCon();
			PreparedStatement stmt=con.prepareStatement("delete from movies where id=?");  
			stmt.setInt(1,id);
			stmt.executeUpdate();  
			
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}

	@Override
	public void update(Movie m) {
		try {
			SqlCon sql=new SqlCon();
			Connection con=sql.getCon();
			PreparedStatement stmt=con.prepareStatement("update movies set id=?,name=?, rate=?,review=? where id=?");  
			stmt.setInt(1,m.getId());//1 specifies the first parameter in the query  
			stmt.setString(2,m.getName());
			stmt.setString(3,m.getRating());
			stmt.setString(4,m.getReview());
			stmt.setInt(5,m.getId());
			stmt.executeUpdate();  
			
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}

	@Override
	public ArrayList<Movie> getMovie(int id) {
		// TODO Auto-generated method stub
		try {
			SqlCon sql=new SqlCon();
			Connection con=sql.getCon();
			PreparedStatement stmt=con.prepareStatement("select *from movies where id=?"); 
			stmt.setInt(1, id);
			ArrayList<Movie> ar=new ArrayList<>();
			Movie m=new Movie();
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				m.setId(rs.getInt(1));			
				m.setName(rs.getString(2));
				m.setRating(rs.getString(3));
				m.setReview(rs.getString(4));
			}
			ar.add(m);
			return ar;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
		
	}

	@Override
	public ArrayList<Movie> getMovies() {
		// TODO Auto-generated method stub
		try {
			SqlCon sql=new SqlCon();
			Connection con=sql.getCon();
			PreparedStatement stmt=con.prepareStatement("select * from movies"); 
			ResultSet rs=stmt.executeQuery();
			ArrayList<Movie> ar=new ArrayList<>();
			while (rs.next()) {
				Movie m=new Movie();
				m.setId(rs.getInt(1));			
				m.setName(rs.getString(2));
				m.setRating(rs.getString(3));
				m.setReview(rs.getString(4));
				ar.add(m);
			}
			return ar;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	

}
