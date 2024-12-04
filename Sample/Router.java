import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Router<mouseEvent> implements ActionListener {
	String nodes;
	String d;
	String src1;
	String src2;
	String cls;
	String dnode;

	String nwnode;

	String tfarea;
	int halflen;
	int filelen;
	String half;
	String empt;

	String totallen;

	public JLabel selectfile;
	public JLabel title;
	public JLabel selectpath;
	public JLabel Availablenode;
	public JLabel pathdisplay;
	public JButton ok;
	public JButton cancel;
	public JTextArea tfnw;
	public JScrollPane panenwm;
	public JTextArea tfnw1;
	public JScrollPane panenwm1;
	public JTextArea tfnw2;
	public JScrollPane panenwm2;
	public JTextArea tfnw3;
	public JScrollPane panenwm3;

	public Font f2 = new Font("Times new roman", Font.BOLD, 18);

	public Font f0 = new Font("Verdana", Font.BOLD, 35);
	public Font f = new Font("Times New roman", Font.BOLD, 18);
	public Font f3 = new Font("Times New roman", Font.BOLD, 15);
	public Font f1 = new Font("Calibrie", Font.BOLD + Font.ITALIC, 25);
	public JLabel l = new JLabel("Received File");
	public JLabel c1 = new JLabel("Router");
	public JLabel l1 = new JLabel("Server A");
	public JLabel l2 = new JLabel("Server B");
	public JLabel l3 = new JLabel("Destination");
	public JLabel Tl1 = new JLabel("");
	public JLabel Tl2 = new JLabel("");
	public JLabel Tl3 = new JLabel("");

	public JLabel Tl4 = new JLabel("");
	public JLabel Tl5 = new JLabel("");
	public JLabel Tl6 = new JLabel("");

	public JLabel Tl7 = new JLabel("");
	public JLabel Tl8 = new JLabel("");
	public JLabel Tl9 = new JLabel("");

	public JTextField T1 = new JTextField("");
	public JScrollPane pane = new JScrollPane();
	public JScrollPane pane1 = new JScrollPane();
	public JScrollPane pane2 = new JScrollPane();
	public JTextArea tf = new JTextArea();
	public JTextArea tf1 = new JTextArea();
	public JTextArea tf2 = new JTextArea();
	public JButton graph = new JButton("Interconnection Data-Center");

	public JButton Sub = new JButton("Refresh");
	public JButton rt = new JButton("Routing Table");
	public JButton drt = new JButton("Backup Routing Table");
	public JButton clear = new JButton("Clear");
	public JButton Exit = new JButton("Exit");
	public JFrame jf;
	public Container c;
	JLabel imageLabel = new JLabel();
	JLabel imageLl = new JLabel();

	JLabel imageLla = new JLabel();
	JLabel imageLlb = new JLabel();
	JLabel imageLlc = new JLabel();
	JLabel imageLld = new JLabel();
	JLabel imageLle = new JLabel();
	JLabel imageLlf = new JLabel();
	JLabel imageLlg = new JLabel();
	JLabel imageLlh = new JLabel();
	JLabel imageLli = new JLabel();
	JLabel imageLlj = new JLabel();

	JLabel linecls = new JLabel();
	JLabel linecls1 = new JLabel();
	JLabel linecls2 = new JLabel();
	JLabel linecls3 = new JLabel();
	JLabel linecls4 = new JLabel();
	JLabel linecls5 = new JLabel();
	JLabel linecls6 = new JLabel();
	JLabel linecls7 = new JLabel();

	JLabel imagecls = new JLabel();
	JLabel imagecls1 = new JLabel();
	JLabel imagecls2 = new JLabel();
	JLabel imagecls3 = new JLabel();
	JLabel imagecls4 = new JLabel();
	JLabel imagecls5 = new JLabel();
	JLabel imagecls6 = new JLabel();
	JLabel imagecls7 = new JLabel();
	JLabel imagecls8 = new JLabel();
	JLabel imagecls9 = new JLabel();

	JLabel backwrdcls = new JLabel();
	JLabel backwrdcls1 = new JLabel();
	JLabel backwrdcls2 = new JLabel();
	JLabel backwrdcls3 = new JLabel();
	JLabel backwrdcls4 = new JLabel();
	JLabel backwrdcls5 = new JLabel();

	JLabel forwrdcls = new JLabel();
	JLabel forwrdcls1 = new JLabel();
	JLabel forwrdcls2 = new JLabel();
	JLabel forwrdcls3 = new JLabel();
	JLabel forwrdcls4 = new JLabel();
	JLabel forwrdcls5 = new JLabel();
	JLabel forwrdcls6 = new JLabel();
	JLabel forwrdcls7 = new JLabel();

	JLabel imagedes = new JLabel();
	JLabel imagedes1 = new JLabel();
	JLabel imagedes2 = new JLabel();
	JLabel imagedes3 = new JLabel();
	JLabel imagedes4 = new JLabel();
	JLabel imagedes5 = new JLabel();
	JLabel imagedes6 = new JLabel();
	JLabel imagedes7 = new JLabel();
	JLabel imagedes8 = new JLabel();
	JLabel imagedes9 = new JLabel();

	JLabel finaldes = new JLabel();
	JLabel finaldes1 = new JLabel();
	JLabel finaldes2 = new JLabel();
	JLabel finaldes3 = new JLabel();
	JLabel finaldes4 = new JLabel();
	JLabel finaldes5 = new JLabel();
	JLabel finaldes6 = new JLabel();
	JLabel finaldes7 = new JLabel();
	JLabel finaldes8 = new JLabel();
	JLabel finaldes9 = new JLabel();

	JLabel ill = new JLabel();
	JLabel atob = new JLabel();
	JLabel btoc = new JLabel();
	JLabel to1 = new JLabel();

	public JLabel n1 = new JLabel("Node    A");
	public JLabel n2 = new JLabel("Node    B");
	public JLabel n3 = new JLabel("Node    C");
	public JLabel n4 = new JLabel("Node    D");
	public JLabel n5 = new JLabel("Node     E");
	public JLabel n6 = new JLabel("Node      F");
	public JLabel n7 = new JLabel("Node    G");
	public JLabel n8 = new JLabel("Node    H");
	public JLabel n9 = new JLabel("Node    I");
	public JLabel n10 = new JLabel("Node   J");

	JLabel image1 = new JLabel();
	JLabel hs = new JLabel();
	JLabel hs1 = new JLabel();
	JLabel image2 = new JLabel();
	JLabel image3 = new JLabel();
	JLabel image4 = new JLabel();
	JLabel image5 = new JLabel();
	JLabel image6 = new JLabel();
	JLabel image7 = new JLabel();
	JLabel image8 = new JLabel();
	JLabel image9 = new JLabel();
	JLabel image10 = new JLabel();
	JLabel commannodes = new JLabel("-Common Node");

	JLabel srcnodes = new JLabel("-Source Node");
	JLabel clusternodes = new JLabel("Interconnection Node");
	JLabel desnodes = new JLabel("-Destination Node");

	JLabel line1 = new JLabel();
	JLabel line2 = new JLabel();
	JLabel line3 = new JLabel();
	JLabel line4 = new JLabel();
	JLabel line5 = new JLabel();
	JLabel line6 = new JLabel();
	JLabel frdlbl = new JLabel();
	JLabel frdlbl1 = new JLabel();
	JLabel etof = new JLabel();
	JLabel etof1 = new JLabel();

	JLabel line7 = new JLabel();
	JLabel line8 = new JLabel();

	JLabel linefrwd1 = new JLabel();
	JLabel linefrwd2 = new JLabel();
	JLabel linefrwd3 = new JLabel();
	JLabel linefrwd4 = new JLabel();
	JLabel linefrwd5 = new JLabel();
	JLabel linefrwd6 = new JLabel();

	JLabel linebkwd1 = new JLabel();
	JLabel linebkwd2 = new JLabel();
	JLabel linebkwd3 = new JLabel();
	JLabel linebkwd4 = new JLabel();
	JLabel linebkwd5 = new JLabel();
	JLabel linebkwd6 = new JLabel();

	JLabel refresh1 = new JLabel();
	JLabel refresh2 = new JLabel();
	JLabel refresh3 = new JLabel();
	JLabel refresh4 = new JLabel();
	JLabel refresh5 = new JLabel();
	JLabel refresh6 = new JLabel();
	JLabel refresh7 = new JLabel();
	JLabel refresh8 = new JLabel();
	JLabel refresh9 = new JLabel();
	JLabel refresh10 = new JLabel();

	JLabel line11 = new JLabel();
	JLabel line21 = new JLabel();
	JLabel line31 = new JLabel();
	JLabel line41 = new JLabel();
	JLabel line51 = new JLabel();
	JLabel line61 = new JLabel();
	JLabel line71 = new JLabel();
	JLabel line81 = new JLabel();

	JLabel linefrwd11 = new JLabel();
	JLabel linefrwd21 = new JLabel();
	JLabel linefrwd31 = new JLabel();
	JLabel linefrwd41 = new JLabel();
	JLabel linefrwd51 = new JLabel();
	JLabel linefrwd61 = new JLabel();

	JLabel linebkwd11 = new JLabel();
	JLabel linebkwd21 = new JLabel();
	JLabel linebkwd31 = new JLabel();
	JLabel linebkwd41 = new JLabel();
	JLabel linebkwd51 = new JLabel();
	JLabel linebkwd61 = new JLabel();

	String bytes;
	String bytess;

	public Router() {
		ImageIcon v1 = new ImageIcon(this.getClass().getResource(
				"greenbutt copy.png"));
		srcnodes.setIcon(v1);
		ImageIcon clus2 = new ImageIcon(this.getClass().getResource("rose.png"));
		clusternodes.setIcon(clus2);
		ImageIcon result1 = new ImageIcon(this.getClass()
				.getResource("red.png"));
		desnodes.setIcon(result1);
		ImageIcon b1 = new ImageIcon(this.getClass().getResource("aaa.PNG"));

		image1.setIcon(b1);
		image2.setIcon(b1);
		image3.setIcon(b1);
		image4.setIcon(b1);
		image5.setIcon(b1);
		image6.setIcon(b1);
		image7.setIcon(b1);
		image8.setIcon(b1);
		image9.setIcon(b1);
		image10.setIcon(b1);
		commannodes.setIcon(b1);
		commannodes.setFont(f3);
		commannodes.setForeground(Color.YELLOW);
		srcnodes.setFont(f3);
		srcnodes.setForeground(Color.GREEN);
		clusternodes.setFont(f3);
		clusternodes.setForeground(Color.MAGENTA);
		desnodes.setFont(f3);
		desnodes.setForeground(Color.RED);

		image1.setBounds(260, 70, 120, 100);
		image2.setBounds(510, 70, 120, 100);
		image3.setBounds(760, 70, 120, 100);
		image4.setBounds(130, 210, 120, 100);
		image5.setBounds(380, 210, 120, 100);
		image6.setBounds(630, 210, 120, 100);
		image10.setBounds(880, 210, 120, 100);
		image7.setBounds(240, 345, 120, 100);
		image8.setBounds(500, 345, 120, 100);
		image9.setBounds(750, 345, 120, 100);

		commannodes.setBounds(860, -25, 220, 100);

		srcnodes.setBounds(860, 5, 220, 100);
		clusternodes.setBounds(860, 35, 220, 100);
		desnodes.setBounds(860, 65, 220, 100);

		ImageIcon line = new ImageIcon(this.getClass().getResource("line.PNG"));

		line1.setIcon(line);
		line2.setIcon(line);
		line3.setIcon(line);
		line4.setIcon(line);
		line5.setIcon(line);
		line6.setIcon(line);
		line7.setIcon(line);

		line1.setBounds(270, 70, 500, 100);
		line2.setBounds(520, 70, 500, 100);
		line3.setBounds(140, 210, 500, 100);
		line4.setBounds(390, 210, 500, 100);
		line5.setBounds(635, 210, 500, 100);
		line6.setBounds(265, 345, 500, 100);
		line7.setBounds(520, 345, 500, 100);

		ImageIcon linefrwd = new ImageIcon(this.getClass().getResource(
				"lineforward.PNG"));
		linefrwd1.setIcon(linefrwd);
		linefrwd2.setIcon(linefrwd);
		linefrwd3.setIcon(linefrwd);
		linefrwd4.setIcon(linefrwd);
		linefrwd5.setIcon(linefrwd);
		linefrwd6.setIcon(linefrwd);

		linefrwd1.setBounds(145, 99, 500, 180);
		linefrwd2.setBounds(395, 99, 500, 180);
		linefrwd3.setBounds(640, 99, 500, 180);
		linefrwd4.setBounds(260, 235, 500, 180);
		linefrwd5.setBounds(510, 235, 500, 180);
		linefrwd6.setBounds(770, 235, 500, 180);

		ImageIcon linebkwd = new ImageIcon(this.getClass().getResource(
				"linebackward.PNG"));
		linebkwd1.setIcon(linebkwd);
		linebkwd2.setIcon(linebkwd);
		linebkwd3.setIcon(linebkwd);
		linebkwd4.setIcon(linebkwd);
		linebkwd5.setIcon(linebkwd);
		linebkwd6.setIcon(linebkwd);

		linebkwd1.setBounds(268, 100, 500, 180);
		linebkwd2.setBounds(520, 100, 500, 180);
		linebkwd3.setBounds(770, 100, 500, 180);
		linebkwd4.setBounds(135, 240, 500, 180);
		linebkwd5.setBounds(395, 240, 500, 180);
		linebkwd6.setBounds(645, 240, 500, 180);

		jf = new JFrame(
				"Router :: A Cross Layer Approach for IP Network Protection ");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(1100, 600);
		c.setBackground(new Color(200, 150, 50));

		l.setBounds(650, 100, 200, 50);

		c1.setFont(f0);

		c1.setBounds(440, 5, 450, 50);
		c1.setForeground(Color.MAGENTA);

		n1.setBounds(250, 70, 150, 50);
		n1.setForeground(Color.CYAN);
		n1.setFont(f);
		n2.setBounds(480, 70, 150, 50);
		n2.setForeground(Color.CYAN);
		n2.setFont(f);
		n3.setBounds(710, 70, 150, 50);
		n3.setForeground(Color.CYAN);
		n3.setFont(f);
		n4.setBounds(60, 250, 150, 50);
		n4.setForeground(Color.CYAN);
		n4.setFont(f);
		n5.setBounds(355, 250, 150, 50);
		n5.setForeground(Color.CYAN);
		n5.setFont(f);
		n6.setBounds(600, 250, 150, 50);
		n6.setForeground(Color.CYAN);
		n6.setFont(f);
		n7.setBounds(850, 250, 150, 50);
		n7.setForeground(Color.CYAN);
		n7.setFont(f);
		n8.setBounds(200, 400, 150, 50);
		n8.setForeground(Color.CYAN);
		n8.setFont(f);
		n9.setBounds(450, 400, 150, 50);
		n9.setForeground(Color.CYAN);
		n9.setFont(f);
		n10.setBounds(700, 400, 150, 50);
		n10.setForeground(Color.CYAN);
		n10.setFont(f);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);

		l.setForeground(Color.GREEN);
		l1.setForeground(Color.RED);
		l2.setForeground(Color.RED);
		l3.setForeground(Color.RED);

		Tl1.setBounds(110, 210, 50, 25);

		Tl2.setBounds(110, 390, 50, 25);
		Tl3.setBounds(110, 570, 50, 25);

		Tl4.setBounds(380, 210, 50, 25);

		Tl5.setBounds(380, 390, 50, 25);
		Tl6.setBounds(380, 570, 50, 25);

		Tl7.setBounds(640, 210, 50, 25);

		Tl8.setBounds(640, 390, 50, 25);
		Tl9.setBounds(640, 570, 50, 25);

		Tl1.setBackground(new Color(250, 215, 150));
		Tl2.setBackground(new Color(250, 215, 150));
		Tl3.setBackground(new Color(250, 215, 150));
		Tl4.setBackground(new Color(250, 215, 150));
		Tl5.setBackground(new Color(250, 215, 150));
		Tl6.setBackground(new Color(250, 215, 150));
		Tl7.setBackground(new Color(250, 215, 150));
		Tl8.setBackground(new Color(250, 215, 150));
		Tl9.setBackground(new Color(250, 215, 150));

		l1.setBounds(120, 425, 250, 50);
		l2.setBounds(450, 425, 250, 50);
		l3.setBounds(800, 425, 250, 50);

		tf.setColumns(20);
		tf.setRows(10);
		tf.setForeground(new Color(120, 0, 0));
		tf.setFont(f);
		tf.setBackground(new Color(246, 233, 191));
		tf.setName("tf");

		pane.setBounds(40, 470, 250, 180);
		pane.setName("pane");
		pane.setViewportView(tf);

		tf1.setColumns(20);
		tf1.setRows(10);
		tf1.setForeground(new Color(120, 0, 0));
		tf1.setFont(f);
		tf1.setBackground(new Color(246, 233, 191));
		tf1.setName("tf");
		pane1.setBounds(380, 470, 250, 180);
		pane1.setName("pane");
		pane1.setViewportView(tf1);

		tf2.setColumns(20);
		tf2.setRows(10);
		tf2.setForeground(new Color(120, 0, 0));
		tf2.setFont(f);
		tf2.setBackground(new Color(246, 233, 191));
		tf2.setName("tf");
		pane2.setBounds(720, 470, 250, 180);
		pane2.setName("pane");
		pane2.setViewportView(tf2);

		l.setFont(f);
		T1.setFont(f);
		Sub.setFont(f);
		Exit.setFont(f);
		clear.setFont(f);

		graph.setFont(f);
		T1.setBounds(200, 100, 350, 50);
		rt.setBounds(195, 490, 150, 30);
		drt.setBounds(10, 490, 180, 30);
		Sub.setBounds(350, 490, 120, 30);
		Exit.setBounds(510, 490, 150, 30);
		Exit.setBackground(new Color(200, 232, 158));
		graph.setBounds(260, 670, 250, 30);
		graph.setBackground(new Color(151, 232, 158));
		graph.addActionListener(this);
		clear.setBounds(740, 670, 150, 30);
		clear.setBackground(new Color(151, 232, 158));
		clear.addActionListener(this);

		T1.setBackground(Color.white);
		T1.setForeground(Color.white);
		Exit.setForeground(Color.BLACK);
		rt.setForeground(Color.BLACK);
		drt.setForeground(Color.BLACK);
		// c.add(graph);
		// c.add(clear);
		c.add(Exit);
		// c.add(l1);
		// c.add(l2);
		// c.add(l3);
		// c.add(pane, BorderLayout.CENTER);
		// c.add(pane1, BorderLayout.CENTER);
		// c.add(pane2, BorderLayout.CENTER);
		c.add(Tl1);
		c.add(Tl2);
		c.add(Tl3);
		c.add(Sub);
		c.add(Tl4);
		c.add(Tl5);
		c.add(Tl6);

		c.add(Tl7);
		c.add(Tl8);
		c.add(Tl9);
		c.add(n1);
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		c.add(n7);
		c.add(n8);
		c.add(n9);
		c.add(n10);
		c.add(rt);
		c.add(commannodes);
		c.add(srcnodes);
		c.add(clusternodes);
		c.add(desnodes);

		Sub.addActionListener(this);
		rt.addActionListener(this);
		drt.addActionListener(this);

		Sub.setBackground(new Color(151, 232, 158));

		jf.show();
		c.add(c1);

		// c.add(Exit);

		Sub.addActionListener(this);
		Exit.addActionListener(this);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

		int[] ports = new int[] { 501, 500, 10000, 5000, 5010 };

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();

		}

		c.add(image1);
		c.add(image2);
		c.add(image3);
		c.add(image4);
		c.add(image5);
		c.add(image6);
		c.add(image7);
		c.add(image8);
		c.add(image9);
		c.add(image10);
		c.add(drt);
		c.add(line1);
		c.add(line2);
		c.add(line3);
		c.add(line4);
		c.add(line5);
		c.add(line6);
		c.add(line7);

		c.add(linefrwd1);
		c.add(linefrwd2);
		c.add(linefrwd3);
		c.add(linefrwd4);
		c.add(linefrwd5);
		c.add(linefrwd6);

		c.add(linebkwd1);
		c.add(linebkwd2);
		c.add(linebkwd3);
		c.add(linebkwd4);
		c.add(linebkwd5);
		c.add(linebkwd6);

	}

	/*
	 * public JFrame jfnw; public Container cnw; public void nwmonitor() {
	 * 
	 * 
	 * 
	 * title= new JLabel("Monitoring of Interconnection Data-Center");
	 * 
	 * selectfile= new JLabel("Network in currently Available Node :");
	 * selectpath= new
	 * JLabel("Source   Nodes                                     :");
	 * Availablenode= new
	 * JLabel("Destination    Node                            :"); pathdisplay=
	 * new JLabel("Interconnection Nodes                                 :");
	 * 
	 * 
	 * ok = new JButton("Ok"); cancel = new JButton("Cancel"); tfnw = new
	 * JTextArea(" "); panenwm = new JScrollPane();
	 * 
	 * 
	 * 
	 * tfnw1 = new JTextArea(); panenwm1 = new JScrollPane(); tfnw2 = new
	 * JTextArea(); panenwm2 = new JScrollPane(); tfnw3 = new JTextArea();
	 * panenwm3 = new JScrollPane();
	 * 
	 * 
	 * 
	 * JPanel jp=new JPanel(); JPanel jp1=new JPanel();
	 * 
	 * 
	 * 
	 * jfnw = new JFrame("Network Monitoring"); cnw = jfnw.getContentPane();
	 * cnw.setLayout(null); jfnw.setSize(800,670);
	 * 
	 * cnw.setBackground(new Color(9,51,15));
	 * 
	 * 
	 * 
	 * JPanel jPanel1= new JPanel();
	 * 
	 * 
	 * jPanel1.setBackground(Color.DARK_GRAY);
	 * 
	 * JPanel jPanel2 = new JPanel();
	 * 
	 * 
	 * jPanel2.setBackground(new Color(157,159,141));
	 * 
	 * 
	 * 
	 * selectfile.setBounds(200,180,672,18); selectfile.setFont(f);
	 * selectfile.setForeground(Color.GREEN);
	 * 
	 * selectpath.setBounds(200,280,672,18); selectpath.setFont(f);
	 * selectpath.setForeground(Color.GREEN);
	 * 
	 * pathdisplay.setBounds(200,370,650,35);
	 * pathdisplay.setForeground(Color.GREEN); pathdisplay.setFont(f2);
	 * 
	 * Availablenode.setBounds(200,500,672,18);
	 * Availablenode.setForeground(Color.GREEN); Availablenode.setFont(f);
	 * 
	 * 
	 * 
	 * 
	 * title.setBounds(300,10,950,50);
	 * 
	 * title.setForeground(Color.ORANGE);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * jp.setBounds(120,125,810,500); jp.setBackground(Color.DARK_GRAY);
	 * 
	 * jp1.setBounds(118,123,814,504);
	 * 
	 * tfnw.setColumns(20); tfnw.setRows(10); tfnw.setFont(f);
	 * tfnw.setBackground(new Color(246,233,191));
	 * tfnw.setForeground(Color.BLUE); tfnw.setName("tfnw");
	 * panenwm.setBounds(510,150,400,80);
	 * 
	 * panenwm.setName("pane"); panenwm.setViewportView(tfnw);
	 * 
	 * 
	 * 
	 * ok.setBounds(300,560,150,35); ok.setFont(f);
	 * 
	 * cancel.setBounds(500,560,150,35); cancel.setFont(f);
	 * 
	 * tfnw1.setColumns(20); tfnw1.setRows(10); tfnw1.setFont(f);
	 * tfnw1.setBackground(new Color(246,233,191)); tfnw1.setForeground(new
	 * Color(120,0,0)); tfnw1.setName("tf"); panenwm1.setBounds(510,250,400,80);
	 * 
	 * panenwm1.setName("pane"); //panenwm1.setViewportView(tfnw1);
	 * 
	 * tfnw2.setColumns(20); tfnw2.setRows(10); tfnw2.setFont(f);
	 * tfnw2.setBackground(new Color(246,233,191)); tfnw2.setForeground(new
	 * Color(12,56,100)); tfnw2.setName("tf");
	 * panenwm2.setBounds(510,350,400,80); // panenwm2.setBackground(new
	 * Color(246,233,191)); panenwm2.setName("pane");
	 * //panenwm2.setViewportView(tfnw2);
	 * 
	 * tfnw3.setColumns(20); tfnw3.setRows(10); tfnw3.setFont(f);
	 * tfnw3.setBackground(new Color(246,233,191)); tfnw3.setForeground(new
	 * Color(120,40,180)); tfnw3.setName("tf");
	 * panenwm3.setBounds(510,450,400,80);
	 * 
	 * panenwm3.setName("pane"); //panenwm3.setViewportView(tfnw3);
	 * 
	 * 
	 * 
	 * 
	 * title.setFont(f1);
	 * 
	 * 
	 * cancel.addActionListener(this); ok.addActionListener(this);
	 * ok.setMnemonic(KeyEvent.VK_S); jfnw.show();
	 * 
	 * cnw.add(panenwm, BorderLayout.CENTER); cnw.add(panenwm1,
	 * BorderLayout.CENTER); cnw.add(panenwm2, BorderLayout.CENTER);
	 * cnw.add(panenwm3, BorderLayout.CENTER); cnw.add(selectfile);
	 * cnw.add(selectpath); cnw.add(pathdisplay); cnw.add(Availablenode);
	 * 
	 * 
	 * cnw.add(ok); cnw.add(cancel); cnw.add(title); cnw.add(jp); cnw.add(jp1);
	 * cancel.addActionListener(this); ok.addActionListener(this);
	 * jfnw.addWindowListener(new WindowAdapter() { public void
	 * windowClosing(WindowEvent win) { System.exit(0); } });
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	public static void main(String args[]) {
		Router r = new Router();

	}

	class PortListener implements Runnable {

		Router ip1;
		BufferedOutputStream bos = null;

		ServerSocket server;
		Socket connection;
		BufferedReader br = null;
		int port;
		Socket client = null;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() {

			
			
		 if (this.port == 501) {
				Connection connection;
				String in1, in2, in3, pno, s, d;
				String dest;
				try {

					ServerSocket server1 = new ServerSocket(501);
					Socket con;
					while (true) {
						con = server1.accept();
						DataInputStream dis = new DataInputStream(con
								.getInputStream());

						s = dis.readUTF();
						d = dis.readUTF();
						pno = dis.readUTF();
						in1 = dis.readUTF();
						in2 = dis.readUTF();
						in3 = dis.readUTF();

						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						connection = DriverManager
								.getConnection("jdbc:odbc:Risk");
						Statement stmt = connection.createStatement();

						if (pno.equals("501")) {
							String attacker = "B";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						
						if (pno.equals("502")) {
							String attacker = "C";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						if (pno.equals("503")) {
							String attacker = "D";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						
						if (pno.equals("504")) {
							String attacker = "E";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						
						if (pno.equals("505")) {
							String attacker = "F";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						
						if (pno.equals("506")) {
							String attacker = "G";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						
						if (pno.equals("507")) {
							String attacker = "H";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						if (pno.equals("508")) {
							String attacker = "I";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						if (pno.equals("509")) {
							String attacker = "J";

							String query = "update RoutingTable set INode1='"
									+ in1 + "',INode2='" + in2 + "',INode3='"
									+ in3 + "',Attacker='" + attacker
									+ "' where SNode='" + s + "' and Dest='"
									+ d + "'  ";
							stmt.executeUpdate(query);

						}
						

					}
				} catch (Exception e1) {
					System.out.println(e1);
				}

			}

			else if (this.port == 500) {
				Connection connection;
				String in1, in2, in3;
				String dest;
				try {

					ServerSocket server1 = new ServerSocket(500);
					Socket con;
					while (true) {
						con = server1.accept();
						DataInputStream dis = new DataInputStream(con
								.getInputStream());

						String s = dis.readUTF();

						String d = dis.readUTF();

						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						connection = DriverManager
								.getConnection("jdbc:odbc:Risk");
						Statement stmt = connection.createStatement();
						String query = "select * from RoutingTable where SNode='"
								+ s + "' and Dest='" + d + "'  ";
						ResultSet rs = stmt.executeQuery(query);

						if (rs.next() == true) {

							in1 = rs.getString(2);
							in2 = rs.getString(3);
							in3 = rs.getString(4);

							DataOutputStream dos1 = new DataOutputStream(con
									.getOutputStream());

							dos1.writeUTF(in1);
							dos1.writeUTF(in2);
							dos1.writeUTF(in3);

						}

					}
				} catch (Exception e1) {
					System.out.println(e1);
				}

			}

			else if (this.port == 10000) {
				try {

					ServerSocket server1 = new ServerSocket(10000);
					Socket con;
					while (true) {
						con = server1.accept();
						DataInputStream dis = new DataInputStream(con
								.getInputStream());

						String fname = dis.readUTF();

						String nname = dis.readUTF();

						String ct = dis.readUTF();

						if (nname.equalsIgnoreCase("J")) {
							
							String s = "A";
							String d="J";
							String attack="E";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{		
							

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(260, 70, 120, 100);

							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);

							ImageIcon backwrdcl = new ImageIcon(this.getClass()
									.getResource("linebackwardcls.png"));

							backwrdcls.setIcon(backwrdcl);
							backwrdcls.setBounds(270, 100, 500, 180);

							c.add(backwrdcls, 1);

							ImageIcon clus11 = new ImageIcon(this.getClass()
									.getResource("attacker.png"));

							imagecls.setIcon(clus11);
							imagecls.setBounds(380, 210, 120, 100);
							imagecls.setToolTipText(totallen);

							c.add(imagecls, 1);

							ImageIcon result111 = new ImageIcon(this.getClass()
									.getResource("red.png"));

							finaldes3.setIcon(result111);
							finaldes3.setBounds(750, 345, 120, 100);
							finaldes3.setToolTipText(totallen);

							c.add(finaldes3, 1);
							
							Socket j = new Socket("localhost", 33333);
							DataOutputStream dosj = new DataOutputStream(j
									.getOutputStream());
							dosj.writeUTF("E");
							dosj.writeUTF("B-F");
							dosj.writeUTF("J");
							
							int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

							if (choice == 0) {
			
								ImageIcon linecl = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								linecls.setIcon(linecl);
								linecls.setBounds(290, 70, 500, 100);

								c.add(linecls, 1);

								ImageIcon clus1 = new ImageIcon(this.getClass()
										.getResource("rose.png"));

								imagecls1.setIcon(clus1);
								imagecls1.setBounds(630, 210, 120, 100);
								imagecls1.setToolTipText(totallen);

								c.add(imagecls1, 1);

								// To F
								ImageIcon backwrdcl111 = new ImageIcon(this.getClass().getResource("linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdcl111);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								// To J
								ImageIcon forwrdcl = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								forwrdcls.setIcon(forwrdcl);
								forwrdcls.setBounds(645, 240, 500, 180);

								c.add(forwrdcls, 1);

								// To I

								ImageIcon result11 = new ImageIcon(this
										.getClass().getResource("red.png"));

								finaldes3.setIcon(result11);
								finaldes3.setBounds(750, 345, 120, 100);
								finaldes3.setToolTipText(totallen);

								c.add(finaldes3, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1008);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								
								
								
								}
							
								}
								else
								{
							//int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to continue");

//							if (choice == 0) {

								
								

								ImageIcon linecl = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								linecls.setIcon(linecl);
								linecls.setBounds(290, 70, 500, 100);

								c.add(linecls, 1);

								ImageIcon clus1 = new ImageIcon(this.getClass()
										.getResource("rose.png"));

								imagecls1.setIcon(clus1);
								imagecls1.setBounds(630, 210, 120, 100);
								imagecls1.setToolTipText(totallen);

								c.add(imagecls1, 1);

								// To F
								ImageIcon backwrdcl111 = new ImageIcon(this.getClass().getResource("linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdcl111);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								// To J
								ImageIcon forwrdcl = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								forwrdcls.setIcon(forwrdcl);
								forwrdcls.setBounds(645, 240, 500, 180);

								c.add(forwrdcls, 1);

								// To I

								ImageIcon result11 = new ImageIcon(this
										.getClass().getResource("red.png"));

								finaldes3.setIcon(result11);
								finaldes3.setBounds(750, 345, 120, 100);
								finaldes3.setToolTipText(totallen);

								c.add(finaldes3, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1008);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								
								
								

							}
							//if (choice == 1) {

								//JOptionPane.showMessageDialog(null,"Stopped the process");

							//}

					//FileOutputStream fos = new FileOutputStream("n1/"+ fname);
						//	fos.write(ct.getBytes());
						//	fos.close();
							}
							catch(Exception ej){System.out.println(ej);}
								

						}

						if (nname.equalsIgnoreCase("G")) {
							
							
							String s = "A";
							String d="G";
							String attack="C";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{		
							
							
							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(260, 70, 120, 100);

							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);

							ImageIcon linecl11 = new ImageIcon(this.getClass()
									.getResource("linecls.png"));

							linecls.setIcon(linecl11);
							linecls.setBounds(290, 70, 500, 100);

							c.add(linecls, 1);

							ImageIcon linecl = new ImageIcon(this.getClass()
									.getResource("linecls.png"));

							btoc.setIcon(linecl);
							btoc.setBounds(540, 70, 500, 100);

							c.add(btoc, 1);

							ImageIcon clus11 = new ImageIcon(this.getClass()
									.getResource("attacker.png"));

							imagecls.setIcon(clus11);
							imagecls.setBounds(755, 73, 500, 100);
							imagecls.setToolTipText(totallen);

							c.add(imagecls, 1);

							ImageIcon des1 = new ImageIcon(this.getClass()
									.getResource("red.png"));

							imagedes.setIcon(des1);
							imagedes.setBounds(880, 210, 120, 100);
							imagedes.setToolTipText(empt);
							Socket g = new Socket("localhost", 33333);
							DataOutputStream dosg = new DataOutputStream(g
									.getOutputStream());
							dosg.writeUTF("C");
							dosg.writeUTF("B-F");
							dosg.writeUTF("G");
							int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

							if (choice == 0) {
								
								
								ImageIcon linecl12 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								linecls.setIcon(linecl12);
								linecls.setBounds(290, 70, 500, 100);

								c.add(linecls, 1);

								ImageIcon clus1 = new ImageIcon(this.getClass()
										.getResource("rose.png"));

								imagecls1.setIcon(clus1);
								imagecls1.setBounds(630, 210, 120, 100);
								imagecls1.setToolTipText(totallen);

								c.add(imagecls1, 1);

								// To F
								ImageIcon backwrdc = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdc);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								// To G
								ImageIcon forwrdcl = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								forwrdcls.setIcon(forwrdcl);
								forwrdcls.setBounds(660, 210, 500, 100);

								c.add(forwrdcls, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1005);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								}
							
							
								}


								else
								{

								

								ImageIcon linecl12 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								linecls.setIcon(linecl12);
								linecls.setBounds(290, 70, 500, 100);

								c.add(linecls, 1);

								ImageIcon clus1 = new ImageIcon(this.getClass()
										.getResource("rose.png"));

								imagecls1.setIcon(clus1);
								imagecls1.setBounds(630, 210, 120, 100);
								imagecls1.setToolTipText(totallen);

								c.add(imagecls1, 1);

								// To F
								ImageIcon backwrdc = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdc);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								// To G
								ImageIcon forwrdcl = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								forwrdcls.setIcon(forwrdcl);
								forwrdcls.setBounds(660, 210, 500, 100);

								c.add(forwrdcls, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1005);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								}
								
							}
							catch(Exception eg){System.out.println(eg);}

							/*}
							if (choice == 1) {

								JOptionPane.showMessageDialog(null,
										"Stopped the process");
								ImageIcon linecl12 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								linecls.setIcon(linecl12);
								linecls.setBounds(290, 70, 500, 100);

								c.add(linecls, 1);

								ImageIcon linec111 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								atob.setIcon(linecl11);
								atob.setBounds(540, 70, 500, 100);

								c.add(atob, 1);

							}*/

						}

						if (nname.equalsIgnoreCase("I")) {
							
							
							
							String s = "A";
							String d="I";
							String attack="E";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{	
							
							
							
							

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(260, 70, 120, 100);

							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);

							ImageIcon backwrdcl = new ImageIcon(this.getClass()
									.getResource("linebackwardcls.png"));

							backwrdcls.setIcon(backwrdcl);
							backwrdcls.setBounds(270, 100, 500, 180);

							c.add(backwrdcls, 1);

							ImageIcon clus11 = new ImageIcon(this.getClass()
									.getResource("attacker.png"));

							imagecls.setIcon(clus11);
							imagecls.setBounds(380, 210, 120, 100);
							imagecls.setToolTipText(totallen);

							c.add(imagecls, 1);
							Socket i = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(i
									.getOutputStream());
							dosi.writeUTF("E");
							dosi.writeUTF("B-F");
							dosi.writeUTF("I");
							
							int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

							if (choice == 0) {
							
								ImageIcon backwrdcl2 = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								to1.setIcon(backwrdcl2);
								to1.setBounds(270, 100, 500, 180);

								c.add(to1, 1);

								ImageIcon backwrdcl1 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								backwrdcls.setIcon(backwrdcl1);
								backwrdcls.setBounds(290, 70, 500, 100);

								c.add(backwrdcls, 1);

								ImageIcon backwrdcl12 = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdcl2);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								ImageIcon frd = new ImageIcon(this.getClass()
										.getResource("lineforwardcls.png"));

								frdlbl.setIcon(frd);
								frdlbl.setBounds(510, 235, 500, 180);

								c.add(frdlbl, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1007);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								
								
								
								 }
								}
							//int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to continue");

							//if (choice == 0) {
								
								else
								{
								
								ImageIcon backwrdcl2 = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								to1.setIcon(backwrdcl2);
								to1.setBounds(270, 100, 500, 180);

								c.add(to1, 1);

								ImageIcon backwrdcl1 = new ImageIcon(this
										.getClass().getResource("linecls.png"));

								backwrdcls.setIcon(backwrdcl1);
								backwrdcls.setBounds(290, 70, 500, 100);

								c.add(backwrdcls, 1);

								ImageIcon backwrdcl12 = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls1.setIcon(backwrdcl2);
								backwrdcls1.setBounds(520, 100, 500, 180);

								c.add(backwrdcls1, 1);

								ImageIcon frd = new ImageIcon(this.getClass()
										.getResource("lineforwardcls.png"));

								frdlbl.setIcon(frd);
								frdlbl.setBounds(510, 235, 500, 180);

								c.add(frdlbl, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1007);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								}
								
								

							}
							catch(Exception ei){System.out.println(ei);}
//							if (choice == 1) {

								//JOptionPane.showMessageDialog(null,"Stopped the process");

							}

						

						if (nname.equalsIgnoreCase("H")) {
							
							
							String s = "A";
							String d="H";
							String attack="D";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{	
							

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							hs.setIcon(des);
							hs.setBounds(260, 70, 120, 100);

							hs.setToolTipText(empt);

							c.add(hs, 1);

							ImageIcon frd = new ImageIcon(this.getClass()
									.getResource("lineforwardcls.png"));

							frdlbl.setIcon(frd);
							frdlbl.setBounds(145, 99, 500, 180);

							c.add(frdlbl, 1);

							ImageIcon clus11 = new ImageIcon(this.getClass()
									.getResource("attacker.png"));

							imagecls.setIcon(clus11);
							imagecls.setBounds(125, 175, 500, 180);
							imagecls.setToolTipText(totallen);

							c.add(imagecls, 1);
							Socket i = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(i
									.getOutputStream());
							dosi.writeUTF("D");
							dosi.writeUTF("E");
							dosi.writeUTF("H");
							
							int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

							if (choice == 0) {

								ImageIcon backwrdcl = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls.setIcon(backwrdcl);
								backwrdcls.setBounds(270, 100, 500, 180);

								c.add(backwrdcls, 1);

								ImageIcon frd1 = new ImageIcon(this.getClass()
										.getResource("lineforwardcls.png"));

								frdlbl1.setIcon(frd1);
								frdlbl1.setBounds(260, 235, 500, 180);

								c.add(frdlbl1, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1006);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								
								
								}
							
								}
								else
								{

							//int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to continue");

							//if (choice == 0) {

							

								ImageIcon backwrdcl = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls.setIcon(backwrdcl);
								backwrdcls.setBounds(270, 100, 500, 180);

								c.add(backwrdcls, 1);

								ImageIcon frd1 = new ImageIcon(this.getClass()
										.getResource("lineforwardcls.png"));

								frdlbl1.setIcon(frd1);
								frdlbl1.setBounds(260, 235, 500, 180);

								c.add(frdlbl1, 1);
								
								byte b[] = ct.getBytes();

								String content = new String(b);

								Socket b1 = new Socket("localhost", 1006);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								
								
								}
								
							}
							catch(Exception eh){System.out.println(eh);}
								
							}
							

						//	}
							//if (choice == 1) {

								//JOptionPane.showMessageDialog(null,"Stopped the process");

							//}

						//}

						if (nname.equalsIgnoreCase("F")) {
							
							String s = "A";
							String d="F";
							String attack="B";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{	
							
							
							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							hs1.setIcon(des);
							hs1.setBounds(260, 70, 120, 100);
							hs1.setToolTipText(empt);
							c.add(hs1, 1);

							ImageIcon backwrdcl1 = new ImageIcon(this
									.getClass().getResource("linecls.png"));

							etof1.setIcon(backwrdcl1);
							etof1.setBounds(290, 70, 500, 100);

							c.add(etof1, 1);

							ImageIcon result = new ImageIcon(this.getClass()
									.getResource("red.png"));

							finaldes3.setIcon(result);
							finaldes3.setBounds(630, 210, 120, 100);
							finaldes3.setToolTipText(totallen);

							c.add(finaldes3, 1);

							ImageIcon clus11 = new ImageIcon(this.getClass()
									.getResource("attacker.png"));

							imagecls.setIcon(clus11);
							imagecls.setBounds(500, 35, 500, 180);
							imagecls.setToolTipText(totallen);
							c.add(imagecls, 1);
							
							Socket f = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(f
									.getOutputStream());
							dosi.writeUTF("B");
							dosi.writeUTF("E");
							dosi.writeUTF("F");
							JOptionPane.showMessageDialog(null,"Stopped the process");
							
							int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

							if (choice == 0) {
								
							
							ImageIcon backwrdcl = new ImageIcon(this
									.getClass().getResource(
											"linebackwardcls.png"));

							backwrdcls.setIcon(backwrdcl);
							backwrdcls.setBounds(270, 100, 500, 180);

							c.add(backwrdcls, 1);

							ImageIcon tof = new ImageIcon(this.getClass()
									.getResource("linecls.png"));

							etof.setIcon(tof);
							etof.setBounds(405, 210, 500, 100);

							c.add(etof, 1);
							
							
							byte b[] = ct.getBytes();
							String content = new String(b);
							
							Socket b1 = new Socket("localhost", 1004);
							DataOutputStream dosb = new DataOutputStream(b1
									.getOutputStream());
							dosb.writeUTF(fname);

							dosb.writeUTF(content);
							
							
								}
								}
							//int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to continue");

							//if (choice == 0) {
								else
								{

								

								ImageIcon backwrdcl = new ImageIcon(this
										.getClass().getResource(
												"linebackwardcls.png"));

								backwrdcls.setIcon(backwrdcl);
								backwrdcls.setBounds(270, 100, 500, 180);

								c.add(backwrdcls, 1);

								ImageIcon tof = new ImageIcon(this.getClass()
										.getResource("linecls.png"));

								etof.setIcon(tof);
								etof.setBounds(405, 210, 500, 100);

								c.add(etof, 1);
								
								
								byte b[] = ct.getBytes();
								String content = new String(b);
								
								Socket b1 = new Socket("localhost", 1004);
								DataOutputStream dosb = new DataOutputStream(b1
										.getOutputStream());
								dosb.writeUTF(fname);

								dosb.writeUTF(content);
								}
								

//							} else if (choice == 1) {

								//JOptionPane.showMessageDialog(null,"Stopped the process");
							}
							catch(Exception ef){System.out.println(ef);}

						}

						if (nname.equalsIgnoreCase("D")) {

							Socket f = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(f
									.getOutputStream());
							dosi.writeUTF("No");
							dosi.writeUTF("No");
							dosi.writeUTF("D");

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							hs1.setIcon(des);
							hs1.setBounds(260, 70, 120, 100);
							hs1.setToolTipText(empt);
							c.add(hs1, 1);

							ImageIcon frd = new ImageIcon(this.getClass()
									.getResource("lineforwardcls.png"));

							frdlbl.setIcon(frd);
							frdlbl.setBounds(145, 99, 500, 180);

							c.add(frdlbl, 1);

							ImageIcon result = new ImageIcon(this.getClass()
									.getResource("red.png"));

							finaldes2.setIcon(result);
							finaldes2.setBounds(130, 210, 120, 100);
							finaldes2.setToolTipText(totallen);

							c.add(finaldes2, 1);
							
							byte b[] = ct.getBytes();
							String content = new String(b);
							
							Socket b1 = new Socket("localhost", 1002);
							DataOutputStream dosb = new DataOutputStream(b1
									.getOutputStream());
							dosb.writeUTF(fname);

							dosb.writeUTF(content);

						}

						if (nname.equalsIgnoreCase("B")) {
							Socket f = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(f
									.getOutputStream());
							dosi.writeUTF("No");
							dosi.writeUTF("No");
							dosi.writeUTF("B");

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							hs1.setIcon(des);
							hs1.setBounds(260, 70, 120, 100);
							hs1.setToolTipText(empt);
							c.add(hs1, 1);

							ImageIcon atob1 = new ImageIcon(this.getClass()
									.getResource("linecls.png"));

							atob.setIcon(atob1);
							atob.setBounds(290, 70, 500, 100);

							c.add(atob, 1);

							ImageIcon result = new ImageIcon(this.getClass()
									.getResource("red.png"));

							finaldes1.setIcon(result);
							finaldes1.setBounds(510, 70, 120, 100);
							finaldes1.setToolTipText(totallen);

							c.add(finaldes1, 1);

							byte b[] = ct.getBytes();

							String content = new String(b);

							Socket b1 = new Socket("localhost", 1000);
							DataOutputStream dosb = new DataOutputStream(b1
									.getOutputStream());
							dosb.writeUTF(fname);

							dosb.writeUTF(content);

						}

						if (nname.equalsIgnoreCase("E")) {
							Socket f = new Socket("localhost", 33333);
							DataOutputStream dosi = new DataOutputStream(f
									.getOutputStream());
							dosi.writeUTF("No");
							dosi.writeUTF("No");
							dosi.writeUTF("E");

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("greenbutt copy.png"));

							hs1.setIcon(des);
							hs1.setBounds(260, 70, 120, 100);
							hs1.setToolTipText(empt);
							c.add(hs1, 1);

							ImageIcon backwrdcl = new ImageIcon(this.getClass()
									.getResource("linebackwardcls.png"));

							backwrdcls.setIcon(backwrdcl);
							backwrdcls.setBounds(270, 100, 500, 180);

							c.add(backwrdcls, 1);
							ImageIcon result = new ImageIcon(this.getClass()
									.getResource("red.png"));

							finaldes3.setIcon(result);
							finaldes3.setBounds(380, 210, 120, 100);
							finaldes3.setToolTipText(totallen);

							c.add(finaldes3, 1);

							
							byte b[] = ct.getBytes();
							String content = new String(b);
							
							Socket b1 = new Socket("localhost", 1003);
							DataOutputStream dosb = new DataOutputStream(b1
									.getOutputStream());
							dosb.writeUTF(fname);

							dosb.writeUTF(content);
							
						}

						if (nname.equalsIgnoreCase("C")) {

							String s = "A";
							String d="C";
							String attack="B";
							try {
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								Connection conc = DriverManager
										.getConnection("jdbc:odbc:Risk");
								Statement stmt = conc.createStatement();
								String query = "select * from RoutingTable where SNode='" + s + "' and Dest='" + d + "' and Attacker='" + attack + "'  ";
								ResultSet rs = stmt.executeQuery(query);

								if(rs.next()==true)	{							
								ImageIcon des = new ImageIcon(this.getClass()
										.getResource("greenbutt copy.png"));

								hs1.setIcon(des);
								hs1.setBounds(260, 70, 120, 100);
								hs1.setToolTipText(empt);
								c.add(hs1, 1);

								ImageIcon atob1 = new ImageIcon(this.getClass()
										.getResource("linecls.png"));

								atob.setIcon(atob1);
								atob.setBounds(290, 70, 500, 100);

								c.add(atob, 1);

								ImageIcon result = new ImageIcon(this
										.getClass().getResource("red.png"));

								finaldes1.setIcon(result);
								finaldes1.setBounds(760, 70, 120, 100);
								finaldes1.setToolTipText(totallen);

								c.add(finaldes1, 1);
								ImageIcon clus11 = new ImageIcon(this
										.getClass().getResource("attacker.png"));

								imagecls.setIcon(clus11);
								imagecls.setBounds(503, 76, 120, 100);
								imagecls.setToolTipText(totallen);
								c.add(imagecls, 1);
								Socket f = new Socket("localhost", 33333);
								DataOutputStream dosi = new DataOutputStream(
										f.getOutputStream());
								dosi.writeUTF("B");
								dosi.writeUTF("E-F");
								dosi.writeUTF("C");
								
								int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to apply Temporary isolation to the destination");

								if (choice == 0) {


									ImageIcon backwrdcl = new ImageIcon(this
											.getClass().getResource(
													"linebackwardcls.png"));

									backwrdcls.setIcon(backwrdcl);
									backwrdcls.setBounds(270, 100, 500, 180);

									c.add(backwrdcls, 1);

									ImageIcon tof = new ImageIcon(this
											.getClass().getResource(
													"linecls.png"));

									etof.setIcon(tof);
									etof.setBounds(405, 210, 500, 100);

									c.add(etof, 1);

									ImageIcon frd = new ImageIcon(this
											.getClass().getResource(
													"lineforwardcls.png"));

									frdlbl.setIcon(frd);
									frdlbl.setBounds(640, 99, 500, 180);

									c.add(frdlbl, 1);
									
									c.add(forwrdcls, 1);
									
									byte b[] = ct.getBytes();

									String content = new String(b);

									Socket b1 = new Socket("localhost", 1001);
									DataOutputStream dosb = new DataOutputStream(b1
											.getOutputStream());
									dosb.writeUTF(fname);

									dosb.writeUTF(content);
									
									
								
								}
}
else
{

								//int choice = JOptionPane.showConfirmDialog(null,"Attacker Found in the network!!! Do u want to continue");

								//if (choice == 0) {

									

									ImageIcon backwrdcl = new ImageIcon(this
											.getClass().getResource(
													"linebackwardcls.png"));

									backwrdcls.setIcon(backwrdcl);
									backwrdcls.setBounds(270, 100, 500, 180);

									c.add(backwrdcls, 1);

									ImageIcon tof = new ImageIcon(this
											.getClass().getResource(
													"linecls.png"));

									etof.setIcon(tof);
									etof.setBounds(405, 210, 500, 100);

									c.add(etof, 1);

									ImageIcon frd = new ImageIcon(this
											.getClass().getResource(
													"lineforwardcls.png"));

									frdlbl.setIcon(frd);
									frdlbl.setBounds(640, 99, 500, 180);

									c.add(frdlbl, 1);
									
									c.add(forwrdcls, 1);
									
									byte b[] = ct.getBytes();

									String content = new String(b);

									Socket b1 = new Socket("localhost", 1001);
									DataOutputStream dosb = new DataOutputStream(b1
											.getOutputStream());
									dosb.writeUTF(fname);

									dosb.writeUTF(content);
									
									
									

								//} else if (choice == 1) {

									//JOptionPane.showMessageDialog(null,"Stopped the process");
								//}
}

							} catch (Exception ex) {
								System.out.println(ex);
							}

						}

					}

				} catch (Exception e) {
					System.out.println(e);
				}

			}

			if (this.port == 5010) {

				try {

					server = new ServerSocket(port);

					while (true) {
						connection = server.accept();

						br = new BufferedReader(new InputStreamReader(
								new BufferedInputStream(connection
										.getInputStream())));

						String strLine;

						StringBuffer buffer = new StringBuffer();
						System.out.println("hi");
						while ((strLine = br.readLine()) != null) {

							System.out.println(strLine);
							buffer.append(strLine + "\n");

						}
						br.close();
						connection.close();
						tf2.setText(buffer.toString());
						// tfnw2.setText(buffer.toString());

						int len = buffer.length();
						bytess = Integer.toString(len);

						String desti = buffer.toString();

						d = desti.substring(0, 6);

						int empty = 00;

						empt = Integer.toString(empty);

						if (d.equals("Node A")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(260, 70, 120, 100);

							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node B")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(510, 70, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						{

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(760, 70, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}
						if (d.equals("Node D")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(130, 210, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node E")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(380, 210, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node F")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(630, 210, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node G")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(880, 210, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node H")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(240, 345, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node I")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(500, 345, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						if (d.equals("Node J")) {

							ImageIcon des = new ImageIcon(this.getClass()
									.getResource("destination.png"));

							imagedes.setIcon(des);
							imagedes.setBounds(750, 345, 120, 100);
							imagedes.setToolTipText(empt);

							c.add(imagedes, 1);
						}

						byte[] byteArray;
						Socket client = null;

					}
				} catch (IOException e) {

				} finally {

				}

			}

		}
	}

	public void actionPerformed(ActionEvent e)

	{

		if (e.getSource() == Sub) {

		}

		if (e.getSource() == Sub) {

			// nwmonitor();

			// tfnw.setText(nwnode.toString());

			// tfnw1.setText(nodes.toString());

			// tfnw3.setText(d.toString());
			String str = nodes + d;

			String cluster = src1 + src2 + d;
			if (cluster.equals("Node ANode BNode C")
					|| cluster.equals("Node BNode ANode C")) {
				cls = "Node B";
				tfnw2.setText(cls.toString());
			}
			if (cluster.equals("Node ANode BNode D")
					|| cluster.equals("Node BNode ANode D")) {
				dnode = "Node E";
				tfnw2.setText(dnode.toString());
				cls = "Node ED";
			}
			if (cluster.equals("Node ANode BNode E")
					|| cluster.equals("Node BNode ANode E")) {
				dnode = "Not Possible for Clustering Node";
				tfnw2.setText(dnode.toString());
				cls = "Node EX";
			}

			if (cluster.equals("Node ANode BNode F")
					|| cluster.equals("Node BNode ANode F")) {
				dnode = "Node E";
				tfnw2.setText(dnode.toString());
				cls = "Node EF";
			}
			if (cluster.equals("Node ANode BNode G")
					|| cluster.equals("Node BNode ANode G")) {
				cls = "Node E,Node F";
				tfnw2.setText(cls.toString());

			}
			if (cluster.equals("Node ANode BNode H")
					|| cluster.equals("Node BNode ANode H")) {
				dnode = "Node E";
				tfnw2.setText(dnode.toString());
				cls = "Node EH";

			}

			if (cluster.equals("Node ANode BNode I")
					|| cluster.equals("Node BNode ANode I")) {
				cls = "Node E";
				tfnw2.setText(cls.toString());
			}
			if (cluster.equals("Node ANode BNode J")
					|| cluster.equals("Node BNode ANode J")) {
				cls = "Node E,Node I";
				tfnw2.setText(cls.toString());
			}

			ImageIcon b4 = new ImageIcon(this.getClass().getResource(
					"refreshbutton.PNG"));

			refresh1.setIcon(b4);
			refresh2.setIcon(b4);
			refresh3.setIcon(b4);
			refresh4.setIcon(b4);
			refresh5.setIcon(b4);
			refresh6.setIcon(b4);
			refresh7.setIcon(b4);
			refresh8.setIcon(b4);
			refresh9.setIcon(b4);
			refresh10.setIcon(b4);

			// refresh1.setBounds(260,70,120,100);
			// refresh2.setBounds(510,70,120,100);
			refresh3.setBounds(760, 70, 120, 100);
			refresh4.setBounds(130, 210, 120, 100);
			refresh5.setBounds(380, 210, 120, 100);
			refresh6.setBounds(630, 210, 120, 100);
			refresh7.setBounds(880, 210, 120, 100);
			refresh8.setBounds(240, 345, 120, 100);
			refresh9.setBounds(500, 345, 120, 100);
			refresh10.setBounds(750, 345, 120, 100);

			ImageIcon line1 = new ImageIcon(this.getClass().getResource(
					"line.PNG"));

			line11.setIcon(line1);
			line21.setIcon(line1);
			line31.setIcon(line1);
			line41.setIcon(line1);
			line51.setIcon(line1);
			line61.setIcon(line1);
			line71.setIcon(line1);

			line11.setBounds(270, 70, 500, 100);
			line21.setBounds(520, 70, 500, 100);
			line31.setBounds(140, 210, 500, 100);
			line41.setBounds(390, 210, 500, 100);
			line51.setBounds(635, 210, 500, 100);
			line61.setBounds(265, 345, 500, 100);
			line71.setBounds(520, 345, 500, 100);

			c.add(line11, 1);
			c.add(line21, 1);
			c.add(line31, 1);
			c.add(line41, 1);
			c.add(line51, 1);
			c.add(line61, 1);
			c.add(line71, 1);

			ImageIcon linefrwd1 = new ImageIcon(this.getClass().getResource(
					"lineforward.PNG"));
			linefrwd11.setIcon(linefrwd1);
			linefrwd21.setIcon(linefrwd1);
			linefrwd31.setIcon(linefrwd1);
			linefrwd41.setIcon(linefrwd1);
			linefrwd51.setIcon(linefrwd1);
			linefrwd61.setIcon(linefrwd1);

			linefrwd11.setBounds(145, 99, 500, 180);
			linefrwd21.setBounds(395, 99, 500, 180);
			linefrwd31.setBounds(640, 99, 500, 180);
			linefrwd41.setBounds(260, 235, 500, 180);
			linefrwd51.setBounds(510, 235, 500, 180);
			linefrwd61.setBounds(770, 235, 500, 180);

			ImageIcon linebkwd1 = new ImageIcon(this.getClass().getResource(
					"linebackward.PNG"));
			linebkwd11.setIcon(linebkwd1);
			linebkwd21.setIcon(linebkwd1);
			linebkwd31.setIcon(linebkwd1);
			linebkwd41.setIcon(linebkwd1);
			linebkwd51.setIcon(linebkwd1);
			linebkwd61.setIcon(linebkwd1);

			linebkwd11.setBounds(268, 100, 500, 180);
			linebkwd21.setBounds(520, 100, 500, 180);
			linebkwd31.setBounds(770, 100, 500, 180);
			linebkwd41.setBounds(135, 240, 500, 180);
			linebkwd51.setBounds(395, 240, 500, 180);
			linebkwd61.setBounds(645, 240, 500, 180);

			c.add(linefrwd11, 1);
			c.add(linefrwd21, 1);
			c.add(linefrwd31, 1);
			c.add(linefrwd41, 1);
			c.add(linefrwd51, 1);
			c.add(linefrwd61, 1);

			c.add(linebkwd11, 1);
			c.add(linebkwd21, 1);
			c.add(linebkwd31, 1);
			c.add(linebkwd41, 1);
			c.add(linebkwd51, 1);
			c.add(linebkwd61, 1);

			// c.add(refresh1,1);
			// c.add(refresh2,1);
			c.add(refresh3, 1);
			c.add(refresh4, 1);
			c.add(refresh5, 1);
			c.add(refresh6, 1);
			c.add(refresh7, 1);
			c.add(refresh8, 1);
			c.add(refresh9, 1);
			c.add(refresh10, 1);
			ImageIcon v1 = new ImageIcon(this.getClass().getResource(
					"greenbutt copy.png"));

			refresh1.setIcon(v1);
			refresh1.setBounds(260, 70, 120, 100);
			refresh1.setToolTipText(half);
			refresh2.setIcon(v1);
			refresh2.setBounds(510, 70, 120, 100);
			refresh2.setToolTipText(half);

			c.add(refresh1, 1);

			c.add(refresh2, 1);

			System.out.println("Reset Method working");

		}

		if (e.getSource() == ok) {
			tf2.setText(tfarea.toString());

			if (cls.equals("Node ED"))

			{
				ImageIcon linecl = new ImageIcon(this.getClass().getResource(
						"linecls.png"));

				linecls2.setIcon(linecl);
				linecls2.setBounds(160, 210, 500, 100);

				c.add(linecls2, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls2.setIcon(clus);
				imagecls2.setBounds(380, 210, 120, 100);
				imagecls2.setToolTipText(totallen);
				c.add(imagecls2, 1);

				// Node D
				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes2.setIcon(result);
				finaldes2.setBounds(130, 210, 120, 100);
				finaldes2.setToolTipText(totallen);

				c.add(finaldes2, 1);

			}
			if (cls.equals("Node B")) {
				ImageIcon linecl = new ImageIcon(this.getClass().getResource(
						"linecls.png"));

				linecls.setIcon(linecl);
				linecls.setBounds(290, 70, 500, 100);

				c.add(linecls, 1);

				// ImageIcon linecl1 = new
				// ImageIcon(this.getClass().getResource("linecls.png"));

				linecls1.setIcon(linecl);
				linecls1.setBounds(540, 70, 500, 100);

				c.add(linecls1, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls1.setIcon(clus);
				imagecls1.setBounds(510, 70, 120, 100);
				imagecls1.setToolTipText(totallen);
				c.add(imagecls1, 1);

				// NodeB
				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes1.setIcon(result);
				finaldes1.setBounds(760, 70, 120, 100);
				finaldes1.setToolTipText(totallen);

				c.add(finaldes1, 1);

			}

			if (cls.equals("Node E")) {

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				// ImageIcon backwrdcl1 = new
				// ImageIcon(this.getClass().getResource("linebackwardcls.png"));

				backwrdcls1.setIcon(backwrdcl);
				backwrdcls1.setBounds(395, 240, 500, 180);

				c.add(backwrdcls1, 1);
				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls.setIcon(clus);
				imagecls.setBounds(380, 210, 120, 100);
				imagecls.setToolTipText(totallen);

				c.add(imagecls, 1);

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes.setIcon(result);
				finaldes.setBounds(500, 345, 120, 100);
				finaldes.setToolTipText(totallen);

				c.add(finaldes, 1);

			}

			if (cls.equals("Node EX")) {

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes3.setIcon(result);
				finaldes3.setBounds(380, 210, 120, 100);
				finaldes3.setToolTipText(totallen);

				c.add(finaldes3, 1);

			}
			if (cls.equals("Node EF")) {

				ImageIcon linecl = new ImageIcon(this.getClass().getResource(
						"linecls.png"));

				linecls.setIcon(linecl);
				linecls.setBounds(410, 210, 500, 100);

				c.add(linecls, 1);

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls.setIcon(clus);
				imagecls.setBounds(380, 210, 120, 100);
				imagecls.setToolTipText(totallen);

				c.add(imagecls, 1);

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes3.setIcon(result);
				finaldes3.setBounds(630, 210, 120, 100);
				finaldes3.setToolTipText(totallen);

				c.add(finaldes3, 1);

			}

			if (cls.equals("Node E,Node F")) {

				ImageIcon linecl = new ImageIcon(this.getClass().getResource(
						"linecls.png"));

				linecls.setIcon(linecl);
				linecls.setBounds(410, 210, 500, 100);

				c.add(linecls, 1);
				// ImageIcon linecl1 = new
				// ImageIcon(this.getClass().getResource("linecls.png"));

				linecls1.setIcon(linecl);
				linecls1.setBounds(655, 210, 500, 100);

				c.add(linecls1, 1);

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls.setIcon(clus);
				imagecls.setBounds(380, 210, 120, 100);
				imagecls.setToolTipText(totallen);

				c.add(imagecls, 1);
				// ImageIcon clus1 = new
				// ImageIcon(this.getClass().getResource("rose.png"));

				imagecls1.setIcon(clus);
				imagecls1.setBounds(630, 210, 120, 100);
				imagecls1.setToolTipText(totallen);

				c.add(imagecls1, 1);

				// Node F

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes3.setIcon(result);
				finaldes3.setBounds(880, 210, 120, 100);
				finaldes3.setToolTipText(totallen);

				c.add(finaldes3, 1);
			}

			if (cls.equals("Node EH")) {

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				// ImageIcon forwrdc2 = new
				// ImageIcon(this.getClass().getResource("lineforwardcls.png"));

				forwrdcls1.setIcon(forwrdcl);
				forwrdcls1.setBounds(260, 235, 500, 180);

				c.add(forwrdcls1, 1);

				// Node E
				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls.setIcon(clus);
				imagecls.setBounds(380, 210, 120, 100);
				imagecls.setToolTipText(totallen);

				c.add(imagecls, 1);

				// Node H

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes3.setIcon(result);
				finaldes3.setBounds(240, 345, 120, 100);
				finaldes3.setToolTipText(totallen);

				c.add(finaldes3, 1);
			}
			if (cls.equals("Node E,Node I")) {

				ImageIcon backwrdcl = new ImageIcon(this.getClass()
						.getResource("linebackwardcls.png"));

				backwrdcls.setIcon(backwrdcl);
				backwrdcls.setBounds(270, 100, 500, 180);

				c.add(backwrdcls, 1);
				// ImageIcon backwrdcl1 = new
				// ImageIcon(this.getClass().getResource("linebackwardcls.png"));

				backwrdcls1.setIcon(backwrdcl);
				backwrdcls1.setBounds(395, 240, 500, 180);

				c.add(backwrdcls1, 1);

				ImageIcon forwrdcl = new ImageIcon(this.getClass().getResource(
						"lineforwardcls.png"));

				forwrdcls.setIcon(forwrdcl);
				forwrdcls.setBounds(395, 99, 500, 180);

				c.add(forwrdcls, 1);

				ImageIcon linecl = new ImageIcon(this.getClass().getResource(
						"linecls.png"));

				linecls.setIcon(linecl);
				linecls.setBounds(520, 345, 500, 100);

				c.add(linecls, 1);

				ImageIcon clus = new ImageIcon(this.getClass().getResource(
						"rose.png"));

				imagecls.setIcon(clus);
				imagecls.setBounds(380, 210, 120, 100);
				imagecls.setToolTipText(totallen);

				c.add(imagecls, 1);
				// ImageIcon clus = new
				// ImageIcon(this.getClass().getResource("rose.png"));

				imagecls1.setIcon(clus);
				imagecls1.setBounds(500, 345, 120, 100);
				imagecls1.setToolTipText(totallen);

				c.add(imagecls1, 1);

				ImageIcon result = new ImageIcon(this.getClass().getResource(
						"red.png"));

				finaldes3.setIcon(result);
				finaldes3.setBounds(750, 345, 120, 100);
				finaldes3.setToolTipText(totallen);

				c.add(finaldes3, 1);
			}
			// jfnw.setVisible(false);

		}

		if (e.getSource() == rt) {
			try {

				Vector heading = new Vector();
				heading.addElement("Source");
				heading.addElement("INode1");
				heading.addElement("INode2");
				heading.addElement("INode3");
				heading.addElement("Destination");
				heading.addElement("Attacker");

				Vector data = new Vector();
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection connect = DriverManager
						.getConnection("jdbc:odbc:Risk");
				Statement stmt = connect.createStatement();
				String query = "SELECT * FROM RoutingTable order by Dest";
				ResultSet rs = stmt.executeQuery(query);

				ResultSetMetaData rsm = rs.getMetaData();
				int col = rsm.getColumnCount();
				while (rs.next()) {
					Vector row = new Vector();
					for (int i = 1; i <= col; i++) {
						row.addElement(rs.getObject(i));

					}

					data.addElement(row);
				}

				JTable table = new JTable(data, heading);

				pane = new JScrollPane(table);

				pane.setBounds(750, 470, 400, 160);
				c.add(pane);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		if (e.getSource() == cancel) {
			System.exit(0);

		}
		if (e.getSource() == drt) {
			
			Back_Up_Table f=new Back_Up_Table();

		    f.setSize(600,400);
		    f.setVisible(true);
		    f.setResizable(false);

		}

		if (e.getSource() == Exit) {

			jf.setVisible(false);

			System.exit(0);
		}

	}

	public void actionPerformed(mouseEvent e) {

		if (((Image) e).getSource() == imageLl) {
			imageLl.setToolTipText(bytes);
		}
		if (((Image) e).getSource() == imageLlb) {
			imageLlb.setToolTipText(bytess);
		}

	}

	public void setInvisible(boolean b) {

		// TODO Auto-generated method stub

	}

}
