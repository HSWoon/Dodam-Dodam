<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>${user.id } ����</title>
	</head>
	<body>
		<ul>
			<li>���̵� : ${user.id }</li>
			<li>�̸� : ${user.name }</li>
			<li>���� : ${user.gender }</li>
			<li>��й�ȣ : ${user.password }</li>
		</ul>
		
		<div>
			<a href="/${user.seq }/edit">����</a>
			<form action="/delete" method="POST">
				<input name="seq" type="hidden" value="${user.seq }"/>
				<button type="submit">����</button>
			</form>
		</div>
	</body>
</html>