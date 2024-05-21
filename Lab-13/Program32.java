// WAP in Java to show AWT component button by setting its placement and window frame size
import java.awt.*;

public class Program32 {
    Program32(){
        Frame f = new Frame();
        Button button = new Button("Click me");
        button.setBounds(20, 30, 80, 50);
        button.setLocation(50, 50);
        f.setSize(new Dimension(500, 500));
        f.setTitle("Button Example");
        f.setLayout(null);
        f.add(button);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Program32 m = new Program32();
    }    
}
