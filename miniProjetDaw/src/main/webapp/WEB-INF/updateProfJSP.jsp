<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <style>
  
  
  <%@include file="/WEB-INF/CSS/decouperlapage.css"%>
   <%@include file="/WEB-INF/CSS/index.css"%>
   
   
     
</style>
<title>Admin|UPDATE TEACHET</title>
</head>
<body>

<div id="entete">
<%@include file="/WEB-INF/header.jsp"%>

</div>

<div id="main">
<div id="menu">
<%@include file="/WEB-INF/mainPage.jsp"%>  
 </div>
 
 <div id="contenu">
 <h1> UPDATE TEACHER </h1>
            <div class="singup-form">
                <div class="sign-up-html">
                     <form name="UpdateProf" action="UpdateProf"  method="post"> <!--//U NEED SOME CHANG -->
                        <div class="group O">
                            <!-- <label for="user" class="label leftk ">First name</label> -->
                           
                            <input id="user" name="nom" type="text" class="input left"placeholder="write ur First name"  value="${ens.nom_prof}" required >
                         <!-- </div>
                        <div class="group O TWO"> -->
                            <!-- <label for="user1" class="label  rightk">Last name</label> -->
                            <input id="user1" name="prenom" type="text" class="input right" placeholder="write ur Last name" value="${ens.prenom_prof}" required >
                          
                        </div>
                       
                        <div class="group">
                            <label for="birthday" class="label">Module</label>
                            <input id="birthday" type="text" class="input" name="module"  placeholder=" enter the module if a teacher "   value="${ens.module }"required >
                        </div>
                        <div class="group">
                            <label for="pass" class="label">Password</label>
                            <input id="pass" name="pass" type="password" class="input" data-type="password" placeholder="write the Password"  value="${ens.pass }" required onkeyup='check();' >
                        </div>
                        <div class="group">
                            <label for="Email" class="label">ID</label>
                            <input id="Email" name="id" type="text" class="input"  placeholder="the id please"  value="${ens.idprof }"  >
                        </div>
                        <BUTTON type="submit" class="button"  value="Create Account"> SAVE </BUTTON>
                         </form>    
                    </div>
                    </div>              
                  </div>
                  </div>
 <div class="bk">
 <%@include file="/WEB-INF/bk.jsp"%> 
 </div>
             
</body>
<script type="text/javascript">
<%@include file="/WEB-INF/animation.js"%></script>
<script src="./animation.JS"></script>
</html>