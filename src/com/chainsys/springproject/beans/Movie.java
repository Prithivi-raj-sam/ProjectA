package com.chainsys.springproject.beans;

public class Movie {
	private String tittle;
	public String getTittle() {
		return tittle;
	}
	public String getDirector() {
		return director;
	}
	private String director;
	public Movie(String tittle, String director) {
		this.tittle=tittle;
		this.director=director;
		System.out.println(tittle);
		System.out.println(director);
	}
}
