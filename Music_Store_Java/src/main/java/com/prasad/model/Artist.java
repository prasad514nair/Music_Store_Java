package com.prasad.model;

import java.util.Date;

public class Artist {
	private long artist_id;
	private String artist_name;
	private String artist_birthdate;
	
	public Artist(){
		
	}
	
	public Artist(long artist_id, String artist_name, String artist_birthdate) {
		super();
		this.artist_id = artist_id;
		this.artist_name = artist_name;
		this.artist_birthdate = artist_birthdate;
	}

	public long getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(long artist_id) {
		this.artist_id = artist_id;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public String getArtist_birthdate() {
		return artist_birthdate;
	}

	public void setArtist_birthdate(String artist_birthdate) {
		this.artist_birthdate = artist_birthdate;
	}
	
	
}
