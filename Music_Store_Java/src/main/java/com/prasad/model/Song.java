package com.prasad.model;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.prasad.database.DatabaseClass;

@XmlRootElement
public class Song {
	private long song_id;
	private String song_name;
	private String song_genre;
	private double song_time;
	private double song_price;
	private  long song_artist_id;
	private  long song_album_id;
	private static Map<Long, Album> albums= DatabaseClass.getAlbums();
	private static Map<Long, Artist> artists= DatabaseClass.getArtists();
	
	public Song(){
		
	}

	
	public Song(long song_id, String song_name, String song_genre, double song_time, double song_price,
			long song_artist_id, long song_album_id) {
		super();
		
		if(!albums.containsKey(song_album_id)){
			song_album_id=albums.size()+1;
		}
		
		if(!artists.containsKey(song_artist_id)){
			song_artist_id=artists.size()+1;
		}
		this.song_id = song_id;
		this.song_name = song_name;
		this.song_genre = song_genre;
		this.song_time = song_time;
		this.song_price = song_price;
		this.song_artist_id = song_artist_id;
		this.song_album_id = song_album_id;
	}


	public long getSong_id() {
		return song_id;
	}

	public void setSong_id(long song_id) {
		this.song_id = song_id;
	}

	public String getSong_name() {
		return song_name;
	}

	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public String getSong_genre() {
		return song_genre;
	}

	public void setSong_genre(String song_genre) {
		this.song_genre = song_genre;
	}

	public double getSong_time() {
		return song_time;
	}

	public void setSong_time(double song_time) {
		this.song_time = song_time;
	}

	public double getSong_price() {
		return song_price;
	}

	public void setSong_price(double song_price) {
		this.song_price = song_price;
	}

	public long getSong_artist_id() {
		return song_artist_id;
	}

	public void setSong_artist_id(long song_artist_id) {
		this.song_artist_id = song_artist_id;
	}

	public long getSong_album_id() {
		return song_album_id;
	}

	public void setSong_album_id(long song_album_id) {
		this.song_album_id = song_album_id;
	}
	
	
	


}
