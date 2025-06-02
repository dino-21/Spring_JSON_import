<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>미세먼지 측정 데이터</title></head>
<body>
<h2>김해시 미세먼지 측정 정보</h2>
<table border="1">
  <tr>
    <th>장소</th>
    <th>PM10</th>
    <th>PM2.5</th>
    <th>시간</th>
  </tr>
  <c:forEach var="item" items="${dustList}">
    <tr>
      <td>${item.name}</td>
      <td>${item.pm10_after}</td>
      <td>${item.pm25_after}</td>
      <td>${item.timestamp}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
