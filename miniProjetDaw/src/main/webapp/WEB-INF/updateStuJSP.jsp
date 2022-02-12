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
<title>Admin|UPDATE STUDENT</title>
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
 <h1> UPDATE STUDENT </h1>
 <div class="singup-form">
                <div class="sign-up-html">
                     <form id="myForm" method="post" action="accountEtud"> <!--//U NEED SOME CHANG -->
                        <div class="group O">
                            <!-- <label for="user" class="label leftk ">First name</label> -->
                           
                            <input id="user" name="nom" type="text" class="input left" placeholder="write ur First name" required >
                         <!-- </div>
                        <div class="group O TWO"> -->
                            <!-- <label for="user1" class="label  rightk">Last name</label> -->
                            <input id="user1" name="prenom" type="text" class="input right" placeholder="write ur Last name" required >
                          
                        </div>
                       
                        <div class="group">
                            <label for="birthday" class="label">GROUPE</label>
                            <input id="birthday" type="text" class="input" name="groupe"  placeholder=" enter the module if a teacher "required >
                        </div>
                        
                        <BUTTON type="submit" class="button"  value="Create Account"> SAVE STUDENT INFOS </BUTTON>
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