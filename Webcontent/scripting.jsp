<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting</title>
</head>
<body>
<h1>Below Output is ALL about scripting</h1>

<%!
int i=340;
public int m1()
{
	return 340;
}
public String m2()
{
	return "palle";
}
%>
<% 
int i=m1();
String s=m2();
out.println(i);
out.print(s);
%>
</body>
</html>