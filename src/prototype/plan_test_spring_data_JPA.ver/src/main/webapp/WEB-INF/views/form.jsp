<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<c:set var="title" value="${empty user ? '���' : '����' }"/>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>ȸ�� ${title }</title>
	</head>
	
	<body>
		<h1>ȸ�� ${title }</h1>
		<form action="/save" method="POST">
			<c:if test="${not empty user }">
				<input name="seq" type="hidden" value="${user.seq }"/>
			</c:if>
			<div>
				<label>���̵�</label>
				<input name="id" type="text" value="${user.id }"/>
			</div>
			<div>
				<label>�̸�</label>
				<input name="name" type="text" value="${user.name }"/>
			</div>
			<div>
				<label>��й�ȣ</label>
				<input name="password" type="text" value="${user.password }"/>
			</div>
			<div>
				<label>��</label>
				<input name="gender" type="radio" value="MALE" <c:if test="${user.gender eq 'MALE' }">checked="checked"</c:if>/>
				<label>��</label>
				<input name="gender" type="radio" value="FEMALE" <c:if test="${user.gender eq 'FEMALE' }">checked="checked"</c:if>/>
			</div>
			
			<button type="submit">${title }</button>
		</form>
	</body>
</html>