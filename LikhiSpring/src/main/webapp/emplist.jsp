<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*,com.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>emplist page</title>
</head>
<body>
<%ArrayList<Employee> alist=(ArrayList<Employee>)request.getAttribute("elist"); %>
   <table id="employeeTable" class="hidden" border="1">
        <thead>
            <tr>
                <th>Employee No</th>
                <th>Department No</th>
                <th>Name</th>
                <th>Job</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
           <%for(Employee e:alist){ %>
           <tr>
           <td><%=e.getEmpno() %></td>
           <td><%=e.getDept() %></td>
           <td><%=e.getEname() %></td>
           <td><%=e.getJob() %></td>
           <td><%=e.getSal() %></td>
           </tr>
           <%} %>
        </tbody>
    </table>
</body>
</html>