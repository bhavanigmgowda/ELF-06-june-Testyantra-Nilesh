<%@page import="com.tyss.emp.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
    <% int userid=(Integer)(request.getAttribute("userId"));
      String  password=(String)request.getAttribute("password"); %>
      
       <%-- <% UserBean userBean=(UserBean)(request.getAttribute("userBean")); %> --%>
      

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      
       User ID  = <%=userid %>        <%-- <%=userBean.getUserId() %> --%>
       <br>
       <br>
       Password = <%=password %>     <%-- <%=userBean.getPassword() %> --%>
</body>
</html>