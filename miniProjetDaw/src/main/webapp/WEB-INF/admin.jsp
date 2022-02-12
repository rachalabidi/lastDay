<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
     <style>
     <%@include file="/WEB-INF/CSS/typing.css"%>
     <%@include file="/WEB-INF/CSS/decouperlapage.css"%>
 
     </style>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/typed.js/2.0.11/typed.min.js" integrity="sha512-BdHyGtczsUoFcEma+MfXc71KJLv/cd+sUsUaYYf2mXpfG/PtBjNXsPo78+rxWjscxUYN2Qr2+DbeGGiJx81ifg==" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin|Home</title>
</head>

<body>


    
<!-- 
<div class="video-bg">
        <video class="video"  width="320" height="240" autoplay loop muted>
           <source src="https://assets.codepen.io/3364143/7btrrd.mp4" type="video/mp4">
      </video>
    </div>  -->
<div class="b">
<div id="entete">
<%@include file="/WEB-INF/header.jsp"%>

</div>

<div id="main">
<div id="menu">
<%@include file="/WEB-INF/mainPage.jsp"%>  
 </div>
 

 <div id="contenu ">
    
  <h2 class="im ">Hello Admin ,U can </h2>
  
  <div class="body">
   <div class="text ">.</div></div>
</div>
</div>
 </div>
 <div class="bk">
 <%@include file="/WEB-INF/bk.jsp"%> 
 </div>
</body>

<script type="text/javascript"> 
var typing=new Typed(".text", {
    strings: ["", "add teachers", " add Students", " delete teachers", " delete Students ", "and much MORE!!","  "],
    typeSpeed: 100,
    backSpeed: 40,
    loop: true,
});
</script>

<script type="text/javascript">
<%@include file="/WEB-INF/animation.js"%></script>
<script src="./animation.JS"></script>
</html>
