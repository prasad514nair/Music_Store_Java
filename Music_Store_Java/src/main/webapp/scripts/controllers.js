var myApp= angular.module('myApp');

myApp.controller('StoreController',['$scope','$http','$location','$routeParams',function($scope,$http,$location,$routeParams){
	
	$scope.getSongs=function(){
		$http.get('webapi/songs').success(function(response){
			$scope.songs=response;
		
		});
	}
	
	$scope.getAlbums=function(){
		$http.get('webapi/songs/albums').success(function(response){
			$scope.albums=response;
		
		});
	}
	$scope.getArtists=function(){
		$http.get('webapi/songs/artists').success(function(response){
			$scope.artists=response;
		
		});
	}
	$scope.getSong=function(){
	//	console.log('Books Controller loaded...');
		var id=$routeParams.id;
		$http.get('webapi/songs/'+id).success(function(response){
			$scope.song=response;
		
		});
	}
	
	$scope.getSongsbyAlbum=function(){
		//	console.log('Books Controller loaded...');
			var id=$routeParams.id;
			$http.get('webapi/songs/albums/'+id).success(function(response){
				$scope.songs=response;
			
			});
		}
	$scope.getSongsbyArtist=function(){
		//	console.log('Books Controller loaded...');
			var id=$routeParams.id;
			$http.get('webapi/songs/artists/'+id).success(function(response){
				$scope.songs=response;
			
			});
		}
	
	$scope.addSong=function(){
		
		
		console.log($scope.album);
		$http.post('webapi/songs/album',$scope.album).success(function(response){
			$scope.album=response;
			
			console.log($scope.artist);
			$http.post('webapi/songs/artist',$scope.artist).success(function(response){
				$scope.artist=response;
				
				$scope.song.artist_id=$scope.artist.artist_id;
				$scope.song.album_id=$scope.artist.album_id;
				console.log($scope.song);
				$http.post('webapi/songs/song',$scope.song).success(function(response){
					$scope.song=response;
				
				});
			
			});
		
		});
		
		
	}
	
	$scope.editSong=function(){
		
		var id=$routeParams.id;
		console.log($scope.album);
				console.log($scope.song);
				$http.put('webapi/songs/song'+id,$scope.song).success(function(response){
					$scope.song=response;
				
		});
		
		
	}
	
	
	$scope.removeSong=function(id){
		
				console.log($scope.song);
				
				$http['delete']('webapi/songs/song/'+id).success(function(response){
					window.location.href="#/songs";
				
		});
		
		
	}
}])