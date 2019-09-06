
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Employees</title>
 <link href="http://localhost:8080/webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="http://localhost:8080/webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="http://localhost:8080/webjars/jquery/3.0.0/js/jquery.min.js" ></script>
</head>
<body>
 <div class="container">
  <spring:url value="/employee/save" var="saveURL" />
  <h2>Employee</h2>
  <form:form modelAttribute="employeeForm" method="post" action="${saveURL }" cssClass="form">
   <form:hidden path="employeeId"/>
   <div class="form-group">
    <lable for="firstName">First Name</lable>
    <form:input path="firstName" cssClass="form-control" id="firstName" />
   </div>
   <div class="form-group">
    <lable for="lastName">Last Name</lable>
    <form:input path="lastName" cssClass="form-control" id="lastName" />
   </div>
   <div class="form-group">
    <lable for="email">Email</lable>
    <form:input path="email" cssClass="form-control" id="email" />
   </div>
   <div class="form-group">
    <lable for="phone">password</lable>
    <form:input path="password" cssClass="form-control" id="password" />
   </div>
   <div class="form-group">
    <lable for="jobTitle">Job Title</lable>
    <form:input path="jobTitle" cssClass="form-control" id="jobTitle" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
 </div>
</body>
</html>
