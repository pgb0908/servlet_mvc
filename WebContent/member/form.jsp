<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <h3>ȸ������</h3>
    <form action="/ch7/JoinController" method = "post">
        id:<input type="text" name="id" id="id"><br/>
        pwd:<input type="password" name="pwd"><br/>
        name:<input type="text" name="name"><br/>
        email:<input type="text" name="email"><br/>
        <input type="reset" value="���">
        <input type="submit" value="����"> <br/>
    </form>
</body>
</html>