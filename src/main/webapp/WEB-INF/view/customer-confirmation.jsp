<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Customer Confirmation</title>
    <style>
        .error{color:red}
    </style>
</head>

<body>

<h1>The customer is confirmed : ${customer.firstName} ${customer.lastName}</h1>
<h1>Number of free PAsses :  ${customer.freePasses} </h1>
<h1>The Postal Code is  :  ${customer.postalCode} </h1>

<h1>The Course Code is  :  ${customer.courseCode} </h1>




</body>
</html>