<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:red;text-align:center">Login Page...</h1>
   <span style="color:red;text-align:center">${errMsg}</span>
   <form action="login" method="post">
   <table>
       <tr><td>UserName::</td><td><input type="text" name="uname"></td></tr>
       <tr><td>Password::</td><td><input type="text" name="pwd"></td></tr>
       <tr><td><input type="submit" value="register"></td></tr>
   </table>
   </form>