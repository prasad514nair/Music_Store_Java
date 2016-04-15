package com.prasad.services;

import java.io.Console;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.prasad.database.DatabaseClass;
import com.prasad.model.Album;
import com.prasad.model.Artist;
import com.prasad.model.Song;

public class SongsList {

	private static Map<Long, Song> songs= DatabaseClass.getSongs();
	private static Map<Long, Artist> artists= DatabaseClass.getArtists();
	private static Map<Long, Album> albums= DatabaseClass.getAlbums();
	
	
	public SongsList(){
		songs.put(1L, new Song(1,"name1.mp3","genre1",5.32,5,1,1));
		artists.put(1L, new Artist(1,"artist1","02-23-1988"));
		albums.put(1L, new Album(1,"album1",44));
		songs.put(2L, new Song(2,"name2.mp3","genre2",5.26,7,2,2));
		artists.put(2L, new Artist(2,"artist2","06-2-1986"));
		albums.put(2L, new Album(2,"album2",58));
		
	}
	
	public List<Song> getAllSongs(){
		return new ArrayList<Song>(songs.values());
		
	}
	
	public ArrayList<Album> getAllAlbums(){
		return new ArrayList<Album>(albums.values());
		
	}
	
	public ArrayList<Artist> getAllArtists(){
		return new ArrayList<Artist>(artists.values());
		
	}
	
	public Song addSong(Song song){
		song.setSong_id(songs.size()+1);
		songs.put(song.getSong_id(), song);
		
		return song;
		
	}
	
	public Artist addArtist(Artist artist){
		
		Iterator it = artists.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Artist temp=(Artist) pair.getValue();
	        if(temp.getArtist_name().equals(artist.getArtist_name()))
	        	return temp;
	    }
		artist.setArtist_id(artists.size()+1);
		artists.put(artist.getArtist_id(), artist);
		
		return artist;
		
	}
	

	public Album addAlbum(Album album){
		
		Iterator it = albums.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Album temp=(Album) pair.getValue();
	        if(temp.getAlbum_name().equals(album.getAlbum_name()))
	        	return temp;
	    }
		
		album.setAlbum_id(albums.size()+1);
		albums.put(album.getAlbum_id(), album);
		
		return album;
		
	}
	
	public Song getSong(long id){
		
		return songs.get(id);
		
	}
	public List<Song> getSongbyAlbum(long id){
		ArrayList<Song> result= new ArrayList<Song>();
		
		Iterator it = songs.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Song temp=(Song) pair.getValue();
	        if(temp.getSong_album_id()==id)
	        	result.add(temp);
	    }
		
		
		return result;
		
	}
	public List<Song> getSongbyArtist(long id){
		ArrayList<Song> result= new ArrayList<Song>();
		
		Iterator it = songs.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Song temp=(Song) pair.getValue();
	        if(temp.getSong_artist_id()==id)
	        	result.add(temp);
	    }
		
		
		return result;
		
	}

	public List<Song> getSongsbyArtist(long artist_id){
		
		ArrayList<Song> artist_songs= new ArrayList<Song>();
		Iterator it = songs.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Song temp=(Song) pair.getValue();
	        if(temp.getSong_artist_id()==artist_id){
	        	artist_songs.add(temp);
	        }
	    }
		return artist_songs;
	}
	
	public List<Song> getSongsbyAlbum(long album_id){

		ArrayList<Song> album_songs= new ArrayList<Song>();
		Iterator it = songs.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Song temp=(Song) pair.getValue();
	        if(temp.getSong_album_id()==album_id){
	        	album_songs.add(temp);
	        }
	    }
		return album_songs;
	}
	
	public Song updateSong(Song song){
		if(song.getSong_id()==0){
			return null;
		}
		
		songs.put(song.getSong_id(), song);
		
		return song;
		
	}

	public Song removeSong(long id){
		
		return songs.remove(id);
		
	}
}
