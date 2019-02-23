<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login Page</title>
		
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
        
         <!-- Custom CSS -->
         <link rel="stylesheet" href="<c:url value="/css/startmin.css"/>">
         
         <!-- Custom Fonts -->
         <link rel="stylesheet" href="<c:url value="/css/font-awesome.min.css"/>">
         
          <link rel="stylesheet" href="<c:url value="/css/mycss.css"/>">
        
    </head>
    
    <body>

        <div id="wrapper">
                  
                <div class="container-fluid">
                
                    <div class="row">
                    
                        <div class="col-lg-12">
                            <br>
                            
                            <div class="row">
                              <a class="col-sm-2" href="#">
                              <img id="logo" src="<c:url value='/images/logo-dark.png'/>"  alt="logo" />
                              </a>
                              <i id="fb" class="fa fa-facebook-square col-sm-offset-9"></i>
                              <i id="in" class="fa fa-linkedin-square"></i>
                              <i id="tw" class="fa fa-twitter-square"></i>
                            </div>
                            
                            <hr>
                                   
                            <h2 class="text-center">Sign in</h2>
                             <br>
                             
                             <font color="red">${message}</font>  
                              
                            <form:form id="loginForm" method="post" action="login" modelAttribute="loginBean" class="form-horizontal">
                                
                              <div class="form-group">
                              <form:label path="username" class="control-label col-sm-2 col-sm-offset-3">Username:</form:label>
                                  <div class="col-sm-4">
                                  <form:input id="username" name="username" path="" class="form-control"/><br>
      							</div>
                              </div>
                              <div class="form-group">
                              <form:label path="password" class="control-label col-sm-2 col-sm-offset-3">Password:</form:label>
                                  <div class="col-sm-4">
                                    <form:password id="password" name="password" path="" class="form-control"/><br>
                                  </div>
                              </div>
                              <div class="form-group">
                                   <div class="col-sm-1 col-sm-offset-8">
                                    <input type="submit" class="btn btn-block btn-primary btn-lg" value="Submit" />
                                  </div>
                              </div>
    
                            </form:form>
                            
                            </div>
                        <!-- /.col-lg-12 -->
                        
                    </div>
                    
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
        
        </div>
        <!-- /#wrapper -->
              
    </body>
</html>
