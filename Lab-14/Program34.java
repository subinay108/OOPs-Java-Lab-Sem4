// WAP in Java to create a button and adding it on the JFrame object inside the main method

import java.awt.Color;

import javax.swing.*;

class Program34{
    public static void main(String[] args) {
        // Create a new JFrame Container
        JFrame jf = new JFrame("A Simple Swing Application");
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("Click me!");
        jb.setBounds(150, 130, 100, 40);

        jf.add(jb);
        jf.getContentPane().setBackground(Color.CYAN);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
