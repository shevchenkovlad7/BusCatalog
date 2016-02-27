<%--
  Created by IntelliJ IDEA.
  User: vlad
  Date: 17.02.16
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Busses Catalog</title>
</head>
<body>
<div>
    <h1>BussManager</h1>
    <c:if test = "${!empty bussList}">
        <table>
            <tr>
                <th>Name</th>
                <th>Number</th>
                <th>Driver</th>
                <th>Time</th>

            </tr>
            <c:forEach items = "${bussList}" var = "buss">
                <tr>
                    <td>${bus.name}</td>
                    <td>${bus.number}<td>
                    <td>${bus.drive}<td>
                    <td>${bus.time}<td>

                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

</body>
</html>
