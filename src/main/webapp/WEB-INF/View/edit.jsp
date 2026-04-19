<h2>Edit Employee</h2>

<form action="${pageContext.request.contextPath}/update" method="post">

    <input type="hidden" name="id" value="${emp.id}"/>

    Name: <input type="text" name="name" value="${emp.name}"/><br>
    Email: <input type="text" name="email" value="${emp.email}"/><br>
    Salary: <input type="text" name="salary" value="${emp.salary}"/><br>

    <input type="submit" value="Update"/>

</form>