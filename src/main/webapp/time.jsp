<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Time</title>
</head>
<body>
    <%
        var now = new java.util.Date().toString();
    %>
    <h1>Current time is <%=now%></h1>
</body>
</html>