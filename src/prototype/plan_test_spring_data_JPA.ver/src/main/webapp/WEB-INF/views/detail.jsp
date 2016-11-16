<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>${user.id } 정보</title>
	</head>
	<body>
		<ul>
			<li>아이디 : ${user.id }</li>
			<li>이름 : ${user.name }</li>
			<li>성별 : ${user.gender }</li>
			<li>비밀번호 : ${user.password }</li>
		</ul>
		
		<div>
			<a href="/${user.seq }/edit">수정</a>
			<form action="/delete" method="POST">
				<input name="seq" type="hidden" value="${user.seq }"/>
				<button type="submit">삭제</button>
			</form>
		</div>
	</body>
</html>