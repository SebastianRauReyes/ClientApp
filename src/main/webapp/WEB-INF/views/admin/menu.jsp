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
		<div class="col-md-3"></div>
			<div class="col-md-6">
				<h4 class="text-center">Admin Menu</h4>
				<hr>
				<table class="table table-bordered table-striped">
					<tbody>
						<tr>
							<td>
								<a href="<%=request.getContextPath()%>/admin/emp/list"
								class="btn btn-primary btn-block"> Manager Customer</a>
							</td>
							<td>
								<a href="<%=request.getContextPath()%>"
								class="btn btn-danger btn-block">Logout</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</body>

</html>
