<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.dao.MemberDAO, member.bean.MemberDTO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
${param.su }
<c:if test="${param.su==0}">
이미 존재하는 아이디입니다.
<a href='loginFail.jsp'>로그인</a>
</c:if>
<c:if test="${param.su!=0}">
가능!!!
<a href='loginOk.jsp'>로그인</a>

</c:if>
</body>
</html>