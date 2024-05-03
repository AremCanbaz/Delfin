import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField UseriidTextfield = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel UseriidTextfieldlLabel = new JLabel("user ID");
    JLabel userPasswarJLabel = new JLabel("password");
    JLabel messageeJLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {

        logininfo = loginInfoOriginal;

        UseriidTextfieldlLabel.setBounds(50, 100, 75, 25);
        userPasswarJLabel.setBounds(50, 150, 75, 25);

        messageeJLabel.setBounds(125, 250, 250, 35);
        messageeJLabel.setFont(new Font(null, Font.ITALIC, 25));

        UseriidTextfield.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(100, 200, 100, 25);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);

        frame.add(UseriidTextfieldlLabel);
        frame.add(userPasswarJLabel);
        frame.add(messageeJLabel);
        frame.add(UseriidTextfield);
        frame.add(passwordField);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== resetButton){
            UseriidTextfield.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == loginButton){
            String userID = UseriidTextfield.getText();
            String password = String.valueOf(passwordField.getPassword());
            if( logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(password)) {
                    messageeJLabel.setForeground(Color.GREEN);
                    messageeJLabel.setText("Login Succesfull");
                    frame.dispose();
                    @SuppressWarnings("unused")
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {
                    messageeJLabel.setForeground(Color.red);
                    messageeJLabel.setText("Wrong Password");
                }
            }
            else {
                messageeJLabel.setForeground(Color.red);
                messageeJLabel.setText("User ID not found");
            }
        }
    }
}