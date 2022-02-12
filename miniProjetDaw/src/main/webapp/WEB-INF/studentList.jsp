<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
  <style>
  
          
           <%@include file="/WEB-INF/CSS/decouperlapage.css"%>
           <%@include file="/WEB-INF/CSS/listes.css"%>
     
     
</style>
<title>Liste des etudiants</title>
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
  <section>
<div class="table">
    
    <div class="row header rgba ">
    <div class="th">
        id
      </div>
    
      <div class="th">
        nom
      </div>
      <div class="th">
       prenom
      </div>
      <div class="th">
       groupe
      </div>
       <div class="th">
        Supprimer
      </div>
       <div class="th">
       Modifier
      </div>
     
      </div>
     
     
      
  
  
  <c:forEach begin="0" end="${etudList.size()-1}" var="i"  step="1" >  
  <div class="row">
    <div class="th" >
        <c:out value="${etudList[i].id}" />
      </div>
  
      <div class="th" >
        <c:out value="${etudList[i].firstnameEtud}" />
      </div>
      
      <div class="th" >
        <c:out value="${etudList[i].lastnameEtud}" />
      </div>
      <div class="th" >
        <c:out value="${etudList[i].groupe}" />
      </div>
      
     <div class="th" >
      <form action="SuppEtudServlet" method ="post">
      <button  value="${etudList[i].id}" name="didE" onclick="window.location.href='/SuppEtudServlet'">Supprimer</button>
      
      </form>
      </div>
      
      <div class="th" >
      <form action="UpdateStu" method ="post">
      <button  value="${etudList[i].id}" name="didE" onclick="window.location.href='/UpdateStu'">Modifier</button>
      
      </form>
      </div>
     </div>
  </c:forEach>

  
      
    </section>
   </div> 
  </div>

    
    
   <!--   <section> 
                        <div class="tbl-header">
                      
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th class="cell">ID</th>
          <th class="cell">Nom</th>
          <th class="cell">Prenom</th>
          <th class="cell">Modifier</th>
          <th class="cell">Supprimer</th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
       
         
      </tbody>
    </table>
  </div>
</section> 
  -->
 <div class="bk">
 <%@include file="/WEB-INF/bk.jsp"%> 
 </div>


</body>
<script type="text/javascript">
<%@include file="/WEB-INF/animation.js"%></script>
<script src="./animation.JS"></script>
</html>



