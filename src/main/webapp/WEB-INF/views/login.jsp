<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<div class="col-md-4"></div>
			<div class="col-md-4">
				<h4 class="text-center">Admin Login</h4>
				<hr>
				<form:form method="post" action="login">
					<div class="form-group">
						<label for="admin_id">Admin ID: </label>
						<form:input path="admin_id" class="form-control" />
					</div>
					<div class="form-group">
						<label for="password_admin">Password: </label>
						<form:password path="password_admin" class="form-control" />
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn btn-success btn-block" />
					</div>
				</form:form>
				<font color="red">${message}</font>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>
