<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
	<head>
		<title>update user</title>
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
						<label for="username">Type your Name</label>
						<input type="text" class="form-control" name="username"/>
						<label for="age">Type your age</label>
						<input type="text" class="form-control" name="age"/>
						<label for="goal">Type your goal</label>
						<input type="text" class="form-control" name="goal"/>
						<label for="weight">Type your weight</label>
						<input type="text" class="form-control" name="weight"/>
					</div>
					<input type="submit" name="button" value="Submit"/>
				</form>

	</body>
</html>