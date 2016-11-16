<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<c:set var="title" value="${empty user ? '등록' : '수정' }"/>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>회원 ${title }</title>
	</head>
	
	<body>
		<h1>회원 ${title }</h1>
		<form action="/save" method="POST">
			<input name="seq" type="hidden" value="${user.seq }"/>
			<div>
				<label>아이디</label>
				<input name="id" type="text" value="${user.id }"/>
			</div>
			<div>
				<label>이름</label>
				<input name="name" type="text" value="${user.name }"/>
			</div>
			<div>
				<label>비밀번호</label>
				<input name="password" type="text" value="${user.password }"/>
			</div>
			<div>
				<label>남</label>
				<input name="gender" type="radio" value="MALE" <c:if test="${user.gender eq 'MALE' }">checked="checked"</c:if>/>
				<label>여</label>
				<input name="gender" type="radio" value="FEMALE" <c:if test="${user.gender eq 'FEMALE' }">checked="checked"</c:if>/>
			</div>
			<div>
				<label>생일</label>
				<input name="birthDay" type="text" value="${user.birthDay }"/>
			</div>
			
			<button type="submit">${title }</button>
		</form>
	</body>
</html>