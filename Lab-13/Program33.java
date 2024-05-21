// WAP in Java to create a user's form GUI which has three fields i.e. first name, last name and DOB

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;     

public class Program33 {
    Program33(int w, int h){
        Frame f = new Frame();
        f.setSize(new Dimension(w, h));

        Font font1 = new Font("Calibri", Font.PLAIN, 16);

        Label tiLabel = new Label("Hello, I'm Morphius here.");
        tiLabel.setFont(new Font("Calibri",Font.BOLD, 36));
        Label stLabel = new Label("Enter your details below:");
        stLabel.setFont(new Font("Calibri",Font.BOLD, 24));

        tiLabel.setBounds(20, 50, 420, 40);
        stLabel.setBounds(20, 100, 400, 40);
        

        f.add(tiLabel);
        f.add(stLabel);

        Label l1 = new Label("First Name: ");
        l1.setFont(font1);
        Label l2 = new Label("Last Name: ");
        l2.setFont(font1);
        Label l3 = new Label("DOB: ");
        l3.setFont(font1);

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        
        Button redPill = new Button("Red Pill");
        Button bluePill = new Button("Blue Pill");

        // Setting positions of the components
        l1.setBounds(20, 150, 100, 30);  
        t1.setBounds(120, 150, 200, 30);
        l2.setBounds(20, 210, 100, 30);  
        t2.setBounds(120, 210, 200, 30);
        l3.setBounds(20, 280, 100, 30);  
        t3.setBounds(120, 280, 200, 30);
        

        // Decision Label
        Label deLabel = new Label("Choose Wisely");
        deLabel.setAlignment(1);
        deLabel.setFont(new Font("Calibri",Font.BOLD, 24));
        deLabel.setBounds(0, 350, w, 30);
        f.add(deLabel);

        Font bFont = new Font("Calibri", Font.BOLD, 16);
        redPill.setBounds(300, 400, 80, 40);
        redPill.setBackground(Color.RED);
        redPill.setForeground(Color.WHITE);
        redPill.setFont(bFont);

        bluePill.setBounds(100, 400, 80, 40);
        bluePill.setBackground(Color.BLUE);
        bluePill.setForeground(Color.WHITE);
        bluePill.setFont(bFont);

        // Add button events
        redPill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = t1.getText();
                f.removeAll();
                Label messageLabel = new Label("Welcome to Matrix " + name);
                messageLabel.setFont(new Font("Calibri", Font.BOLD, 24));
                messageLabel.setBounds(w/2 - 200, h/2 - 50, 450, 50);
                f.add(messageLabel);
                f.validate();
                f.repaint();
                System.out.println("red clicked");
            }
        });

        bluePill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f.removeAll();
                Label messageLabel = new Label("Go to your Dream ");
                messageLabel.setFont(new Font("Calibri", Font.BOLD, 24));
                messageLabel.setBounds(w/2 - 100, h/2 - 50, 250, 50);
                f.add(messageLabel); 
                f.validate();
                f.repaint();
                System.out.println("blue cliked");
            }
        });

        // Add the components to the frame
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(redPill);
        f.add(bluePill);

        f.setTitle("Matrix Signup Form");
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });  
    }

    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        Program33 m = new Program33(width, height);
    }    
}
