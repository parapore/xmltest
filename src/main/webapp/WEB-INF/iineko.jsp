<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
<!--
   div.ta0 {text-align: left;}
   div.ta1 {text-align: center;}
   div.ta2 {text-align: right;}
   div.ta3 {text-align: justify;}
-->
<link rel="stylesheet" href="iineko.css">
</style>
<title>いいね！！！</title>
</head>
<body>
<div class="ta1">

<a href="/dev.GoodServlet?action=click">
<img src="finger-163689_640.jpg" alt="いいね" width="300" height="200"></a>

<a href="/dev.GoodServlet?action=click">
<img src="2cat-323262_1280.jpg" alt="ねこ" width="300" height="200"></a>
<p><font size="5"><b>いいねこ！：${good.goodCount}</b></font></p>
</div>
</body>
</html>