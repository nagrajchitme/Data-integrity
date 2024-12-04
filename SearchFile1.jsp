<%@ page import="java.util.Date" %>
<%@page import ="java.util.*"%>
<%@page import ="java.sql.*"%>
<%@page import ="java.util.*,java.security.Key,java.util.Random,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,org.bouncycastle.util.encoders.Base64"%>
<%@ page import="java.sql.*,java.util.Random,java.io.PrintStream,java.io.FileOutputStream,java.io.FileInputStream,java.security.DigestInputStream,java.math.BigInteger,java.security.MessageDigest,java.io.BufferedInputStream" %>
<%@ page import ="java.security.Key,java.security.KeyPair,java.security.KeyPairGenerator,javax.crypto.Cipher"%>
<%@page import ="java.util.*,java.text.SimpleDateFormat,java.util.Date,java.io.FileInputStream,java.io.FileOutputStream,java.io.PrintStream"%>
<%@ include file="connect.jsp" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>FILE Request::Data Integrity Audit Scheme Based on Quad Merkle Tree and Blockchain</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-aller.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<style type="text/css">
<!--
.style1 {font-size: 24px}
.style2 {color: #FF0000}
.style3 {font-weight: bold}
-->
</style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
	<div class="logo style1">
        <h3 class="style1 style2">Data Integrity Audit Scheme Based on Quad Merkle Tree and Blockchain</h3>
      </div>
      <div class="menu_nav">
        <ul>
          <li><a href="index.html"><span>Home </span></a></li>
          <li class="active"><a href="usermain.jsp" class="active">User</a> </li>
          <li><a href="auditor.jsp"><span>Blockchain</span></a></li>
          <li><a href="csprovider.jsp">Cloud Service Provider</a></li>
          <li><a href="usermain.jsp"> Logout</a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" width="960" height="320" alt="" /> </a> <a href="#"><img src="images/slide2.jpg" width="960" height="320" alt="" /> </a> <a href="#"><img src="images/slide3.jpg" width="960" height="320" alt="" /> </a> </div>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <h2>Searched File Details  </h2>
          <p>&nbsp;</p>
          <div class="clr"></div>
          <p>&nbsp;</p>
         <table width="605" border="1.5" cellpadding="0" cellspacing="0" align="center">
            <tr>
                <td width="60" height="29" bgcolor="#000000"><div align="center" class="style23 style2 style3 style5">
                  <div align="center"><span class="style24">Id </span></div>
              </div></td>
                <td width="101" bgcolor="#000000"><div align="center" class="style23 style2 style3 style5">
                  <div align="center"><span class="style24">File  Name </span></div>
              </div></td>
                <td width="123" bgcolor="#000000"><div align="center" class="style23 style2 style3 style5">
                  <div align="center"><span class="style24">Owner </span></div>
              </div></td>
              
              
                <%	  
			  
			  
	String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8,s9="",s10,s11,s12,s13;
	int i=0,j=0,k=0;
    String user=(String)application.getAttribute("user");
try 
  {
            String keyword = request.getParameter("keyword");
      		String keys = "ef50a0ef2c3e3a5f";
      		String h1="";
      		String filename="filename.txt";
      		
			
			
      		byte[] keyValue = keys.getBytes();
      		Key key = new SecretKeySpec(keyValue, "AES");
      		Cipher c = Cipher.getInstance("AES");
      		c.init(Cipher.ENCRYPT_MODE, key);
      		//String search = new String(Base64.encode(keyword.getBytes()));
			
			
	
				int found=0,total=0;
				String query4="select * from cloudserver "; 
				Statement st4=connection.createStatement();
				ResultSet rs=st4.executeQuery(query4);
				while ( rs.next() )
				{
					//i=rs.getInt(1);
					String fname=rs.getString(1);
					String owner=rs.getString(2);
					String ct1 =rs.getString(4);
					String ct2 =rs.getString(6);
					String ct3 =rs.getString(8);
					String ct4 =rs.getString(10);

					total=total+1;
					
					
					c.init(Cipher.DECRYPT_MODE,key);
					String decryptedValue1 = new String(Base64.decode(ct1.getBytes()));
					String decryptedValue2 = new String(Base64.decode(ct2.getBytes()));
					String decryptedValue3 = new String(Base64.decode(ct3.getBytes()));
					String decryptedValue4 = new String(Base64.decode(ct4.getBytes()));
					
if((decryptedValue1.contains(keyword))||(decryptedValue2.contains(keyword))||(decryptedValue3.contains(keyword))||(decryptedValue4.contains(keyword))||(fname.contains(keyword)))
					{
						found=found+1;
						String strQuery1 = "select * from cloudserver where fname='"+fname+"'";
						ResultSet rs11 = connection.createStatement().executeQuery(strQuery1);
							if(rs11.next()==true)
							 {
								
							%>
            </tr>
              <tr>
                <td height="28"><div align="center" class="style2 style26"><strong><%=total%></strong></div></td>
                <td><div align="center" class="style2 style26"><strong><%=fname%></strong></div></td>
                <td><div align="center" class="style2 style26"><strong><%=owner%></strong></div></td>
              </tr>
              <%
					
							}
							else
							{ 
								%>
              <h2>File Not Found !!!</h2>
              <%
							}
					
			  		  }
			    }
			 
			connection.close();
	}
	catch(Exception e)
	{
	out.println(e.getMessage());
	}
%>
          </table>
          <p>&nbsp;</p>
          <p><a href="endusermain.jsp">Back</a></p>
          <div align="justify"></div>
          <div class="clr"></div>
        </div>
        <div class="article">
          <h2>&nbsp;</h2>
          <p>&nbsp; </p>
          <div class="img"></div>
          <div class="clr"></div>
        </div>
        <p class="pages">&nbsp;</p>
      </div>
      <div class="sidebar">
        <div class="searchform">
          <form id="formsearch" name="formsearch" method="post" action="#">
            <span>
			
            <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search here" onBlur="if(this.value=='') this.value='Search here'" onFocus="if(this.value =='Search here' ) this.value=''" type="text" />
            </span>
            <input name="button_search" src="images/search.gif" class="button_search" type="image" />
          </form>
        </div>
        <div class="clr"></div>
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="endusermain.jsp">Home</a></li>
            <li><a href="index.html">Logout</a></li>
          </ul>
        </div>
        <div class="gadget">
          <h2 class="star">&nbsp;</h2>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2>&nbsp;</h2>
      </div>
      <div class="col c2">
        <h2>&nbsp;</h2>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
<div align=center></div>
</body>
</html>
