<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-4">
				<h4 class="text-center">Customer Register</h4>
				<hr>
				<form:form method="post" action="/save">
					
					<form:hidden path="customer_id" class="form-control"/>
					
					<div class="form-group">
						<label for="company_name">Company Name: </label>
						<form:input path="company_name" class="form-control" readonly="true" />
					</div>
					<div class="form-group">
						<label for="contact_name">Contact Name: </label>
						<form:input path="contact_name" class="form-control" />
					</div>
					<div class="form-group">
						<label for="contact_tittle">Contact Tittle: </label>
						<form:input path="contact_tittle" class="form-control" />
					</div>
					<div class="form-group">
						<label for="address">Address: </label>
						<form:input path="address" class="form-control" />
					</div>
					<div class="form-group">
						<label for="city">City: </label>
						<form:input path="city" class="form-control" />
					</div>
					<div class="form-group">
						<input type="submit" value="Register" class="btn btn-success" />
					</div>
					
					<a href="<%=request.getContextPath()%>/admin/menu"
					class="btn btn-danger"><i class="glyphicon glyphicon-arrow-left"></i>
					Cancelar</a>
				</form:form>
			</div>
		</div>
	</div>
	

</body>
</html>