<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Customer App</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container-fluid">
		<div class="row-fluid">
		<div class="col-md-3"></div>
			<div class="col-md-6">
				<h4 class="text-center">Edit Customer</h4>
				<hr>
				<form:form method="post" action="../editsave">
					<form:hidden path="customer_id" />
					<div class="form-group">
						<label for="company_name">Company Name: </label>
						<form:input path="company_name" class="form-control"/>
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
						<input type="submit" value="Save Changes" class="btn btn-success" />
						<a href="<%=request.getContextPath()%>/admin/emp/list" class="btn btn-danger">Cancel</a>
					</div>
				</form:form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>


</body>
</html>