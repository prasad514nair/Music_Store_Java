package com.prasad.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.prasad.model.Album;
import com.prasad.model.Artist;
import com.prasad.model.Song;


public class SongsListTest {

	private SongsList songsList= new SongsList();

	private Song song =new Song(3,"name3.mp3","genre3",5.32,5,3,3);
	private Artist artist =new Artist(3,"artist3","06-14-1978");
	private Album album= new Album(3,"album4",34);
	
	@Test
	public void testgetAllSongs() {
		
		
		Iterable<Song> songs= songsList.getAllSongs();
		int size=0;
		for(Song s : songs){
			size++;
			
		}
		assertEquals(3,size);
	}

	
	@Test
	public void testgetAllAlbums(){

		songsList.addAlbum(album);
		
		Iterable<Album> albums= songsList.getAllAlbums();
		int size=0;
		for(Album s : albums){
			size++;
			
		}
		assertEquals(3,size);
	}

	
	
	
	@Test
	public void testgetAllArtists(){
		songsList.addArtist(artist);
		Iterable<Artist> artists= songsList.getAllArtists();
		int size=0;
		for(Artist s : artists){
			size++;
			
		}
		assertEquals(3,size);
	}
	
	@Test
	public void testaddSong(){
		
		songsList.addSong(song);
		assertEquals("name3.mp3",songsList.getSong(song.getSong_id()).getSong_name());
	}
	
	@Test
	public void testgetSongbyAlbum(){
		
		
		Iterable<Song> songs= songsList.getAllSongs();
		int size=0;
		for(Song s : songs){
			if(s.getSong_album_id()==1)
				size++;
			
		}
		assertEquals(1,size);
	}

	@Test
	public void testgetSongbyArtist(){
		
		
		Iterable<Song> songs= songsList.getAllSongs();
		int size=0;
		for(Song s : songs){
			if(s.getSong_artist_id()==1)
				size++;
			
		}
		assertEquals(1,size);
	}

	@Test
	public void testremoveSong(){
		
		songsList.removeSong(3);
		Iterable<Song> songs= songsList.getAllSongs();
		int size=0;
		for(Song s : songs){
				size++;
			
		}
		assertEquals(2,size);
	}
	
}
