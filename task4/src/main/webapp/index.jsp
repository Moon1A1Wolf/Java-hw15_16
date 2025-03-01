<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
</head>
<body>
    <h2>Fill out the survey</h2>

    <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color: red;"><%= request.getAttribute("errorMessage") %></p>
    <% } %>

    <form action="survey" method="post">
        <label>Full Name: <input type="text" name="fullName" required pattern="[A-Za-zА-Яа-яЁё\s]+" title="Only letters and spaces are allowed"></label><br><br>
        <label>Phone: <input type="text" name="phone" placeholder="+380XXXXXXXXX" required></label><br><br>
        <label>Email: <input type="email" name="email" required></label><br><br>
        <label>Age: <input type="number" name="age" min="1" max="120" required></label><br><br>
        <label>Gender:</label><br>
        <input type="radio" name="gender" value="male" required> Male<br>
        <input type="radio" name="gender" value="female"> Female<br>
        <input type="radio" name="gender" value="other"> Other<br><br>
        <label><input type="checkbox" name="subscribe"> Subscribe to the newsletter</label><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>

