<%--
  Created by IntelliJ IDEA.
  User: DUNGMAMA
  Date: 3/27/2019
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/converted">
    <label>Rate : </label>
    <input type="text" name="rate" placeholder="rate" value="23000" />
    <label>USD : </label>
    <input type="text" name="usd" placeholder="usd" value="0">
    <input type="submit" name="Converter" value="Converter">
</form>
</body>
</html>
