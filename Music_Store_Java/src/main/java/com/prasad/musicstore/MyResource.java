package com.prasad.musicstore;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prasad.model.Album;
import com.prasad.model.Artist;
import com.prasad.model.Song;
import com.prasad.services.SongsList;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/songs")
public class MyResource {

    private SongsList songsList= new SongsList();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Song> getSongs() {
        return songsList.getAllSongs();
    }
    

    @GET
    @Path("/albums")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Album> getAlbums() {
        return songsList.getAllAlbums();
    }
    

    @GET
    @Path("/artists")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Artist> getArtists() {
        return songsList.getAllArtists();
    }
    
    @GET
    @Path("/{songId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Song getSong(@PathParam("songId") long songId) {
    	return songsList.getSong(songId);
    	

    }
   
    @GET
    @Path("/albums/{albumId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Song> getSongbyAlbum(@PathParam("albumId") long albumId) {
    	return songsList.getSongbyAlbum(albumId);
    	

    }
    @GET
    @Path("/artists/{artist}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Song> getSongByArtist(@PathParam("artist") long artist_id) {
    	return songsList.getSongsbyArtist(artist_id);

    }


    @POST
    @Path("/song")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Song addSong(Song song){
    	return songsList.addSong(song);
    }
    @POST
    @Path("/album")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Album addAlbum(Album album){
    	return songsList.addAlbum(album);
    }
    
    @POST
    @Path("/artist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Artist addArtist(Artist artist){
    	return songsList.addArtist(artist);
    }
    
    
    @PUT
    @Path("/song/{songId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Song updateSong(@PathParam("songId") long songId, Song song){
    	song.setSong_id(songId);
    	return songsList.addSong(song);
    }
    
    @DELETE
    @Path("/song/{songId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteSong(@PathParam("songId") long songId){
    	songsList.removeSong(songId);
    }
}
