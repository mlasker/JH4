<%@page import="People.Person"%>
<%@page import="People.PersonCollection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% 
        PersonCollection pc = (PersonCollection) request.getAttribute("personCollection");
        Person pers;
        Person pers2 = new Person("a","b","c","d","e");
        pc.addPerson(pers2);
    %>
    
    <body>
        <table>
            <tr>
                <td>Name</td>
                <td>Hair Color</td>
                <td>Eye Color</td>
                <td>Height</td>
                <td>Weight</td>
            </tr>
            <% for(int i=0; i < pc.getSize(); i++) {%>
            <tr>
                <td><%= pc.getPerson(i).getName() %></td>
                <td><%= pc.getPerson(i).getHairColor() %></td>
                <td><%= pc.getPerson(i).getEyeColor() %></td>
                <td><%= pc.getPerson(i).getHeight() %></td>
                <td><%= pc.getPerson(i).getWeight() %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
