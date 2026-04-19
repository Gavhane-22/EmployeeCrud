<%-- index.jsp (Home Page) --%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Management System</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f7;
            text-align: center;
            margin-top: 100px;
        }

        h1 {
            color: #2c3e50;
        }

        .container {
            margin-top: 40px;
        }

        a {
            display: inline-block;
            margin: 15px;
            padding: 12px 25px;
            text-decoration: none;
            background-color: #3498db;
            color: white;
            font-size: 16px;
            border-radius: 5px;
        }

        a:hover {
            background-color: #2980b9;
        }
    </style>
</head>

<body>

<h1>Employee Management System</h1>

<div class="container">

    <!-- Go to Employee List -->
    <a href="list">View Employees</a>

    <!-- Go to Add Employee Form -->
    <a href="add">Add Employee</a>

</div>

</body>
</html>