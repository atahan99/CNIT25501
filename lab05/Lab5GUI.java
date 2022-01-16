/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dozdoga
 */
public class Lab5GUI extends JFrame implements ActionListener 
{
    JPanel pnlContain;
JTextField txtNumbers;
JLabel lblResult;
JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDecimal, btnPlusMinus;


public Lab5GUI()
{
Container cp = getContentPane();

txtNumbers = new JTextField(20);
btn1 = new JButton("1");
btn1.addActionListener(this);
btn2 = new JButton("2");
btn2.addActionListener(this);
btn3 = new JButton("3");
btn3.addActionListener(this);
btn4 = new JButton("4");
btn4.addActionListener(this);
btn5 = new JButton("5");
btn5.addActionListener(this);
btn6 = new JButton("6");
btn6.addActionListener(this);
btn7 = new JButton("7");
btn7.addActionListener(this);
btn8 = new JButton("8");
btn8.addActionListener(this);
btn9 = new JButton("9");
btn9.addActionListener(this);
btn0 = new JButton("0");
btn0.addActionListener(this);
btnDecimal = new JButton(".");
btnDecimal.addActionListener(this);
btnPlusMinus = new JButton("+/-");
btnPlusMinus.addActionListener(this);


btn1.addActionListener(this);


pnlContain = new JPanel();

pnlContain.add(btn1);
pnlContain.add(btn2);
pnlContain.add(btn3);
pnlContain.add(btn4);
pnlContain.add(btn5);
pnlContain.add(btn6);
pnlContain.add(btn7);
pnlContain.add(btn8);
pnlContain.add(btn9);
pnlContain.add(btn0);
pnlContain.add(btnDecimal);
pnlContain.add(btnPlusMinus);
pnlContain.add(lblResult);
cp.add(pnlContain);
}
    
    public void actionPerformed(ActionEvent evt)
{
if (evt.getSource() == btn1)
{ txtNumbers.setText("1");
}
if (evt.getSource() == btn2)
{ lblResult.setText("2");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn3)
{ lblResult.setText("3");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn4)
{ lblResult.setText("4");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn5)
{ lblResult.setText("5");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn6)
{ lblResult.setText("6");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn7)
{ lblResult.setText("7");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn8)
{ lblResult.setText("8");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn9)
{ lblResult.setText("9");
txtNumbers.requestFocus();
}
if (evt.getSource() == btn0)
{ lblResult.setText("0");
txtNumbers.requestFocus();
}
if (evt.getSource() == btnDecimal)
{ lblResult.setText(".");
txtNumbers.requestFocus();
}
if (evt.getSource() == btnPlusMinus)
{ lblResult.setText("+/-");
txtNumbers.requestFocus();
}
}


    public static void main(String [] args)
{
Lab5GUI my = new Lab5GUI();
my.setSize(500,500);
my.setVisible(true);
}
}
