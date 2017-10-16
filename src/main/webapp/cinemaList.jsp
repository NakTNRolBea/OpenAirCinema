<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1>Unsere Kinos:</h1>

<table>
    <tr>
        <th>Name</th>
        <th>Eröffnungsdatum</th>
        <th>Anzahl Parkplätze</th>
    </tr>
    <s:iterator value="cinemaList">
        <tr>
            <td><s:property value="name"/></td>
            <td><s:property value="openingDate"/></td>
            <td><s:property value="carSpaceCount"/></td>
        </tr>
    </s:iterator>
</table>