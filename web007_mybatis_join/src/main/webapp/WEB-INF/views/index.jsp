<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>처음 페이지</title>
</head>
<%
	Object obj=request.getAttribute("serverValue");
	String value=(String)obj;
	
%>
<body>
<h3>MyBatis 조인 결과 페이지	<%=value%></h3>
<button onclick="javascript:location.href='./joinController.mybatis'">결과 확인</button>
<!-- 결과 확인 누르면 get으로 갔다가 값 하나 담고 -->
</body>
</html>