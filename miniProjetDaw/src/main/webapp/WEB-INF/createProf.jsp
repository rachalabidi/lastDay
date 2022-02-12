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
<title>Admin|Creation des comptes</title>
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
            <div class="singup-form">
                <div class="sign-up-html">
                     <form id="myForm" method="post" action="accounts"> <!--//U NEED SOME CHANG -->
                        <div class="group O">
                            <!-- <label for="user" class="label leftk ">First name</label> -->
                           
                            <input id="user" name="nom" type="text" class="input left" placeholder="write ur First name" required >
                         <!-- </div>
                        <div class="group O TWO"> -->
                            <!-- <label for="user1" class="label  rightk">Last name</label> -->
                            <input id="user1" name="prenom" type="text" class="input right" placeholder="write ur Last name" required >
                          
                        </div>
                       
                        <div class="group">
                            <label for="birthday" class="label">Module</label>
                            <input id="birthday" type="text" class="input" name="module"  placeholder=" enter the module if a teacher "required >
                        </div>
                        <div class="group">
                        <label for="s" class="label">User type</label>
                         <input type="radio" name="Gender" class="BA3adhaLESS"  value="admin"  />
                          <label class="bayda" >Admin</label>
                         
                          <input type="radio" name="Gender" class="BA3adhaLESS"   value="prof" />
                         <label class="bayda" >Enseignant</label> 
                        </div>
                        <div class="group">
                            <label for="num" class="label">Phone number</label>
                            <input id="num" type="tel" class="input" name="num" placeholder="write ur Phone number" pattern="(?:\(\d{3}\)|\d{3})[- ]?\d{3}[- ]?\d{4}" required >
                            <span class="focus-border" id="numFocus"></span>
                        </div>    
                        <div class="group">
                            <label for="Email" class="label">Email</label>
                            <input id="Email" type="email" class="input" name="email" placeholder="write ur Email" required >
                        </div>
    
                        <div class="group">
                            <label for="pass" class="label">Password</label>
                            <input id="pass" name="pass" type="password" class="input" data-type="password" placeholder="write ur Password" required onkeyup='check();' >
                        </div>
                        <BUTTON type="submit" class="button"  value="Create Account"> Create Account </BUTTON>
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