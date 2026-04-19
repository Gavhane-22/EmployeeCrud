<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<h2>Employee List</h2>

<table border="1">
<tr>
<th>ID</th><th>Name</th><th>Email</th><th>Salary</th><th>Action</th>
</tr>

<c:forEach var="e" items="${list}">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>
<td>${e.salary}</td>
<td>
<a href="edit/${e.id}">Edit</a>
<a href="delete/${e.id}">Delete</a>
</td>
</tr>
</c:forEach>
</table>

<a href="add">Add New</a>