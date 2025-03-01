<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey Results</title>
</head>
<body>
    <h2>Your Data</h2>
    <p><strong>Full Name:</strong> <%= request.getAttribute("fullName") %></p>
    <p><strong>Phone:</strong> <%= request.getAttribute("phone") %></p>
    <p><strong>Email:</strong> <%= request.getAttribute("email") %></p>
    <p><strong>Age:</strong> <%= request.getAttribute("age") %></p>
    <p><strong>Gender:</strong> <%= request.getAttribute("gender").equals("male") ? "Male" : (request.getAttribute("gender").equals("female") ? "Female" : "Other") %></p>
    <p><strong>Subscription:</strong> <%= "Yes".equals(request.getAttribute("subscribe")) ? "Subscribed" : "Not Subscribed" %></p>

    <br>
    <a href="index.jsp">Fill out the survey again</a>
</body>
</html>
