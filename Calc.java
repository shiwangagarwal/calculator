import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;  
import java.lang.Math.*;
import java.util.Random;
class Calc extends JFrame
{
static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;
static JTextField t1;
static String operations;
static double result;
static double firstno;
static 	double secondno;

	public static void main(String... s)
	{
   JFrame f=new JFrame();
    t1=new JTextField();
    t1.setBounds(20,20,410,20);
    t1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e1){
   	
    }
});
    	f.add(t1);
   b1=new JButton("+");
   b1.setBounds(20,40,50,20);
  b1.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e){
	  
firstno=Double.parseDouble(t1.getText());
t1.setText(null);
operations=("+"); 
		}
  });
   
   f.add(b1);
   b2=new JButton("-");
   b2.setBounds(70,40,50,20);
   
   b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	firstno=Double.parseDouble(t1.getText());
t1.setText(null);
operations=("-"); 

   }
   });
   
   f.add(b2);
   b3=new JButton("#");
   b3.setBounds(120,40,50,20);
   b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	firstno=Double.parseDouble(t1.getText());
t1.setText(null);
operations=("#");
   }
   });
   f.add(b3);
   b4=new JButton("/");
   b4.setBounds(170,40,50,20);
   b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
firstno=Double.parseDouble(t1.getText());
t1.setText(null);
operations=("/"); 
   }
   });
   f.add(b4);
   b5=new JButton("=");
   b5.setBounds(220,40,50,20);
   b5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String answer;
secondno=Double.parseDouble(t1.getText());
if(operations=="+")
{
	result=firstno+secondno;
answer=String.format("%.2f",result);	
t1.setText(answer);
}
if(operations=="-")
{
	result=firstno-secondno;
answer=String.format("%.2f",result);	
t1.setText(answer);
}
if(operations=="*")
{
	result=firstno*secondno;
answer=String.format("%.2f",result);	
t1.setText(answer);
}
if(operations=="/")
{
	result=firstno/secondno;
answer=String.format("%.2f",result);	
t1.setText(answer);
}
   }
   });
   f.add(b5);
   b6=new JButton("1");
   b6.setBounds(270,40,50,20);
   b6.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	String qq=t1.getText()+b6.getText();
 		t1.setText(qq);

   }
   });
   f.add(b6);
   b7=new JButton("2");
   b7.setBounds(320,40,50,20);
   b7.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	String qq=t1.getText()+b7.getText();
 		t1.setText(qq);
t1.setText(qq);
   }
   });	
   f.add(b7);
   b8=new JButton("3");
   b8.setBounds(370,40,50,20);
   b8.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	String qq=t1.getText()+b8.getText();
 		t1.setText(qq);
t1.setText(qq);
   }
   });
   f.add(b8);
   b9=new JButton("sin");
   b9.setBounds(20,60,50,20);
   b9.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.sin(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b9);
   b10=new JButton("cos");
   b10.setBounds(70,60,50,20);
   b10.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.cos(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b10);
   b11=new JButton("tan");
   b11.setBounds(120,60,50,20);
   b11.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.tan(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b11);
   b12=new JButton("log");
   b12.setBounds(170,60,50,20);
   b12.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.log(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b12);
   b13=new JButton("C");
   b13.setBounds(220,60,50,20);
   b13.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
 		t1.setText(" ");

   }
   });
   f.add(b13);
   b14=new JButton("4");
   b14.setBounds(270,60,50,20);
   b14.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	String qq=t1.getText()+b14.getText();
 		t1.setText(qq);

   }
   });
   f.add(b14);
   b15=new JButton("5");
   b15.setBounds(320,60,50,20);
   b15.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b15.getText();
 		t1.setText(qq);
   }
   });
   f.add(b15);
   b16=new JButton("6");
   b16.setBounds(370,60,50,20);
   b16.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b15.getText();
 		t1.setText(qq);
   }
   });
   f.add(b16);
   b17=new JButton("asin");
   b17.setBounds(20,80,50,20);
   b17.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.asin(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b17);
   b18=new JButton("acos");
   b18.setBounds(20,80,50,20);
   b18.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.acos(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b18);
   b19=new JButton("atan");
   b19.setBounds(70,80,50,20);
   b19.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.atan(ops);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b19);
   b20=new JButton("x^2");
   b20.setBounds(120,80,50,20);
   b20.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.pow(ops,2);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b20);
   b21=new JButton("x^3");
   b21.setBounds(170,80,50,20);
   b21.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
double ops=Double.parseDouble(String.valueOf(t1.getText()));
ops=Math.pow(ops,3);
t1.setText(String.valueOf(ops)); 
   }
   });
   f.add(b21);
    b21=new JButton("7");
   b21.setBounds(220,80,50,20);
   b21.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b21.getText();
 		t1.setText(qq);
   }
   });
   f.add(b21);
    b22=new JButton("8");
   b22.setBounds(270,80,50,20);
   b22.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b22.getText();
 		t1.setText(qq);
   }
   });
   f.add(b22);
    b23=new JButton("9");
   b23.setBounds(320,80,50,20);
   b23.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b23.getText();
 		t1.setText(qq);
   }
   });
   f.add(b23);
    b24=new JButton("clr");
   b24.setBounds(20,100,50,20);
   b24.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
t1.setText(""); 
   }
   });
   f.add(b24);
    b25=new JButton("*");
   b25.setBounds(70,100,50,20);
   b25.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	firstno=Double.parseDouble(t1.getText());
t1.setText(null);
operations=("*");  
   }
   });
   f.add(b25);
    b26=new JButton("del");
   b26.setBounds(120,100,50,20);
   b26.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String bs=null;
if(t1.getText().length()>0)
{
	StringBuilder str=new StringBuilder(t1.getText());
	str.deleteCharAt(t1.getText().length() -1);
	bs=str.toString();
	t1.setText(bs);
}
   }
   });
   f.add(b26);
    b27=new JButton("0");
   b27.setBounds(170,100,50,20);
   b27.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
String qq=t1.getText()+b27.getText();
 		t1.setText(qq);
   }
   });
   f.add(b27);
  b28=new JButton("binary");
   b28.setBounds(220,100,50,20);
   b28.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	
int a=Integer.parseInt(t1.getText());
t1.setText(Integer.toString(a,2));
   }
   });
   f.add(b28);
   b29=new JButton("hexa");
   b29.setBounds(270,100,50,20);
   b29.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   	int a=Integer.parseInt(t1.getText());
t1.setText(Integer.toString(a,16));
   }
   });
   f.add(b29);
   f.setSize(700,700);
   f.setLayout(null);
   f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}