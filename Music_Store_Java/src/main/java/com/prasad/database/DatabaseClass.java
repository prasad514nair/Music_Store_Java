package com.prasad.database;

import java.util.HashMap;
import java.util.Map;

import com.prasad.model.Album;
import com.prasad.model.Artist;
import com.prasad.model.Song;

public class DatabaseClass {
	private static Map<Long, Song> songs= new HashMap();
	private static Map<Long, Album> albums= new HashMap();
	private static Map<Long, Artist> artists= new HashMap();


	public static Map<Long, Song> getSongs() {
		return songs;
	}


	public static Map<Long, Album> getAlbums() {
		return albums;
	}


	public static Map<Long, Artist> getArtists() {
		return artists;
	}



	
}
