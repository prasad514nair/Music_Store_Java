<html ng-app="myApp">
<head>
   <title>MUSICSTORE using AngularJS and RESTful API</title>
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta charset="UTF-8">

        <!-- load bootstrap and fontawesome via CDN -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
        <style>
            html, body, input, select, textarea
            {
                font-size: 1.05em !important;
            }
        </style>
        
        <!-- load angular via CDN -->
        <script src="//code.angularjs.org/1.3.0-rc.2/angular.min.js"></script>
        <script src="//code.angularjs.org/1.3.0-rc.2/angular-route.min.js"></script>
        <script src="//code.angularjs.org/1.3.0-rc.2/angular-resource.min.js"></script>
        <script src="scripts/app.js"></script>
        <script src="scripts/controllers.js"></script>
        
        
</head>

<body>
    <h2>MUSICSTORE using AngularJS and RESTful API</h2>
    
 	<nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">MusicStore</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#/songs/add">Add Song</a></li>
            <li><a href="#/songs/artists">Artists</a></li>
            <li><a href="#/songs/albums">Albums</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container">
    	<div class="row">
    		<div class="col-md-12">
    			<div ng-view></div>
    		</div>
    	</div>
     </div>


    
</body>
</html>
