<%@page import="People.PersonCollection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person Collection</title>
        
    </head>
    <% PersonCollection pc = (PersonCollection) session.getAttribute("personCollection"); %>
    <body>
        <h1>Person Collection</h1>
        
        <form method="post" action="PeopleServlet" name="myForm">
            <input type="text" name="name"> Name</input><br>
            <input type="text" name="hairColor"> Hair Color</input><br>
            <input type="text" name="eyeColor"> Eye Color</input><br>
            <input type="text" name="height"> Height</input><br>
            <input type="text" name="weight"> Weight</input><br>
            <input type="submit" value="Add Person">
        </form>
        
        <hr>
        
        
        <table>
            <tr>
                <td>Name</td>
                <td>Hair Color</td>
                <td>Eye Color</td>
                <td>Height</td>
                <td>Weight</td>
            </tr>
            <% try {for(int i=0; i < pc.getSize(); i++) {%>
            <tr>
                <td><%= pc.getPerson(i).getName() %></td>
                <td><%= pc.getPerson(i).getHairColor() %></td>
                <td><%= pc.getPerson(i).getEyeColor() %></td>
                <td><%= pc.getPerson(i).getHeight() %></td>
                <td><%= pc.getPerson(i).getWeight() %></td>
                <form method="post" action="PeopleServlet">
                <td><input type="submit" value="delete" name="button"> </td>
                <td><input type="submit" value="edit" name="button"> </td>
                <input type="hidden" name="personNum" value="<%= i %>">
                </form>

            </tr>
            <%}}catch(NullPointerException e ){ }%>
        </table>
        <form method="post" action="PeopleServlet">
            <input type="submit" value="Clear List" name="clearButton">
        </form>
    </body>
</html>
