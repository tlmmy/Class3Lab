<%-- 
    Document   : welcomeResponse
    Created on : Sep 7, 2016, 12:33:07 PM
    Author     : Tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Response</title>
    </head>
    <body>
        <h1>Welcome Response</h1>
        <%
            Object obj = request.getAttribute("message");
            String msg = "Unknown";
            if(obj != null){
                msg = obj.toString();
            }
            out.println("<p>" + msg + "</p>");
           
          %>
          
          <a href='index.jsp'>Home</a>
    </body>
</html>
