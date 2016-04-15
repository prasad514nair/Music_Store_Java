var myApp =angular.module('myApp',['ngRoute']);

myApp.config(function($routeProvider){
	$routeProvider.when('/',{
		controller:'StoreController',
		templateUrl:'views/store.html'
	})
	
	.when('/songs',{
		controller:'StoreController',
		templateUrl:'views/store.html'
	})
	
	.when('/songs/albums',{
		controller:'StoreController',
		templateUrl:'views/albums.html'
	})
	.when('/songs/artists',{
		controller:'StoreController',
		templateUrl:'views/artists.html'
	})
	.when('/songs/details/:id',{
		controller:'StoreController',
		templateUrl:'views/song.html'
	})
	.when('/songs/albums/details/:id',{
		controller:'StoreController',
		templateUrl:'views/songsbyalbum.html'
	})
	.when('/songs/artists/details/:id',{
		controller:'StoreController',
		templateUrl:'views/songsbyartist.html'
	})
	.when('/songs/add',{
		controller:'StoreController',
		templateUrl:'views/addsong.html'
	})
	
	.when('/songs/edit/:id',{
		controller:'StoreController',
		templateUrl:'views/editsong.html'
	})
	.otherwise({
		redirectTo:'/'
	})
});