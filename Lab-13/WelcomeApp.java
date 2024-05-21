import java.awt.*;
import java.awt.event.*;

public class WelcomeApp extends Frame implements ActionListener {
    // Declare components
    private TextField nameField;
    private Button submitButton;
    private Label messageLabel;

    public WelcomeApp() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Initialize components
        nameField = new TextField(20);
        submitButton = new Button("Submit");
        messageLabel = new Label();

        // Add components to the frame
        add(new Label("Enter your name:"));
        add(nameField);
        add(submitButton);
        add(messageLabel);

        // Add action listener to the button
        submitButton.addActionListener(this);

        // Configure the frame
        setTitle("Welcome App");
        setSize(300, 200);
        setVisible(true);

        // Add window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Implement the actionPerformed method to handle button click
    public void actionPerformed(ActionEvent ae) {
        String name = nameField.getText();
        messageLabel.setText("Welcome " + name);
    }

    public static void main(String[] args) {
        new WelcomeApp();
    }
}
