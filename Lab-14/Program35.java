// WAP in Java to create JFrame, JButton and method call inside the jave constructor

import java.awt.Color;

import javax.swing.*;

class Program35{
    Program35(){
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Program35();
            }
        });
    }
}
