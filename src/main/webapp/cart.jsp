<%--
  Created by IntelliJ IDEA.
  User: mongo
  Date: 20.12.2022
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <%@ page import="model.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p>
      Наименование: <%= cart.getProduct() %>
    </p>

    <p>
      Колличество: <%= cart.getQuantity() %>
    </p>



</body>
</html>
