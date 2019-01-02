<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 28.12.2018
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <script src="resources/js/bootstrap.min.js"></script>
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-6">
                    <form class="form-horizontal" action="employeeController"
                          method="POST">
                        <fieldset>

                            <!-- Form Name -->
                            <legend>Employee Add</legend>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="name">Name</label>
                                <div class="col-md-4">
                                    <input id="name" name="name" type="text" placeholder=""
                                           class="form-control input-md">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="surname">Surname</label>
                                <div class="col-md-4">
                                    <input id="surname" name="surname" type="text" placeholder=""
                                           class="form-control input-md">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="salary">Salary</label>
                                <div class="col-md-4">
                                    <input id="salary" name="salary" type="text" placeholder=""
                                           class="form-control input-md">

                                </div>
                            </div>

                            <!-- Button -->
                            <div class="form-group">
                                <%--@declare id="add"--%><label class="col-md-4 control-label" for="add"></label>
                                <div class="col-md-4">
                                    <input type="submit" class="btn btn-info"
                                           value="Add Employee">
                                </div>
                            </div>

                        </fieldset>
                    </form>
                </div>
                <div class="col-md-6"></div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <legend>Employee List</legend>
                    <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>Surname</th>
                                <th>Salary</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tbody>


                            <c:forEach items="${allEmployee}" var="employee">
                                <tr>
                                    <td><c:out value="${employee.name}" /></td>
                                    <td><c:out value="${employee.surname}" /></td>
                                    <td><c:out value="${employee.salary}" /></td>
                                    <td><a href="employeeController?employeeId=${employee.id}"
                                           class="btn btn-danger" type="button">Delete</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>

                        </table>
                    </div>
                </div>
                <div class="col-md-6"></div>
            </div>
        </div>
    </div>
</div>

</body>

</html>
