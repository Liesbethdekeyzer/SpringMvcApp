<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <title>Liesbeth Spring mvc</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Liesbeth Spring mvc: student confirmation</h1>

    <p>the student firstName ${student.firstName}</p>
    <p>the student lastName  ${student.lastName}</p>
    <p>the student country  ${student.country}</p>
    <p>the student country  ${student.favoriteLanguage}</p>

    <p>operation system </p>
    <ul>
        <c:forEach var="temp" items="${student.operationSystem}" >
            <li> ${temp}</li>
        </c:forEach>
    </ul>



</div>

</body>
</html>
