<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Shop List page</title>
</head>
<body>
<center>
    <h1>Shop List page</h1>
    <table style="text-align: center;" border="1px" cellpadding="5" cellspacing="0">
        <thead>
        <tr>
            <th width="70px">Shop Id</th>
            <th width="150px">Company</th>
            <th width="25px">Employees</th>
            <th width="150px">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="shop" items="${shopList}">
            <tr>
                <td>${shop.id}</td>
                <td>${shop.name}</td>
                <td>${shop.employees}</td>
                <td>
                    <a style="padding-right: 5px;" href="${pageContext.request.contextPath}/shop/edit/${shop.id}.html">Edit</a>
                    <a href="${pageContext.request.contextPath}/shop/delete/${shop.id}.html">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br/>
    <h3><a href="${pageContext.request.contextPath}/">Home page</a></h3>
</center>
</body>
</html>