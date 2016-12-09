/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstobjectapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Emily
 */
public class Button implements ActionListener {
    protected JButton students;
    protected String quantity;
    protected University uni;
        
    public void ready (University uni) {
        uni= this.uni;
        JFrame panel = new JFrame ();
//        this.quantity= Integer.parseInt(quantity);
        
        panel.setBackground(Color.CYAN);
        students = new JButton ("Students");

        students.addActionListener(this);
        
        panel.getContentPane().add(students);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setTitle("Choose the number of whom you want to view");
        panel.setSize(400, 150);
        
        students.setSize(100,100);
        
        panel.getContentPane().add(BorderLayout.CENTER,students);
        panel.setLocationRelativeTo(null);
        panel.setVisible(true);
        
        students.addActionListener(this);
    } 
    
    
    @Override
    public void actionPerformed (ActionEvent event) {
        JFrame frame= new JFrame ();
        JPanel panel = new JPanel ();
        JLabel number = new JLabel ("The number of students in this university is:");
//        this.quantity= Integer.parseInt(quantity);
//        JLabel q = new JLabel (this);
        
        Font font = new Font ("Verdana", Font.PLAIN, 20);
        number.setFont(font);
        
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        
        panel.add(number);
        frame.add(panel);

        frame.setTitle("Students");
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

