<%@page import="People.Person"%>
<%@page import="People.PersonCollection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% PersonCollection pc = (PersonCollection) session.getAttribute("personCollection"); 
       int editNum = (Integer) request.getAttribute("editNum");
       Person pers = pc.getPerson(editNum);
    %>
    <body>
        <form method="post" action="PeopleServlet">
            <input type="text" name="name" value="<%=pers.getName()%>"></input>Name<br>
            <input type="text" name="hairColor" value="<%=pers.getHairColor()%>">Hair Color</input><br>
            <input type="text" name="eyeColor" value="<%=pers.getEyeColor()%>">Eye Color</input><br>
            <input type="text" name="height" value="<%=pers.getHeight()%>">Height</input><br>
            <input type="text" name="weight" value="<%=pers.getWeight()%>">Weight</input><br>
            <input type="submit" value="Submit" name="editButton">
            <input type="hidden" name="editNum" value="<%= editNum %>">
        </form>
        <form method="post" action="index.jsp">
            <input type="submit" value="Cancel">
        </form>
    </body>
</html>
