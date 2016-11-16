<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>회원 목록</title>
	</head>
	
	<body>
		<h1>회원 목록</h1>
		<div>
			<a href="<c:url value="/add"/>">등록</a>
		</div>
		<c:choose>
			<c:when test="${not empty users }">
				<ul>
					<c:forEach var="user" items="${users }">
						<li>
							<a href="/${user.seq }">${user.name }(${user.id })</a>
						</li>
					</c:forEach>
				</ul>
			</c:when>
			<c:otherwise>
				<p>등록된 회원이 없습니다.</p>
			</c:otherwise>
		</c:choose>			
	</body>
</html>