<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Liesbeth Spring customer mvc</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .error{color:red}
    </style>
</head>
<body>

<div class="container">
    <h1>Liesbeth Spring mvc: customer registration</h1>

    <form:form action="processForm" modelAttribute="customer" method="get">
        First name*: <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error" />
        <br><br>
        lastName name *: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error" />
        <br><br>
        Free passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error" />
        <br><br>
        Postal Code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error" />
        <br><br>
        Course Code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error" />
        <br><br>

        <input type="submit" value="Submit"/>
    </form:form>
</div>

</body>
</html>
