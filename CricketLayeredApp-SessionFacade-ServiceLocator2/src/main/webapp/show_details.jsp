<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:red;text-align:center"> ${param.name } Cricketer Details are.......</h1>
   
   <table border=1>
      <tr>
        <td>id: </td> <td> ${profile.batsmanId}  </td>
       </tr>
       <tr>
        <td>Name: </td> <td> ${profile.fullName}  </td>
       </tr>
       <tr>
        <td>Nation: </td> <td> ${profile.country}  </td>
       </tr>
       <tr>
        <td>Total runs: </td> <td> ${profile.totalRuns}  </td>
       </tr>
       <tr>
        <td>Total Match: </td> <td> ${profile.matcheCount}  </td>
       </tr>
         <tr>
        <td>Total Centuries: </td> <td> ${profile.centuriesCount}  </td>
       </tr>
         <tr>
        <td>Total Half Centuries: </td> <td> ${profile.halfCenturies}  </td>
       </tr>
         <tr>
        <td>Strike Rate: </td> <td> ${profile.strikeRate}  </td>
       </tr>
        <tr>
        <td>Hieghest Score: </td> <td> ${profile.highestScore}  </td>
       </tr>
   </table>
   
   <br><br>
    <a href="find_profile.html">home</a>
   
    