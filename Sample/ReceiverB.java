

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.awt.event.*;
import java.sql.*;




public class ReceiverB extends JFrame implements ActionListener
{		
	
BufferedInputStream bis;
BufferedOutputStream bos;
byte[] data;
Socket socket;
ServerSocket serverSocket;
int in;
BufferedReader inm = null;
PrintWriter outm = null;	


      String dd;
	String lenString1;
    String lenString2;
    String lenString3;
    String lenString4;
    String len3;
    String len4;

    StringBuffer buffer=new StringBuffer();
    public JLabel T1a= new JLabel("");
	public JLabel T1b= new JLabel(" ");
	public Font f = new Font("Times new roman" , Font.BOLD , 22);	
	public Font f1 = new Font("Times new roman", Font.BOLD , 15);
	public Font f2 = new Font("Arial", Font.BOLD , 17);
	public Font f3 = new Font("Times new roman", Font.BOLD , 18);
	public JLabel T0= new JLabel(" RECEIVER B");
	public JLabel T1= new JLabel("File Receiving Path:");
	public JLabel T2= new JLabel("Server Status     :");
	public JLabel T3= new JLabel("File receive path ");
	public JLabel T4= new JLabel("running and waiting");
	public JLabel T5= new JLabel("Answer    :");
	
	public JCheckBox chk1=new JCheckBox("");
	public JComboBox TAreu = new JComboBox();
	
	public JButton btn = new JButton("View Routing Table");
	
	
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Open");
	public JButton btn2 = new JButton("Send");
	
	public JTextField txt=new JTextField();
	public JTextField txt1=new JTextField();
	public JTextField txt2=new JTextField();
	 JLabel imageLabel = new JLabel();

	JLabel receive = new JLabel();



	    JLabel image= new JLabel();
	    JLabel imageLabel1 = new JLabel();
	    JLabel image1= new JLabel();
	    
	    JLabel imageLabel2 = new JLabel();
	    JLabel image12= new JLabel();
	   public  JLabel tfld=new JLabel();
	    JPanel jp=new JPanel();
		JPanel jp1=new JPanel();
		public JLabel  leftButton;
		public JLabel  proxyques;
		
		public JLabel line;
		public JLabel line1;
		public JLabel imagelabel=new JLabel();
	public JFrame jf;
	public Container c;
	FileOutputStream fout;	
	 String fname,tot;
	 
	 JLabel l1,l2,l3,l4,l5,l6;
     JTextField t1,t3,t4,t5,t6,t2;
 
     JButton Reset,Register,Display;
     
	//String data;
	ReceiverB()
	{	
		StringBuffer buffer = new StringBuffer();
		
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("servermonitor.PNG"));
		imagelabel.setIcon(img1);
		imagelabel.setBounds(280,140,550,300);
		
		
		jf = new JFrame("ReceiverB::A Cross Layer Approach for IP Network Protection");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(650, 800);
		  jf.setResizable(false); 
		c.setBackground(new Color(200,134,5));
		T1a.setBounds(50, 5, 650,45);
		T1a.setFont(f);
		T1a.setForeground(Color.white);
		T1b.setBounds(155, 40, 450,45);
		T1b.setFont(f);
		T1b.setForeground(Color.white);
		
		
	
        l1=new JLabel();
        l1.setText("Source");
        t1=new JTextField(10);
        l2=new JLabel();
        l2.setText("Destination");
        t2=new JTextField(15);
        l3=new JLabel();
        l3.setText("INode1");
        t3=new JTextField(15);
        l4=new JLabel();
        l4.setText("INode2");
        t4=new JTextField(15);
        l5=new JLabel();
        l5.setText("INode3");
        t5=new JTextField(15);
        t5=new JTextField(15);
        
        
        
        
        Reset=new JButton("Reset");
        Register=new JButton("Update Routing");
	  Display=new JButton("Display INodes");


			
			l1.setBounds(90,160,100,25);
			t1.setBounds(200,160,100,25);
			l2.setBounds(90,200,100,25);
			t2.setBounds(200,200,100,25);
			l3.setBounds(90,240,100,25);
			t3.setBounds(200,240,100,25);
			l4.setBounds(90,280,100,25);
			t4.setBounds(200,280,100,25);
			
			l5.setBounds(90,320,100,25);
			t5.setBounds(200,320,100,25);

			Reset.setBounds(270,380,100,25);
			Register.setBounds(100,380,150,25);
			Display.setBounds(320,160,150,25);
			
		
	
		
		
		Border lineBorder = BorderFactory.createLineBorder(new Color(211,217,184));
		line = new JLabel();
		line.setBorder(lineBorder);
		line.setBounds(70,140,500,280);
		

		TitledBorder leftBorder = BorderFactory.createTitledBorder("File Transmit");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    leftButton = new JLabel();
	    leftButton.setBorder(leftBorder);
	    //leftBorder.paintBorder(c, g, x, y, width, height)setTitleColor(Color.magenta);
	    //TitledBorder.
	    leftButton.setBounds(70,200,500,300);
	    leftBorder.setTitleColor(Color.ORANGE);
		
		
	    TitledBorder leftBorder1 = BorderFactory.createTitledBorder("Received File");
	    leftBorder.setTitleJustification(TitledBorder.LEFT);
	    proxyques = new JLabel();
	    proxyques.setBorder(leftBorder1);
	    //leftBorder.paintBorder(c, g, x, y, width, height)setTitleColor(Color.magenta);
	    //TitledBorder.
	    proxyques.setBounds(70,430,500,280);
	    leftBorder1.setTitleColor(Color.ORANGE);
		
		
		
		T0.setBounds(200,80,350,45);
	    T0.setFont(f);
	   
	    T0.setForeground(Color.CYAN);
		T2.setBounds(105, 660, 250,45);
		T2.setFont(f1);
		T2.setForeground(new Color(211,217,184));
		
		T1.setForeground(new Color(211,217,184));
		T1.setBounds(105, 570, 300, 150);
		T1.setFont(f1);
		txt1.setBounds(105, 280, 300,25);
	    txt1.setFont(f1);
	    
		//txt1.setForeground(new Color(211,217,184));
		T3.setBounds(265, 625, 250,45);
		T3.setFont(f1);
		T3.setForeground(Color.cyan);
		
		T4.setBounds(255, 660, 350,45);
		T4.setFont(f1);
		T4.setForeground(Color.RED);
		
		T5.setBounds(125, 590, 250,45);
		T5.setFont(f3);
		T5.setForeground(new Color(211,217,184));
		txt2.setBounds(220, 595, 250,30);
		txt2.setForeground(Color.BLUE);
	    txt2.setFont(f1);
		//T6.setBounds(760, 70, 400,35);
		//T6.setFont(f2);
		//T6.setForeground(Color.RED);
		
		//T7.setBounds(760, 110, 400,35);
		//T7.setFont(f2);
		//T7.setForeground(Color.MAGENTA);
	  	 
		
		btn.setBounds(220,720,220,30);
		btn.setFont(f3);
		btn.setForeground(new Color(120,0,0));
		btn1.setBounds(420,277,120,30);
		btn1.setFont(f3);
		btn1.setForeground(new Color(120,0,0));
		btn2.setBounds(420,650,120,30);
		btn2.setFont(f3);
		btn2.setForeground(new Color(120,0,0));
		
		
		
		jp.setBounds(85,110,850,550);
		jp.setBackground(new Color(211,217,184));
		
		jp1.setBounds(80,105,860,560);
		//jp1.setBackground(Color.BLACK);
		
		
		
		

            receive.setBounds(445, 720, 250,45);
		receive.setForeground(Color.RED);

		
		txt.setBounds(260,150,180,25);
		txt.setForeground(Color.BLUE);
		txt.setFont(f1);
		TAreu.setBounds(650,550,200,35);
		
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		//TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(115, 470, 400, 200);
		
		tf.setColumns(20);
		
		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		tfld.setBounds(410,160,200,30);
		tfld.setFont(f2);
		tfld.setForeground(new Color(120,0,0));
		//btn1.addActionListener(this);
		btn.addActionListener(this);
		
		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S); 
		jf.show();
	 	
		c.add(T1a);
		c.add(T1b);
	 	//c.add(T1);
	 	//c.add(T2);
	 	c.add(line);
        c.add(receive);
        //c.add(btn);
		//c.add(T3);
		//c.add(T4);
		c.add(l1);c.add(t1);
		c.add(l2);c.add(t2);
		c.add(l3);c.add(t3);
		c.add(l4);c.add(t4);
		c.add(l5);c.add(t5);
		c.add(Reset);
		c.add(Register);
		c.add(Display);
		Display.addActionListener(this);
		Register.addActionListener(this);
		Reset.addActionListener(this);
		c.add(pane, BorderLayout.CENTER);
		
		c.add(T0);
		c.add(proxyques);
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		
		
		c.add(imagelabel);






try{
ServerSocket serverSocket = new ServerSocket(1000);
System.out.println("i am ReceiverB & listening...");




       
while(true)
{
socket = serverSocket.accept();
DataInputStream dis = new DataInputStream(socket.getInputStream());
String fname = dis.readUTF();
String ct = dis.readUTF();



FileOutputStream fos = new FileOutputStream("ReceiverB/"
		+ fname);
fos.write(ct.getBytes());
fos.close();

				       tf.setText(ct);


}

}
catch (IOException e)
{
e.printStackTrace();
}
		

	}	

	public static void main(String args[])
	{
		new ReceiverB();
	}
	
	

	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==Display)
		{
			
		try
		{
			
			String s=t1.getText();
			String d=t2.getText();
			
			Socket sd=new Socket("localhost",500);
			
			DataOutputStream dos = new DataOutputStream(sd.getOutputStream());
			
			dos.writeUTF(s);
			dos.writeUTF(d);
			
			
			DataInputStream	dis = new DataInputStream(sd.getInputStream());
			String in1 = dis.readUTF();
			String in2 = dis.readUTF();

			String in3 = dis.readUTF();
			
			t3.setText(in1);
			t4.setText(in2);
			t5.setText(in3);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

			
		}
		
		else if(ae.getSource()==Register)
		{
			try
			{
		
			String in1=t3.getText();
			String in2=t4.getText();
			String in3=t5.getText();
			String pno="501";
			
			Socket su=new Socket("localhost",501);
			
			DataOutputStream dos = new DataOutputStream(su.getOutputStream());
			
			dos.writeUTF(t1.getText());
			dos.writeUTF(t2.getText());
			
			dos.writeUTF(pno);
			dos.writeUTF(in1);
			dos.writeUTF(in2);
			dos.writeUTF(in3);
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
	
}





	
	
	

		


