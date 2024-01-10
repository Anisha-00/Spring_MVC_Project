<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
   <html>
    <body>	
    	<div>
    		<p>
    			<h1><c:out value="${headerName}" /></h1>
    		</p>
    	</div>
    	<div>
        	<table>
        		<tr>
        		    <th>Id</th>
        		    <th>Admission No</th>
        			<th>Student Name</th>
        			<th>Date Of Birth</th>
        			<th>Father's Name</th>
        			<th>Mother's Name</th>
        			<th>Father's Occupation</th>
        			<th>Mother's Occupation</th>
        			<th>Address</th>
        			<th>Phone Number</th>
        			<th>Nationality</th>
        			<th>Admission for class</th>
        		</tr>
        		<c:forEach items="" var="" >
                 <tr>
                    <td>${standard.name}</td>
                    <td>${standard.count}</td>
                    <td>${standard.code}</td>
                    <td>${standard.faculty}</td>
                    <td>${standard.createdDate}</td>
                 </tr>
        		</c:forEach>
        	</table>
        </div>
    </body>
</html>
        		