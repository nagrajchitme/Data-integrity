<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ include file="connect.jsp"%>
<%@page
	import="java.util.*,java.security.Key,java.util.Random,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,org.bouncycastle.util.encoders.Base64"%>
<%@ page
	import="java.sql.*,java.util.Random,java.io.PrintStream,java.io.FileOutputStream,java.io.FileInputStream,java.security.DigestInputStream,java.math.BigInteger,java.security.MessageDigest,java.io.BufferedInputStream"%>
<%@ page
	import="java.security.Key,java.security.KeyPair,java.security.KeyPairGenerator,javax.crypto.Cipher"%>
<%@page
	import="java.util.*,java.text.SimpleDateFormat,java.util.Date,java.io.FileInputStream,java.io.FileOutputStream,java.io.PrintStream"%>
<%
   	String type=request.getParameter("user");
	
	application.setAttribute("type",type);
    try{
         
    	String dt="",ek="";
    	
		if(type.equalsIgnoreCase("data owner"))
		{
		
			String username=request.getParameter("userid");      
         	String Password=request.getParameter("pass");
			
			application.setAttribute("owner",username);
			
			String sql="SELECT * FROM owner where username='"+username+"' and password='"+Password+"'";
			Statement stmt = connection.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			
			if(rs.next()){
				
			SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

			Date now = new Date();
			String strDate = sdfDate.format(now);
			String strTime = sdfTime.format(now);
			String dt2 = strDate + "   " + strTime;
			String dt3=dt2.substring(0,10);
			ResultSet rs2=connection.createStatement().executeQuery("select * from keyupdate");
			if(rs2.next())
			{
			dt=rs2.getString(1);
			}
			ResultSet rs1=connection.createStatement().executeQuery("select * from cloudserver");
			while(rs1.next())
			{
			String dt1=(rs1.getString("dt")).substring(0,10);
			String owner=rs1.getString("ownername");
			String fname=rs1.getString("fname");
			KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
		Cipher encoder = Cipher.getInstance("RSA");
		KeyPair kp = kg.generateKeyPair();

		Key pubKey = kp.getPublic();

		byte[] pub = pubKey.getEncoded();
		//				System.out.println("PUBLIC KEY" + pub);

		String pk = String.valueOf(pub);
		
		
			if(!dt.equalsIgnoreCase(dt1))
			{
			if(dt.equalsIgnoreCase(dt3))
			{
			connection.createStatement().executeUpdate("update cloudserver set sk='"+pk+"',dt='"+dt2+"' where fname='"+fname+"' and ownername='"+owner+"'");
			connection.createStatement().executeUpdate("update tpa set sk='"+pk+"',dt='"+dt2+"' where fname='"+fname+"' and ownername='"+owner+"'");
			connection.createStatement().executeUpdate("update backupcloudserver set sk='"+pk+"',dt='"+dt2+"' where fname='"+fname+"' and ownername='"+owner+"'");
			
			
			
			}
			}
			
			}	/// while end
	
	response.sendRedirect("ownermain.jsp");	
	
			}//If end	
			
				
				
			
			else
			{
				response.sendRedirect("wronglogin.jsp");
			}
			
			
		}
		
		else if(type.equalsIgnoreCase("end user"))
		{
			
			String username=request.getParameter("userid");      
         	String Password=request.getParameter("pass");
			
			application.setAttribute("user",username);
			
			String sql="SELECT * FROM user where username='"+username+"' and password='"+Password+"'";
			Statement stmt = connection.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			
			if(rs.next())
			{
				
				response.sendRedirect("endusermain.jsp");
				}
				else
				{
				response.sendRedirect("wronglogin.jsp");
			}	}
			
	}
	catch(Exception e)
	{
		out.print(e);
	}
%>