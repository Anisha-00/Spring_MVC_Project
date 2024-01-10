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
        			<th>Name</th>
        			<th>Count</th>
        			<th>Code</th>
        			<th>Faculty</th>
        			<th>Created Date</th>
        		</tr>
        		<c:forEach items="${standards}" var="standard" >
        			<c:choose>  
	        			<c:when test = "${standard.faculty == 'RAJU'}">
			        		<tr style="background-color:green;">
			        			<td>${standard.name}</td>
			        			<td>${standard.count}</td>
			        			<td>${standard.code}</td>
			        			<td>${standard.faculty}</td>
			        			<td>${standard.createdDate}</td>
			        		</tr>
		        		</c:when>
		        		<c:otherwise>  
		        			<tr style="background-color:red;">
			        			<td>${standard.name}</td>
			        			<td>${standard.count}</td>
			        			<td>${standard.code}</td>
			        			<td>${standard.faculty}</td>
			        			<td>${standard.createdDate}</td>
			        		</tr>
		        		</c:otherwise>  
		        	</c:choose>  
        		</c:forEach>
        	</table>
        </div>
    </body>
</html>
        		