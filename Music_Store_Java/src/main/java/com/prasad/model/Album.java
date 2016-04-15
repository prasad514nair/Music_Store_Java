package com.prasad.model;

public class Album {

	private long album_id;
	private String album_name;
	private double album_price;
	
	public Album() {
	}
	
	
	public Album(long album_id, String album_name, double album_price) {
		super();
		this.album_id = album_id;
		this.album_name = album_name;
		this.album_price = album_price;
	}


	public long getAlbum_id() {
		return album_id;
	}


	public void setAlbum_id(long album_id) {
		this.album_id = album_id;
	}


	public String getAlbum_name() {
		return album_name;
	}


	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}


	public double getAlbum_price() {
		return album_price;
	}


	public void setAlbum_price(double album_price) {
		this.album_price = album_price;
	}
	
	
}
