<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:red;text-align:center"> ${param.name } Cricketer Details are.......</h1>
   
   <table border=1>
      <tr>
        <td>id: </td> <td> ${profile.cricketerId}  </td>
       </tr>
       <tr>
        <td>Name: </td> <td> ${profile.cricketerName}  </td>
       </tr>
       <tr>
        <td>Nation: </td> <td> ${profile.nation}  </td>
       </tr>
       <tr>
        <td>State: </td> <td> ${profile.state}  </td>
       </tr>
       <tr>
        <td>Total Runs: </td> <td> ${profile.totalRuns}  </td>
       </tr>
         <tr>
        <td>Total Innings: </td> <td> ${profile.totalIninings}  </td>
       </tr>
         <tr>
        <td>Batting Avg: </td> <td> ${profile.battingAvg}  </td>
       </tr>
         <tr>
        <td>Bowling Avg: </td> <td> ${profile.bowlingAvg}  </td>
       </tr>
   </table>
   
   <br><br>
    <a href="find_profile.html">home</a>
   
    