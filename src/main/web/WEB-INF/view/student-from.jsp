<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Liesbeth Spring mvc</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Liesbeth Spring mvc: student registration</h1>

    <form:form action="processForm" modelAttribute="student" method="get">
        First name: <form:input path="firstName"/>
        <br><br>
        lastName name *: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error" />
        <br><br>
        country:
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>

        <br><br>
        Favorite language:

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        <br><br>
        Favorite operating system:

        Linux  <form:checkbox path="operationSystem" value ="Linux" />
        Windows  <form:checkbox path="operationSystem" value ="Windows" />
        Mac OS  <form:checkbox path="operationSystem" value ="Max OS" />

        <input type="submit" value="Submit"/>
    </form:form>
</div>

</body>
</html>
