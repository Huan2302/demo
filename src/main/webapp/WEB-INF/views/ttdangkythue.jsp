<%--
  Created by IntelliJ IDEA.
  User: nals_macbook_284
  Date: 28/12/2022
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .error {
        color: #ff0000;
    }

    .errorblock {
        color: #000;
        background-color: #ffEEEE;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
    }
</style>

<body>
<s:form method="POST" modelAttribute="dangKyThue" action="${pageContext.request.contextPath}/dang-ky">
    <table>
        <tr>
            <td><s:label path = "maDK">Mã:</s:label></td>
            <td><s:input path = "maDK" /></td>
            <td><s:errors path = "maDK" cssClass = "error" /></td>
        </tr>
        <tr>
            <td><s:label path = "tenKH">Tên khách hàng:</s:label></td>
            <td><s:input path = "tenKH" /></td>
            <td><s:errors path = "tenKH" cssClass = "error" /></td>
        </tr>
        <tr>
            <td><s:label path = "soDienThoai">Số điện thoại:</s:label></td>
            <td><s:input path = "soDienThoai" /></td>
            <td><s:errors path = "soDienThoai" cssClass = "error" /></td>
        </tr>
        <tr>
            <td><form:label path = "loaiSan.maLoaiSan">Loại Sân:</form:label></td>
            <td>
                <s:select path="loaiSan.maLoaiSan" class="custom-select" id="inputGroupSelect01">
                    <c:forEach items="${loaiSan}" var="san">
                        <s:option value="${san.maLoaiSan}">${san.tenLoaiSan}</s:option>
                    </c:forEach>
                </s:select>
            </td>
            <td><form:errors path = "soDienThoai" cssClass = "error" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</s:form>
</form>
</body>
</html>

