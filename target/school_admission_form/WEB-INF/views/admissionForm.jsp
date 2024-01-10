<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<body>
	 	<div>
		   <p>
		     <h1>${headerName}</h1>
		   </p>
	    </div>
		<div>
			<form:form method="GET" action="/school_admission_form/submit" modelAttribute="addForm" >
				<table>
				    <tr>
        				<td>Admission Number</td>
        				<td><form:input type="text" path="admissionNo"></form:input></td>
        			</tr>
        			<tr>
        				<td>Name</td>
        				<td><form:input type="text" path="studentName"></form:input><form:errors path="studentName" cssStyle="color:red;"/></td>
        			</tr>
        			<tr>
        				<td>Date of Birth</td>
        				<td><form:input type="text" path="dob"></form:input> <form:errors
							path="dob" cssStyle="color:red;" /></td>
        			</tr>
        			<tr>
        				<td>Father's Name</td>
        				<td><form:input type="text" path="fatherName"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Mother's Name</td>
        				<td><form:input type="text" path="motherName"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Father's Occupation</td>
        				<td><form:input type="text" path="fatherOccupation"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Mother's Occupation</td>
        				<td><form:input type="text" path="motherOccupation"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Address</td>
        				<td><form:input type="text" path="address"></form:input><form:errors
							path="address" cssStyle="color:red;" /> </td>
        			</tr>
        			<tr>
        				<td>ResidencePhone number</td>
        				<td><form:input type="text" path="phoneNumber"></form:input><form:errors
							path="phoneNumber" cssStyle="color:red;" /></td>
        			</tr>
        			<tr>
        				<td>Nationality</td>
        				<td><form:input type="text" path="nationality"></form:input> </td>
        			</tr>
        			<tr>
        				<td>Class Admission For</td>
        				<td><form:input type="text" path="classAdmissionFor"></form:input><form:errors
							path="classAdmissionFor" cssStyle="color:red;" /></td>
					</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="SUBMIT FORM"> </td>
        			</tr>
        		</table>
			</form:form>
		</div>
	</body>
</html>