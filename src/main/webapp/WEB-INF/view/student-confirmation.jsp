<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
  <h1>The Student is Confirmed ${student.firstName} ${student.lastName} </h1>
  <h1>The Student is from ${student.country}  </h1>
  <h1>The Student Fav Language is  ${student.favouriteLanguage}  </h1>
  <h1>Operating Systems::</h1>
  <ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp} </li>
    </c:forEach>
  </ul>

</body>
</html>