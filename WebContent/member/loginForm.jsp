<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title >로그인</title>
</head>
<body>
<form name ="loginForm" method="post" action="/mvcmember/member/login.do"><!-- 앞에를 /꼭 넣어줘야   -->
<!--form name ="loginForm" method="post" action="http://localhost:8080/memberServlet/login"-->
 <h3>로그인</h3>
 <img src="../image/images.jpeg" width="50" height="50" 
onclick="location.href='../main/index.jsp'" style="cursor: pointer;"><br>
 <table border="1" cellpadding="5" cellspacing="0">
  <tr>
   <td>아이디</td>
   <td><input type="text" name = "id" size="10"></td>
  </tr>
  
  <tr>
   <td>비밀번호</td>
   <td><input type="password" size ="15" name = "pwd"></td>
  </tr>
  
  <tr>
   <td colspan="2" align="center">
    <input type = "button" value="로그인" onclick = "javascript : checkLogin()">
    <!-- input type = "button" value="회원가입" onclick = "javascript : checkWrite()"-->
    <input type = "button" value="회원가입" onclick = "location.href='/mvcmember/member/writeForm.do'">
    </td>
   
  </tr>
  
 </table>
</form>
</body>
 <script type ="text/javascript">
 function checkLogin(){
	 if(document.loginForm.id.value=="") {
		 alert("아이디 입력")
	 }
	 else if(document.loginForm.pwd.value==""){
		 alert("비밀번호 입력")
	 }
	 else document.loginForm.submit();
 }
 function checkWrite(){
	 location.href="http://localhost:8080/memberjsp/member/writeForm.jsp"
 }
 
 </script>
</html>