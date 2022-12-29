<%--
  Created by IntelliJ IDEA.
  User: nals_macbook_284
  Date: 28/12/2022
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>cot 1</th>
        <th>cot 2</th>
    </tr>
    <c:forEach items="${listLoaiSan}" var="loaiSan">
        <tr>
            <td>${loaiSan.tenLoaiSan}</td>
            <td>${loaiSan.giaThue}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
