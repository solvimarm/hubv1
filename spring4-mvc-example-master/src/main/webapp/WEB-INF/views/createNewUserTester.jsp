<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>create new user</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css">         
		<script src="../js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<body>
				<form method="POST" role="form">
					<div class="form-group">
						<label for="name">Type your Name</label>
						<input type="text" class="form-control" name="name"/>
					</div>
					<div class="form-group">
						<label for="password">Type the password</label>
						<input type="text" class="form-control" name="password"/>
					</div>
					<div class="form-group">
						<label for="username">Type the username</label>
						<input type="text" class="form-control" name="username"/>
					</div>
					<div class="form-group">
						<label for="age">Type the age</label>
						<input type="text" class="form-control" name="age"/>
					</div>
					<div class="form-group">
						<label for="goal">Type the goal</label>
						<input type="text" class="form-control" name="goal"/>
					</div>
					<div class="form-group">
						<label for="gender">Type the gender</label>
						<input type="text" class="form-control" name="gender"/>
					</div>
					<div class="form-group">
						<label for="weight">Type the weight</label>
						<input type="text" class="form-control" name="weight"/>
					</div>
					<div class="form-group">
						<label for="nextUpdate">Type the nextUpdate</label>
						<input type="text" class="form-control" name="nextUpdate"/>
					</div>
					<input type="submit" name="button" value="Submit"/>
				</form>
	</body>
</html>