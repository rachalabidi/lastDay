


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
  <style>
  <%@include file="/WEB-INF/CSS/buttons.css"%>
  
          
           <%@include file="/WEB-INF/CSS/decouperlapage.css"%>
           
     
     
</style>
<title>GC</title>
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
 <div class="body">
<a href="http://localhost:8676/miniProjetDaw/accountEtud">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
        ADD STUDENT
    </a>
    <a href="http://localhost:8676/miniProjetDaw/accounts">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
           ADD TEACHER
    </a></div>
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