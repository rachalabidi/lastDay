<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<style><%@include file="/WEB-INF/CSS/login.css"%>
</style>  

<link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.css"       >
<link href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LogIN</title>
</head>
<body>
      <div class="video-bg">
        <video autoplay loop muted>
      <!--  <source src="" type="video/mp4">-->
          <source src="https://assets.codepen.io/3364143/7btrrd.mp4" type="video/mp4">  
       </video>
    </div>
   <div class="container">
       
		<form name="login"action="myServlet" method="post">
            <h3>Login Here</h3>
			<input type="text" name="username" placeholder="Username" autocomplete="off" required>
            	<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person-fill" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
              </svg>
			<input type="password" name="pass" placeholder="password" autocomplete="off" required>
            <svg xmlns="http://www.w3.org/2000/svg" width="28" height="20" fill="currentColor" class="bi bi-lock-fill" viewBox="0 0 16 16">
                <path d="M8 1a2 2 0 0 1 2 2v4H6V3a2 2 0 0 1 2-2zm3 6V3a3 3 0 0 0-6 0v4a2 2 0 0 0-2 2v5a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2z"/>
              </svg>
			<input type="submit" value="Log In">
		</form>
	</div>


</body>
</html>