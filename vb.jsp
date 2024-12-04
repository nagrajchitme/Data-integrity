
<%@ include file="connect.jsp"%>


<html>
<style type="text/css">
<!--
.style3 {color: #FFFF00; font-weight: bold; }
.style5 {color: #FF0000; font-weight: bold; }
-->
</style>
         <% try 
	{
	String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
      		

	String query="select * from cloudserver  "; 
    Statement st5=connection.createStatement();
    ResultSet rs=st5.executeQuery(query);

	%>
         <h1>
         View Quad<br>
         Merkle Tree Ciphertext Blocks and Keys. <span style="color:#FF00FF"> </span>
	     <table width="855" align="center" border="1" cellpadding="3">
	<tr><td width="155" bgcolor="#FF0000"><span class="style3">File Name</span></td>
	<td width="148" bgcolor="#FF0000"><span class="style3">Owner Name</span></td>
	<td width="106" bgcolor="#FF0000"><span class="style3">Hash-Key1</span></td>
	<td width="106" bgcolor="#FF0000"><span class="style3">Hash-Key2</span></td>
	<td width="106" bgcolor="#FF0000"><span class="style3">Hash-Key3</span></td>
	<td width="106" bgcolor="#FF0000"><span class="style3">Hash-Key4</span></td>
	<td width="54" bgcolor="#FF0000"><span class="style3">SK</span></td>
	</tr>
	<%	
	
	
	while ( rs.next() )
{
s1=rs.getString(1);
s2=rs.getString(2);
s3=rs.getString(5);
s4=rs.getString(7);
s5=rs.getString(9);
s6=rs.getString(11);
s7=rs.getString(12);

	
			
			
			
			%>
		<tr><td><div align="center" class="style5"><%=s1%></div></td><td><div align="center" class="style5"><%=s2%></div></td><td><div align="center" class="style5"><%=s3%></div></td><td><div align="center" class="style5"><%=s4%></div></td><td><div align="center" class="style5"><%=s5%></div></td><td><div align="center" class="style5"><%=s6%></div></td><td><div align="center" class="style5"><%=s7%></div></td></tr>	

 <%

}
	   
%>
</table>
<%
         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
            e.printStackTrace();
          }
%>
</html>